package de.jjjannik.classes.collections;

import de.jjjannik.classes.ItemType;
import de.jjjannik.classes.Rarity;
import de.jjjannik.classes.entities.FloatRange;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
public enum Glove implements CSCollection {
    BUZZ_KILL("Buzz Kill", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.70)),
    DRAGONFIRE("Dragonfire", List.of(ItemType.SSG_08), Rarity.COVERT, new FloatRange(0.00, 0.50)),
    MECHA_INDUSTRIES("Mecha Industries", List.of(ItemType.FAMAS), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    WASTELAND_PRINCESS("Wasteland Princess", List.of(ItemType.SAWED_OFF), Rarity.CLASSIFIED, new FloatRange(0.00, 0.70)),
    SHALLOW_GRAVE("Shallow Grave", List.of(ItemType.P90), Rarity.CLASSIFIED, new FloatRange(0.00, 0.75)),
    FLASHBACK("Flashback", List.of(ItemType.M4A1), Rarity.RESTRICTED),
    CYREX("Cyrex", List.of(ItemType.USP), Rarity.RESTRICTED, new FloatRange(0.00, 0.55)),
    ROYAL_CONSORTS("Royal Consorts", List.of(ItemType.BERETTAS), Rarity.RESTRICTED),
    GILA("Gila", List.of(ItemType.NOVA), Rarity.RESTRICTED, new FloatRange(0.00, 0.30)),
    STINGER("Stinger", List.of(ItemType.G3SG1), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    IRONWORK("Ironwork", List.of(ItemType.GLOCK), Rarity.MIL_SPEC),
    CIRRUS("Cirrus", List.of(ItemType.MP7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.75)),
    BLACK_SAND("Black Sand", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC),
    TURF("Turf", List.of(ItemType.P2000), Rarity.MIL_SPEC),
    SAND_SCALE("Sand Scale", List.of(ItemType.MP9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.45)),
    SONAR("Sonar", List.of(ItemType.MAG_7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.45)),
    POLYMER("Polymer", List.of(ItemType.CZ75), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

    CHARRED("Charred", List.of(ItemType.BLOODHOUND), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BRONZED("Bronzed", List.of(ItemType.BLOODHOUND), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SNAKEBITE("Snakebite", List.of(ItemType.BLOODHOUND), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    GUERRILLA("Guerrilla", List.of(ItemType.BLOODHOUND), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CRIMSON_WEAVE("Crimson Weave", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DIAMONDBACK("Diamondback", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    LUNAR_WEAVE("Lunar Weave", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CONVOY("Convoy", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SLAUGHTER("Slaughter", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    LEATHER("Leather", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BADLANDS("Badlands", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SPRUCE("Spruce DDPAT", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SPEARMINT("Spearmint", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    COOL_MINT("Cool Mint", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BOOM("Boom!", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    ECLIPSE("Eclipse", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CRIMSON_KIMONO("Crimson Kimono", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    EMERALD_WEB("Emerald Web", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOUNDATION("Foundation", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    HEDGE_MAZE("Hedge Maze", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SUPERCONDUCTOR("Superconductor", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    ARID("Arid", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    PANDORA("Pandora's Box", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}