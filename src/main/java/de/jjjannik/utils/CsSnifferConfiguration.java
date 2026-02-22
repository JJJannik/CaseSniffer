package de.jjjannik.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.File;

public record CsSnifferConfiguration(boolean useSteam, File cookieFile, boolean updateItemIds, String csFloatKey, boolean updateCasePrices,
                                     boolean updateSkinPrices, boolean debug) {

    @RequiredArgsConstructor
    public enum DataSource {
        STEAM("Steam"),
        CSFLOAT("CSFloat");

        @Getter
        private final String name;
    }
}