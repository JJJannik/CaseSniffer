package de.jjjannik.services;

import com.google.gson.JsonArray;
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
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Log4j2
@RequiredArgsConstructor
public class CsFloatMarketService {
    private static final String ITEM_LISTING = "https://csfloat.com/api/v1/listings";

    private final OkHttpClient httpClient;
    private final String authKey;

    public Optional<Integer> getPriceForItem(SkinEntity skin) {

        HttpUrl.Builder httpBuilder = HttpUrl.parse(ITEM_LISTING).newBuilder();

        String marketHash = skin.toSteamMarketHash();

        Map<String, Object> params = new HashMap<>();
        params.put("limit", 1);
        params.put("sort_by", "lowest_price");
        params.put("type", "buy_now");
        params.put("market_hash_name", marketHash);

        for (Map.Entry<String, Object> param : params.entrySet()) {
            httpBuilder.addQueryParameter(param.getKey(), String.valueOf(param.getValue()));
        }

        Request.Builder builder = new Request.Builder()
                .url(httpBuilder.build())
                .get()
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", authKey);

        int price = 0;

        try (Response response = httpClient.newCall(builder.build()).execute()) {
            String responseBody = response.body().string();
            if (!response.isSuccessful()) {
                String rateLimit = response.header("x-ratelimit-remaining");
                String resetTime = response.header("x-ratelimit-reset");
                String maxLimit = response.header("x-ratelimit-limit");

                if ("0".equals(rateLimit)) {

                    log.warn("CsFloat API Ratelimit {}/{} remaining reached. Ratelimit will be reset {}. \nProgramm will nevertheless try every 60s to request new data until possible.",
                            rateLimit,
                            maxLimit,
                            new SimpleDateFormat("dd-MM-yyyy HH:mm:ssZ").format(Date.from(Instant.ofEpochSecond(Long.parseLong(resetTime))))
                    );
                    return Optional.empty();
                }

                throw new HttpResponseException(response.code(), "CsFloat request for '%s' was not successful. Response body: %s".formatted(marketHash, responseBody));
            }

            JsonArray dataArray = CaseSniffer.GSON
                    .fromJson(responseBody, JsonObject.class)
                    .getAsJsonArray("data");

            if (dataArray.isEmpty()) {
                log.warn("No CsFloat sale found for '%s'".formatted(marketHash));
                return Optional.of(0);
            }

            price = dataArray
                    .get(0)
                    .getAsJsonObject()
                    .get("price")
                    .getAsInt();

        } catch (IOException e) {
            log.error("Could not retrieve CsFloat Listing for Skin '%s':".formatted(marketHash), e);
        }

        return Optional.of(price);
    }
}