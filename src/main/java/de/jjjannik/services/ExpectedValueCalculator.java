package de.jjjannik.services;

import de.jjjannik.classes.Case;
import de.jjjannik.classes.ItemType;
import de.jjjannik.classes.Wear;
import de.jjjannik.classes.collections.CSCollection;
import de.jjjannik.classes.entities.FloatRange;
import de.jjjannik.classes.entities.SkinEntity;
import de.jjjannik.classes.entities.ValueEntity;
import de.jjjannik.dao.CaseSnifferDao;
import de.jjjannik.utils.CsSnifferConfiguration.DataSource;
import de.jjjannik.utils.math.FloatDistributionFunction;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

@Log4j2
@RequiredArgsConstructor
public class ExpectedValueCalculator {
    @Nullable private final SteamMarketService steamService;
    @Nullable private final CsFloatMarketService floatMarketService;
    @NotNull private final CurrencyConvertion currencyConverter;
    private final CaseSnifferDao dao;
    private final boolean doDebug;

    public void calcExpectedValues(Case c, DataSource ds) {

        if (steamService == null && floatMarketService == null) return;

        Long caseId = dao.getItemId(c);

        if (caseId == null) {
            log.warn("No id found in db for case: {}", c);
            return;
        }

        Integer priceCt = dao.getCasePrice(caseId, ds);

        if (priceCt == null) {
            log.warn("No price found in db for case: {}", c);
            return;
        }

        double casePrice = priceCt / 100.0;

        if (doDebug) {
            log.debug("Case price for '{}': {}", c, casePrice);
        }

        AtomicReference<Double> expReturn = new AtomicReference<>(0.0);

        execForAllSkins(c, skin -> {
            Long skinId  = dao.getItemId(skin);

            if (skinId == null) {
                log.warn("No id found in db for skin: {}", skin.toSteamMarketHash());
                return;
            }

            Integer skinPrice = dao.getSkinPrice(skinId, ds);

            if (skinPrice == null) {
                log.warn("No price found in db for skin: {}", skin.toSteamMarketHash());
                return;
            }

            int rarityAmount = Arrays.stream(c.getCollectionSkins())
                    .mapToInt(s -> {
                        if (s.getRarity() == skin.getRarity()) {
                            return s.getItemTypes().size();
                        }
                        return 0;
                    })
                    .sum();

            double rarityProb = skin.getRarity().getProbability() / ( 100.0 * rarityAmount );
            double floatProb = FloatDistributionFunction.STANDARD_FLOAT
                    .modifyForFloatCap(skin.getSkin().getFloatRange())
                    .getProbability(skin.getWear());
            double statTrak = skin.isStatTrak() ? 0.1 : 0.9;

            double prob = rarityProb * floatProb * statTrak;

            expReturn.set(expReturn.get() + ((skinPrice / 100.0) * prob));

            if (doDebug) {
                log.debug("{}: Price: {}, Prob: {}, Exp: {}", skin.toSteamMarketHash(), skinPrice, prob, expReturn.get());
            }
        });

        double expVal = expReturn.get() - casePrice - Case.KEY_PRICE;
        double roi = expReturn.get() / (casePrice + Case.KEY_PRICE) * 100.0;

        dao.setExpectedVal(caseId, expVal, roi, ds);

        if (doDebug) {
            log.debug("Expected Value for '{}': {}; \t ROI: {}\n", c, expVal, roi);
        }
    }

    public void updateSteamIds(Case c, boolean updateAll) {
        if (steamService == null) return;

        SkinEntity caseEntity = SkinEntity.builder()
                .cCase(c)
                .build();

        Long caseId = dao.getItemId(c);

        if (caseId == null) {
            log.warn("No id found in db for case: {}", c);
            return;
        }

        if (updateAll || dao.getSteamId(caseId) == null) {
            Optional<Long> steamCaseId = this.getSteamIdSafely(caseEntity);

            while (steamCaseId.isEmpty()) {
                cooldown(20000);
                steamCaseId = steamService.getSteamId(caseEntity);
            }

            if (steamCaseId.get() == -1) {
                return;
            }

            dao.setSteamId(
                    caseId,
                    steamCaseId.get()
            );
        }

        this.execForAllSkins(c, skin -> {
            Long itemId = dao.getItemId(skin);

            if (itemId == null) {
                log.warn("No id found in db for skin: {}", skin.toString());
                return;
            }

            if (!updateAll && dao.getSteamId(itemId) != null) {
                return;
            }

            Optional<Long> steamSkinId = this.getSteamIdSafely(skin);

            while (steamSkinId.isEmpty()) {
                cooldown(20000);
                steamSkinId = steamService.getSteamId(skin);
            }

            if (steamSkinId.get() == -1) {
                return;
            }

            dao.setSteamId(
                    itemId,
                    steamSkinId.get()
            );

            cooldown(1000);
        });
    }

    public void updateCasePrice(Case c, boolean updateAll) {
        if (steamService == null && floatMarketService == null) return;

        SkinEntity caseEntity = SkinEntity.builder()
                .cCase(c)
                .build();

        Long itemId = dao.getItemId(c);

        if (itemId == null) {
            log.warn("No id found in db for case: {}", c);
            return;
        }

        if (steamService != null) {
            Long steamId = dao.getSteamId(itemId);

            if (steamId == null) {
                log.warn("No steam id found in db for case: {}", c);
                return;
            }

            if (steamId == 0) {
                dao.setCasePrice(itemId, 0, DataSource.STEAM);
                log.warn("No steam id for case: {}", c);
                return;
            }

            if (!updateAll && dao.getCasePrice(itemId, DataSource.STEAM) != null) {
                return;
            }

            Optional<Integer> casePrice = steamService.getPriceForItem(steamId);

            while (casePrice.isEmpty()) {
                cooldown(20000);
                casePrice = steamService.getPriceForItem(steamId);
            }

            dao.setCasePrice(itemId, casePrice.get(), DataSource.STEAM);

            cooldown(1000);
        }

        if (floatMarketService != null) {
            if (!updateAll && dao.getCasePrice(itemId, DataSource.CSFLOAT) != null) {
                return;
            }

            Optional<Integer> casePrice = floatMarketService.getPriceForItem(caseEntity);

            while (casePrice.isEmpty()) {
                cooldown(60000);
                casePrice = floatMarketService.getPriceForItem(caseEntity);
            }

            dao.setCasePrice(itemId, currencyConverter.convertUSDToEUR(casePrice.get()), DataSource.CSFLOAT);

            cooldown(1000);
        }
    }

    public void updateSkinPrices(Case c, boolean updateAll) {
        if (steamService == null && floatMarketService == null) return;

        execForAllSkins(c, skin -> {

            Long itemId = dao.getItemId(skin);

            if (itemId == null) {
                log.warn("No id found in db for skin: {}", skin.toString());
                return;
            }

            if (steamService != null) {
                Long steamId = dao.getSteamId(itemId);

                if (steamId == null) {
                    log.warn("No steam id found in db for skin: {}", skin.toString());
                    return;
                }

                if (steamId == 0) {
                    dao.setSkinPrice(itemId, 0, DataSource.STEAM);
                    return;
                }

                if (!updateAll && dao.getSkinPrice(itemId, DataSource.STEAM) != null) {
                    return;
                }

                Optional<Integer> skinPrice = steamService.getPriceForItem(steamId);

                while (skinPrice.isEmpty()) {
                    cooldown(20000);
                    skinPrice = steamService.getPriceForItem(steamId);
                }

                dao.setSkinPrice(itemId, skinPrice.get(), DataSource.STEAM);
                cooldown(1000);
            }

            if (floatMarketService != null) {
                if (!updateAll && dao.getSkinPrice(itemId, DataSource.CSFLOAT) != null) {
                    return;
                }

                Optional<Integer> skinPrice = floatMarketService.getPriceForItem(skin);

                while (skinPrice.isEmpty()) {
                    cooldown(60000);
                    skinPrice = floatMarketService.getPriceForItem(skin);
                }
                int currentPrice = currencyConverter.convertUSDToEUR(skinPrice.get());

                if (doDebug) {
                    log.debug("{}: {}: {}", c, skin.toString(), currentPrice);
                }

                if (skin.isStatTrak()) {
                    skin.setStatTrak(false);
                } else if (skin.getWear() != Wear.FN) {
                    Wear wear = Wear.values()[skin.getWear().ordinal() - 1];
                    skin.setWear(wear);
                }

                Long newId = dao.getItemId(skin);

                if (newId != null) {
                    Integer prevPrice = dao.getSkinPrice(newId , DataSource.CSFLOAT);

                    if (prevPrice != null && prevPrice != 0 && currentPrice - prevPrice > 5.00 * prevPrice) {
                        /*
                        That's because I encountered the problem that some blue skins had just one offer on csfloat for
                        e.g. Battle scarred which was some #1 low float skin and therefor way to expensive and not representative for the expected value,
                        so to approximate I set the current price to either the one for the no-stattrak version or a worse Wear
                         */
                        currentPrice = prevPrice;
                        if (doDebug) {
                            log.debug("Alternative Price: {}: {}", skin.toString(), currentPrice);
                        }
                    }
                }

                dao.setSkinPrice(itemId, currentPrice, DataSource.CSFLOAT);
                cooldown(1000);
            }
        });
    }

    /**
     * If you encounter Decoding problems in Windows PowerShell CI, use ´chcp 65001´ and ´[Console]::OutputEncoding = [System.Text.Encoding]::UTF8´
     * to set console encoding to UTF-8.
     */
    public void outputExpectedValues() {
        System.out.println("\nCaseSniffer - Expected Values:");

        for (DataSource ds : DataSource.values()) {
            System.out.printf("""
                    
                    |--------------------------------
                    |%s:
                    """, ds.getName());

            List<ValueEntity> values = dao.getExpectedValuesSorted(ds);

            if (values.isEmpty()) {
                System.out.printf("|No data found for %s%n", ds.getName());
                continue;
            }

            for (int i = 0; i < values.size(); i++) {
                ValueEntity ve = values.get(i);

                System.out.printf("|#%s %s: %f €;\tROI: %f %%%n", i+1, ve.getCCase().getValue(), ve.getExpV(), ve.getRoi());
            }
        }
        System.out.println("|--------------------------------");
    }

    public void initItemIds() {
        for (Case c : Case.values()) {
            dao.addItem(c);

            execForAllSkins(c, dao::addItem);
        }
    }

    public static void cooldown(int ms) {
        long now = System.currentTimeMillis();
        while (System.currentTimeMillis() - now < ms) {
            // hihihi wait bozo
        }
    }

    private Optional<Long> getSteamIdSafely(SkinEntity skin) {
        Optional<Long> steamSkinId;
        try {
            steamSkinId = steamService.getSteamId(skin);
        } catch (IllegalStateException e) {

            skin.setStatTrak(false);

            Long itemIdNoStat = dao.getItemId(skin);

            if (itemIdNoStat == null) {
                log.warn("No id found in db for skin: {}", skin.toString());
                return Optional.of(-1L);
            }

            if (dao.getSteamId(itemIdNoStat) == null) {
                log.error("Error occurred while fetching steam id for '%s'. This is likely due to wrong item specification".formatted(skin.toSteamMarketHash()), e);
                System.exit(1);
            }
            dao.setSteamId(itemIdNoStat, 0);

            return Optional.of(0L);
        }

        return steamSkinId;
    }

    private void execForAllSkins(Case c, Consumer<SkinEntity> consumer) {
        for (CSCollection skin : c.getCollectionSkins()) {
            for (ItemType type : skin.getItemTypes()) {
                for (Wear wear : Wear.values()) {
                    for (boolean statTrak : new boolean[]{ false, true }) {
                        if ((type.getGenericType() == ItemType.GenericType.GLOVE && statTrak) // Filter out StatTrak Gloves
                                || (skin.getFloatRange() != null && skin.getFloatRange().getOverlap(wear) == 0) // Filter out Skins with Wear which are not possible due to float cap
                                || (skin.getName() == null && wear != Wear.FN)) // Filter out VANILLA Skins which are not FN, so its only one time requested
                        {
                            continue;
                        }

                        SkinEntity skinEntity = SkinEntity.builder()
                                .cCase(c)
                                .skin(skin)
                                .itemType(type)
                                .wear(wear)
                                .rarity(skin.getRarity())
                                .isStatTrak(statTrak)
                                .build();

                        consumer.accept(skinEntity);
                    }
                }
            }
        }
    }
}