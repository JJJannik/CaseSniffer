package de.jjjannik.classes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum ItemType {

    // Pistols
    CZ75("CZ75-Auto", GenericType.WEAPON),
    DESERT_EAGLE("Desert Eagle", GenericType.WEAPON),
    BERETTAS("Dual Berettas", GenericType.WEAPON),
    FIVE_SEVEN("Five-SeveN", GenericType.WEAPON),
    GLOCK("Glock-18", GenericType.WEAPON),
    P2000("P2000", GenericType.WEAPON),
    P250("P250", GenericType.WEAPON),
    REVOLVER("R8 Revolver", GenericType.WEAPON),
    TEC_9("Tec-9", GenericType.WEAPON),
    USP("USP-S", GenericType.WEAPON),

    // SMG's
    MAC_10("MAC-10", GenericType.WEAPON),
    MP5("MP5-SD", GenericType.WEAPON),
    MP7("MP7", GenericType.WEAPON),
    MP9("MP9", GenericType.WEAPON),
    P90("P90", GenericType.WEAPON),
    PP_BIZON("PP-Bizon", GenericType.WEAPON),
    UMP("UMP-45", GenericType.WEAPON),

    // Rifles
    AK_47("AK-47", GenericType.WEAPON),
    AUG("AUG", GenericType.WEAPON),
    FAMAS("FAMAS", GenericType.WEAPON),
    GALIL_AR("Galil AR", GenericType.WEAPON),
    M4A1("M4A1-S", GenericType.WEAPON),
    M4A4("M4A4", GenericType.WEAPON),
    SG_553("SG 553", GenericType.WEAPON),

    // Sniper Rifles
    AWP("AWP", GenericType.WEAPON),
    G3SG1("G3SG1", GenericType.WEAPON),
    SCAR_20("SCAR-20", GenericType.WEAPON),
    SSG_08("SSG 08", GenericType.WEAPON),

    // Shotguns
    MAG_7("MAG-7", GenericType.WEAPON),
    NOVA("Nova", GenericType.WEAPON),
    SAWED_OFF("Sawed-Off", GenericType.WEAPON),
    XM1014("XM1014", GenericType.WEAPON),

    // Machineguns
    M249("M249", GenericType.WEAPON),
    NEGEV("Negev", GenericType.WEAPON),

    // Knives
    BAYONET("Bayonet", GenericType.KNIFE),
    BOWIE("Bowie Knife", GenericType.KNIFE),
    BUTTERFLY("Butterfly Knife", GenericType.KNIFE),
    CLASSIC("Classic Knife", GenericType.KNIFE),
    FALCHION("Falchion Knife", GenericType.KNIFE),
    FLIP("Flip Knife", GenericType.KNIFE),
    GUT("Gut Knife", GenericType.KNIFE),
    HUNTSMAN("Huntsman Knife", GenericType.KNIFE),
    KARAMBIT("Karambit", GenericType.KNIFE),
    KUKRI("Kukri Knife", GenericType.KNIFE),
    M9_BAYONET("M9 Bayonet", GenericType.KNIFE),
    NAVAJA("Navaja Knife", GenericType.KNIFE),
    NOMAD("Nomad Knife", GenericType.KNIFE),
    PARACORD("Paracord Knife", GenericType.KNIFE),
    SHADOW_DAGGERS("Shadow Daggers", GenericType.KNIFE),
    SKELETON("Skeleton Knife", GenericType.KNIFE),
    STILETTO("Stiletto Knife", GenericType.KNIFE),
    SURVIVAL("Survival Knife", GenericType.KNIFE),
    TALON("Talon Knife", GenericType.KNIFE),
    URSUS("Ursus Knife", GenericType.KNIFE),

    // Gloves
    BLOODHOUND("Bloodhound Gloves", GenericType.GLOVE),
    DRIVER("Driver Gloves", GenericType.GLOVE),
    HAND_WRAPS("Hand Wraps", GenericType.GLOVE),
    MOTO("Moto Gloves", GenericType.GLOVE),
    SPECIALIST("Specialist Gloves", GenericType.GLOVE),
    SPORT("Sport Gloves", GenericType.GLOVE),
    HYDRA("Hydra Gloves", GenericType.GLOVE),
    BROKEN_FANG("Broken Fang Gloves", GenericType.GLOVE),

    ZEUS("Zeus x27", GenericType.WEAPON);

    @Getter
    private final String value;
    @Getter
    private final GenericType genericType;

    public static ItemType getByName(String name) {
        return Arrays.stream(values()).filter(c -> c.getValue().contains(name)).findFirst().orElse(null);
    }

    public enum GenericType {
        WEAPON,
        KNIFE,
        GLOVE
    }
}