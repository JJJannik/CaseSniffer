package de.jjjannik;

import com.google.gson.Gson;
import de.jjjannik.classes.Case;
import de.jjjannik.classes.collections.CSCollection;
import de.jjjannik.dao.CaseSnifferDao;
import de.jjjannik.services.CsFloatMarketService;
import de.jjjannik.services.CurrencyConvertion;
import de.jjjannik.services.ExpectedValueCalculator;
import de.jjjannik.services.SteamMarketService;
import de.jjjannik.utils.CsSnifferConfiguration;
import de.jjjannik.utils.HttpClient;
import lombok.extern.log4j.Log4j2;
import org.apache.log4j.PropertyConfigurator;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.jetbrains.annotations.NotNull;
import org.sqlite.SQLiteDataSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

@Log4j2
public class CaseSniffer {
    private static final int CSFLOAT_KEY_LENGTH = 32;
    private static final int STEAM_PROFILE_ID_LENGTH = 17;

    public static final Gson GSON = new Gson();
    private static CaseSnifferDao dao;

    public static void main(String[] args) {
        PropertyConfigurator.configure(CaseSniffer.class.getClassLoader().getResourceAsStream("log4j2.properties"));

        CsSnifferConfiguration config = handleClArgs(args);

        log.info("Found %d Cases with %d Items!".formatted(Case.values().length,
                Arrays.stream(Case.values())
                        .map(Case::getCollectionSkins)
                        .mapToInt(skins -> {
                            int itemAmount = 0;
                            for (CSCollection skin : skins) {
                                itemAmount += skin.getItemTypes().size();
                            }
                            return itemAmount;
                        })
                        .sum()
        ));
        log.info("Initializing CaseSniffer..");

        if (config.debug()) {
            log.debug("Debug enabled!");
        }

        initDatasource();

        HttpClient httpClient = new HttpClient(config.steamLogin());

        final ExpectedValueCalculator valueCalc = getExpectedValueCalculator(config, httpClient);

        log.info("CaseSniffer started. Fetching data..");

        for (Case c : Case.values()) {
            valueCalc.updateSteamIds(c, config.updateItemIds());

            valueCalc.updateCasePrice(c, config.updateCasePrices());

            valueCalc.updateSkinPrices(c, config.updateSkinPrices());

            if (config.steamLogin() != null) {
                valueCalc.calcExpectedValues(c, CsSnifferConfiguration.DataSource.STEAM);
            }

            if (config.csFloatKey() != null) {
                valueCalc.calcExpectedValues(c, CsSnifferConfiguration.DataSource.CSFLOAT);
            }
        }

        valueCalc.outputExpectedValues();
    }

    @NotNull
    private static ExpectedValueCalculator getExpectedValueCalculator(CsSnifferConfiguration config, HttpClient httpClient) {
        SteamMarketService steamService = null;
        CsFloatMarketService floatMarketService = null;

        if (config.steamLogin() != null) {
            steamService = new SteamMarketService(httpClient.getClient());
        }

        if (config.csFloatKey() != null) {
            floatMarketService = new CsFloatMarketService(httpClient.getClient(), config.csFloatKey());
        }

        CurrencyConvertion converter = new CurrencyConvertion(httpClient.getClient());

        ExpectedValueCalculator valueCalc = new ExpectedValueCalculator(
                steamService,
                floatMarketService,
                converter,
                dao,
                config.debug()
        );

        valueCalc.initItemIds();
        return valueCalc;
    }

    private static CsSnifferConfiguration handleClArgs(String[] args) {
        String steamLogin = null;
        boolean updateItemIds = false;
        boolean updateCasePrices = false;
        boolean updateSkinPrices = false;
        String csFloatKey = null;

        boolean debug = false;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-h", "--help": {
                    log.info("""
                            Usage: java -jar CaseSniffer.jar [OPTIONS]
                            
                            Calculate and display expected value and ROI for each case. Providing no additional flags will display previous calculated expected values and ROI's.
                            
                            Options:
                                --steam                 Calculates based on Steam data.
                                                        Next argument has to be Steam Secure Login string
                                --csfloat               Calculates based on CSFloat data.
                                                        Next argument has to be an CSFloat API key
                                -i, --updateItemIds     Expected value will be calculated with updated Item Ids. Use this only, if there is a problem with the previously fetched item ids.
                                                        Can only be used if --steam flag is provided
                                -c, --updateCasePrices  Expected value will be calculated with updated Case Prices
                                -s, --updateSkinPrices  Expected value will be calculated with updated Skin Prices
                                -a, --all               Expected value will be calculated with new Item Ids, Case Prices and Skin Prices. Use this if you run the programm the first time
                                --debug                 Debug flag to log each skin for each case with its price, probability and therefor its expected value contribution.
                                -h, --help              Display this help documentary and exit the programm
                            """);
                    System.exit(0);
                    break;
                }
                case "--steam": {
                    int idx = ++i;

                    if (idx >= args.length) {
                        log.error("No Steam Secure Login cookie value provided.");
                        System.exit(1);
                    }

                    steamLogin = args[idx];

                    if (!steamLogin.contains("%7C%7C") || steamLogin.split("%")[0].length() != STEAM_PROFILE_ID_LENGTH) {
                        log.error("Steam secure login string not valid. Either wrong format or containing profile id has wrong length (is: %d, should: %d)".formatted(steamLogin.split("%")[0].length(), STEAM_PROFILE_ID_LENGTH));
                        System.exit(1);
                    }

                    break;
                }
                case "--csfloat": {
                    int idx = ++i;

                    if (idx >= args.length) {
                        log.error("No CSFloat API key provided.");
                        System.exit(1);
                    }

                    csFloatKey = args[idx];

                    if (csFloatKey.length() != CSFLOAT_KEY_LENGTH) {
                        log.error("CSFloat API Key not valid. Is %d characters long, should be %d".formatted(csFloatKey.length(), CSFLOAT_KEY_LENGTH));
                        System.exit(1);
                    }

                    break;
                }
                case "-i", "--updateItemIds": {
                    updateItemIds = true;
                    break;
                }
                case "-c", "--updateCasePrices": {
                    updateCasePrices = true;
                    break;
                }
                case "-s", "--updateSkinPrices": {
                    updateSkinPrices = true;
                    break;
                }
                case "-a", "--all": {
                    updateItemIds = true;
                    updateCasePrices = true;
                    updateSkinPrices = true;
                    break;
                }
                case "--debug": {
                    debug = true;
                    break;
                }
                default: {
                    if (i == 0 || !args[i-1].equals("--steam")) {
                        log.warn("Unknown option: {}. Run CaseSniffer.jar --help for help.", args[i]);
                    }
                    break;
                }
            }
        }

        if (updateItemIds && steamLogin == null) {
            log.warn("Update Item ids flag provided, but Steam flag isn't, therefor it will be ignored.");
            updateItemIds = false;
        }

        return new CsSnifferConfiguration(
                steamLogin,
                updateItemIds,
                csFloatKey,
                updateCasePrices,
                updateSkinPrices,
                debug
        );
    }

    private static void initDatasource() {
        new File("./CaseSniffer").mkdirs();

        SQLiteDataSource ds = new SQLiteDataSource();
        ds.setUrl("jdbc:sqlite:./CaseSniffer/cases.db");
        Jdbi jdbi = Jdbi.create(ds);
        jdbi.installPlugin(new SqlObjectPlugin());

        dao = jdbi.onDemand(CaseSnifferDao.class);

        dao.createItemIdTable();
        dao.createSteamIdsTable();
        dao.createCasePriceTable();
        dao.createSkinPriceTable();
        dao.createExpectedValueTable();
    }
}