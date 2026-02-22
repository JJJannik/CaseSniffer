package de.jjjannik;

import com.google.gson.Gson;
import de.jjjannik.classes.Case;
import de.jjjannik.classes.collections.CSCollection;
import de.jjjannik.classes.entities.SteamCookie;
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

        HttpClient httpClient = new HttpClient(readCookie(config.cookieFile()));

        final ExpectedValueCalculator valueCalc = getExpectedValueCalculator(config, httpClient);

        log.info("CaseSniffer started. Fetching data..");

        for (Case c : Case.values()) {
            valueCalc.updateSteamIds(c, config.updateItemIds());

            valueCalc.updateCasePrice(c, config.updateCasePrices());

            valueCalc.updateSkinPrices(c, config.updateSkinPrices());

            if (config.useSteam()) {
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

        if (config.useSteam()) {
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

    private static SteamCookie readCookie(File cookieFile) {
        if (cookieFile == null) {
            return null;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(cookieFile))) {
            String line;

            SteamCookie.SteamCookieBuilder builder = SteamCookie.builder();

            while((line = reader.readLine()) != null) {

                if (line.contains(SteamCookie.LOGIN_KEY)) {
                    String login = line.split(SteamCookie.LOGIN_KEY)[1].strip();
                    builder.steamLogin(login);

                    builder.steamId(login.split("%")[0]);
                }

                if (line.contains(SteamCookie.SESSION_ID)) {
                    builder.sessionId(line.split(SteamCookie.SESSION_ID)[1].strip());
                }
            }

            SteamCookie cookie = builder.build();

            if (cookie.getSessionId() == null || cookie.getSteamLogin() == null) {
                throw new IllegalArgumentException("Cookie file either does not contain Secure Steam Login or Session Id or isn't formatted correctly.");
            }

            return builder.build();
        } catch (IOException ex) {
            log.error("Could not read cookie: ", ex);
            System.exit(1);
        }

        return null;
    }

    private static CsSnifferConfiguration handleClArgs(String[] args) {
        File cookieFile = null;
        boolean updateItemIds = false;
        boolean updateCasePrices = false;
        boolean updateSkinPrices = false;
        String csFloatKey = null;
        boolean useSteam = false;

        boolean debug = false;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-h", "--help": {
                    log.info("""
                            Usage: java -jar CaseSniffer.jar [OPTIONS]
                            
                            Calculate and display expected value for each case. Providing no additional flags will display previous calculated expected values.
                            
                            Options:
                                --steam                 Calculate expected value based on Steam data.
                                                        Next argument can be file path to Steam Login Cookie, if not provided program searches in directory ./CaseSniffer for 'cookies.txt'
                                --csfloat                 Calculate expected value based on CSFloat data.
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
                    useSteam = true;

                    if (i + 1 < args.length) {
                        cookieFile = new File(args[i + 1]);
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
                        log.error("CSFloat API Key not valid. Is %d characters long, should be %d".formatted(CSFLOAT_KEY_LENGTH, csFloatKey.length()));
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

        if (useSteam && (cookieFile == null || !cookieFile.exists())) {
            cookieFile = new File("./CaseSniffer/cookies.txt");

            if (!cookieFile.exists()) {
                log.error("No cookies file as argument or in ./CaseSniffer/cookies.txt provided!");
                System.exit(1);
            }
        }

        if (updateItemIds && !useSteam) {
            log.warn("Update Item ids flag provided, but Steam flag isn't, therefor it will be ignored.");
            updateItemIds = false;
        }

        return new CsSnifferConfiguration(
                useSteam,
                cookieFile,
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