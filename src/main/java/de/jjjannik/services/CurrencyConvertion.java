package de.jjjannik.services;

import com.google.gson.JsonObject;
import de.jjjannik.CaseSniffer;
import de.jjjannik.utils.HttpResponseException;
import lombok.extern.log4j.Log4j2;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

@Log4j2
public class CurrencyConvertion {
    private static final String LATEST_RATES = "https://api.fxratesapi.com/latest";

    private final OkHttpClient httpClient;
    private final double conversionRate;

    public CurrencyConvertion(OkHttpClient httpClient) {
        this.httpClient = httpClient;

        this.conversionRate = this.getRateUSDToEUR();

        if (conversionRate <= 0) {
            throw new IllegalStateException("Fetched currency conversion rate is less or equal 0.");
        }
    }

    /**
     * Converts given price amount from USD to EUR
     * @param ct US Dollar price in ct
     * @return Euro price in ct
     */
    public int convertUSDToEUR(int ct) {
        return (int) (ct * conversionRate);
    }

    private double getRateUSDToEUR() {

        Request.Builder builder = new Request.Builder()
                .url(LATEST_RATES)
                .get()
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
                .addHeader("Content-Type", "application/json");

        double rate = 0;

        try (Response response = httpClient.newCall(builder.build()).execute()) {
            String responseBody = response.body().string();
            if (!response.isSuccessful()) {
                throw new HttpResponseException(response.code(), "USD to EUR currency rate call not successful. Response body: %s".formatted(responseBody));
            }

            JsonObject json = CaseSniffer.GSON
                    .fromJson(responseBody, JsonObject.class);

            if (!json.get("success").getAsBoolean()) {
                log.error("Call not successful, body: %s".formatted(responseBody));
                return 0;
            }

            rate = json.getAsJsonObject("rates").get("EUR").getAsDouble();
        } catch (IOException e) {
            log.error("Could not retrieve currency rate USD to EUR", e);
        }

        return rate;
    }
}