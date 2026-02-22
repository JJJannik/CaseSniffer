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
public enum Hydra implements CSCollection {
    ONI_TAIJI("Oni Taiji", List.of(ItemType.AWP), Rarity.COVERT, new FloatRange(0.00, 0.50)),
    HYPER_BEAST("Hyper Beast", List.of(ItemType.FIVE_SEVEN), Rarity.COVERT),
    HELLFIRE("Hellfire", List.of(ItemType.M4A4), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    SUGAR_RUSH("Sugar Rush", List.of(ItemType.GALIL_AR), Rarity.CLASSIFIED, new FloatRange(0.00, 0.55)),
    COBRA_STRIKE("Cobra Strike", List.of(ItemType.BERETTAS), Rarity.CLASSIFIED, new FloatRange(0.00, 0.60)),
    ORBIT_MK01("Orbit Mk01", List.of(ItemType.AK_47), Rarity.RESTRICTED, new FloatRange(0.00, 0.55)),
    DEATH_GRIP("Death Grip", List.of(ItemType.P90), Rarity.RESTRICTED),
    WOODSMAN("Woodsman", List.of(ItemType.P2000), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    RED_ROCK("Red Rock", List.of(ItemType.P250), Rarity.RESTRICTED),
    DEATHS_HEAD("Death's Head", List.of(ItemType.SSG_08), Rarity.RESTRICTED, new FloatRange(0.00, 0.51)),
    BLUEPRINT("Blueprint", List.of(ItemType.USP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.86)),
    BRIEFING("Briefing", List.of(ItemType.M4A1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    CUT_OUT("Cut Out", List.of(ItemType.TEC_9), Rarity.MIL_SPEC),
    ALOHA("Aloha", List.of(ItemType.MAC_10), Rarity.MIL_SPEC, new FloatRange(0.00, 0.65)),
    MACABRE("Macabre", List.of(ItemType.FAMAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    METAL_FLOWERS("Metal Flowers", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    HARD_WATER("Hard Water", List.of(ItemType.MAG_7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.45)),

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