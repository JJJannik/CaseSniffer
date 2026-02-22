package de.jjjannik.utils;

import de.jjjannik.classes.entities.SteamCookie;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class HttpClient {
    private static final String PROFILE_URL = "https://steamcommunity.com/profiles/%s";

    CookieJar cookieJar = new CookieJar() {
        private final List<Cookie> cookies = new ArrayList<>();

        @Override
        public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> newCookies) {
            cookies.removeIf(c ->
                    newCookies.stream().anyMatch(nc -> nc.name().equals(c.name()))
            );
            cookies.addAll(newCookies);
        }

        @NotNull
        @Override
        public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
            return cookies.stream()
                    .filter(c -> c.matches(url))
                    .toList();
        }
    };

    @Getter
    private final OkHttpClient client = new OkHttpClient.Builder()
            .cookieJar(cookieJar)
            .build();

    public HttpClient(SteamCookie cookie) {
        if (cookie == null) {
            return;
        }

        List<Cookie> cookies = List.of(
                new Cookie.Builder()
                        .domain("steamcommunity.com")
                        .path("/")
                        .name("steamLoginSecure")
                        .value(cookie.getSteamLogin())
                        .secure()
                        .httpOnly()
                        .build(),
                new Cookie.Builder()
                        .domain("steamcommunity.com")
                        .path("/")
                        .name("sessionid")
                        .value(cookie.getSessionId())
                        .build()
        );

        cookieJar.saveFromResponse(
                HttpUrl.get("https://steamcommunity.com/"),
                cookies
        );


        if (!validateCookie(cookie)) {
            throw new IllegalStateException("Invalid or outdated Steam cookie provided!");
        }
    }

    private boolean validateCookie(SteamCookie cookie) {
        HttpUrl httpUrl = HttpUrl.parse(PROFILE_URL.formatted(cookie.getSteamId()));

        Request.Builder builder = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
                .addHeader("Content-Type", "text/html");

        try (Response response = this.getClient().newCall(builder.build()).execute()) {
            String body = response.body().string();
            if (!response.isSuccessful()) {
                throw new HttpResponseException(response.code(), "Http call failed. Body: %s".formatted(body));
            }

            return body.contains(httpUrl + "/edit");
        } catch (IOException e) {
            log.error("Could not retrieve Profile Page for Steam Id '%s': ".formatted(cookie.getSteamId()), e);
        }

        return false;
    }
}