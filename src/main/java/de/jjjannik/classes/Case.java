package de.jjjannik.classes;

import de.jjjannik.classes.collections.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Case {
    FEVER("Fever Case", Fever.values()),
    GALLERY("Gallery Case", Gallery.values()),
    KILOWATT("Kilowatt Case", Kilowatt.values()),
    REVOLUTION("Revolution Case", Revolution.values()),
    RECOIL("Recoil Case", Recoil.values()),
    DREAMS_NIGHTMARES("Dreams & Nightmares Case", DreamsNightmares.values()),
    RIPTIDE("Operation Riptide Case", Riptide.values()),
    SNAKEBITE("Snakebite Case", Snakebite.values()),
    BROKEN_FANG("Operation Broken Fang Case", BrokenFang.values()),
    FRACTURE("Fracture Case", Fracture.values()),
    PRISMA_2("Prisma 2 Case", Prisma2.values()),
    CS20("CS20 Case", Cs20.values()),
    X_RAY_P250("X-Ray P250 Package", XRayP250.values()),
    SHATTERED_WEB("Shattered Web Case", ShatteredWeb.values()),
    PRISMA("Prisma Case", Prisma.values()),
    DANGER_ZONE("Danger Zone Case", DangerZone.values()),
    HORIZON("Horizon Case", Horizon.values()),
    CLUTCH("Clutch Case", Clutch.values()),
    SPECTRUM_2("Spectrum 2 Case", Spectrum2.values()),
    HYDRA("Operation Hydra Case", Hydra.values()),
    SPECTRUM("Spectrum Case", Spectrum.values()),
    GLOVE("Glove Case", Glove.values()),
    GAMMA_2("Gamma 2 Case", Gamma2.values()),
    GAMMA("Gamma Case", Gamma.values()),
    CHROMA_3("Chroma 3 Case", Chroma3.values()),
    WILDFIRE("Operation Wildfire Case", Wildfire.values()),
    REVOLVER("Revolver Case", Revolver.values()),
    SHADOW("Shadow Case", Shadow.values()),
    FALCHION("Falchion Case", Falchion.values()),
    CHROMA_2("Chroma 2 Case", Chroma2.values()),
    CHROMA("Chroma Case", Chroma.values()),
    VANGUARD("Operation Vanguard Weapon Case", Vanguard.values()),
    E_SPORTS_2014_SUMMER("eSports 2014 Summer Case", ESports2014Summer.values()),
    BREAKOUT("Operation Breakout Weapon Case", Breakout.values()),
    HUNTSMAN("Huntsman Weapon Case", Huntsman.values()),
    PHOENIX("Operation Phoenix Weapon Case", Phoenix.values()),
    CSGO_3("CS:GO Weapon Case 3", CSGO3.values()),
    WINTER_OFFENSIVE("Winter Offensive Weapon Case", WinterOffensive.values()),
    E_SPORTS_2013_WINTER("eSports 2013 Winter Case", ESports2013Winter.values()),
    CSGO_2("CS:GO Weapon Case 2", CSGO2.values()),
    BRAVO("Operation Bravo Case", Bravo.values()),
    E_SPORTS_2013("eSports 2013 Case", ESports2013.values()),
    CSGO("CS:GO Weapon Case", CSGO1.values());

    @Getter
    private final String value;
    @Getter
    private final CSCollection[] collectionSkins;
    public static final double KEY_PRICE = 2.19; // €

    public static Case getByName(String name) {
        return Arrays.stream(values()).filter(c -> c.getValue().equals(name)).findFirst().orElse(null);
    }
}