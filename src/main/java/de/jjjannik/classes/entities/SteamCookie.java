package de.jjjannik.classes.entities;

import lombok.Builder;
import lombok.Getter;

@Builder
public class SteamCookie {
    public static final String LOGIN_KEY = "steamLoginSecure";
    public static final String SESSION_ID = "sessionid";

    @Getter
    private final String steamLogin;
    @Getter
    private final String sessionId;
    @Getter
    private final String steamId;
}