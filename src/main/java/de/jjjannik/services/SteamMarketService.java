package de.jjjannik.services;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.jjjannik.CaseSniffer;
import de.jjjannik.classes.entities.SkinEntity;
import de.jjjannik.utils.HttpResponseException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Optional;

@Log4j2
@RequiredArgsConstructor
public class SteamMarketService {
    private final OkHttpClient httpClient;
    private static final String ITEM_PAGE = "https://steamcommunity.com/market/listings/730/%s";
    private static final String PRICE_DATA = "https://steamcommunity.com/market/itemordershistogram?language=english&currency=3&item_nameid=%d";

    private int priceRateCounter = 0;
    public Optional<Integer> getPriceForItem(long steamId) { // GET https://steamcommunity.com/market/itemordershistogram?language=english&currency=3&item_nameid=176185874
        int price = 0;

        HttpUrl httpUrl = HttpUrl.parse(PRICE_DATA.formatted(steamId));

        Request.Builder builder = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
                .addHeader("Content-Type", "application/json");

        try (Response response = httpClient.newCall(builder.build()).execute()) {
            String responseBody = response.body().string();
            if (!response.isSuccessful()) {
                if (response.code() == 429) {
                    log.warn("Encountered Steam rate limit for Item prices after %d more requests. Waiting 20s until retry.".formatted(priceRateCounter));
                    priceRateCounter = 0;
                    return Optional.empty();
                } else {
                    throw new HttpResponseException(response.code(), "Http call for '%s' failed. Body: %s".formatted(httpUrl, responseBody));
                }
            }

            priceRateCounter++;

            JsonObject priceOverview = CaseSniffer.GSON.fromJson(responseBody, JsonObject.class);

            if (priceOverview.get("success").getAsInt() != 1) {
                log.warn("Steam request for '%d' was not successful. Body: %s".formatted(steamId, responseBody));
                return Optional.empty();
            }

            JsonElement sellOrder = priceOverview.get("lowest_sell_order");

            if (!sellOrder.isJsonNull()) {
                price = sellOrder.getAsInt();
            } else {
                price = priceOverview.get("highest_buy_order").getAsInt();
            }
        } catch (IOException e) {
            log.error("Could not retrieve Main Skin Page for Skin '%d':".formatted(steamId), e);
        }

        return Optional.of(price);
    }

    private int idRateCounter = 0;
    public Optional<Long> getSteamId(SkinEntity skin) {  // GET https://steamcommunity.com/market/listings/730/Fracture Case
        String itemHash = skin.toSteamMarketHash();
        long id = 0;

        HttpUrl url = HttpUrl.parse(ITEM_PAGE.formatted(itemHash));

        Request.Builder builder = new Request.Builder()
                .url(url)
                .get()
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
                .addHeader("Content-Type", "text/html");

        try (Response response = httpClient.newCall(builder.build()).execute()) {
            String responseBody = response.body().string();
            if (!response.isSuccessful()) {
                if (response.code() == 429) {
                    log.warn("Encountered Steam rate limit for Steam Item ids after %d more requests. Waiting 20s until retry.".formatted(idRateCounter));
                    idRateCounter = 0;
                    return Optional.empty();
                } else if (response.code() == 502) {
                    log.warn("Steam couldn't process request for %d. Retrying with delay..");
                    return Optional.empty();
                } else  {
                    throw new HttpResponseException(response.code(), "Http call failed. Body: %s".formatted(responseBody));
                }
            }

            idRateCounter++;

            String[] priceSplit = responseBody
                    .split("Market_LoadOrderSpread\\(");

            if (priceSplit.length == 1) {
                throw new IllegalStateException("No item found for '%s'".formatted(itemHash));
            }

            id = Long.parseLong(priceSplit[1]
                    .split("\\);")[0]
                    .strip()
            );

        } catch (IOException e) {
            log.error("Could not retrieve Main Skin Page for Skin '%s': ".formatted(itemHash), e);
        }

        return Optional.of(id);
    }
}