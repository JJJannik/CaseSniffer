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
public enum Bravo implements CSCollection {
    FIRE_SERPENT("Fire Serpent", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.06, 0.76)),
    GOLDEN_KOI("Golden Koi", List.of(ItemType.DESERT_EAGLE), Rarity.COVERT, new FloatRange(0.00, 0.12)),
    GRAPHITE("Graphite", List.of(ItemType.AWP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.12)),
    EMERALD_DRAGON("Emerald Dragon", List.of(ItemType.P90), Rarity.CLASSIFIED, new FloatRange(0.06, 0.52)),
    OCEAN_FOAM("Ocean Foam", List.of(ItemType.P2000), Rarity.CLASSIFIED, new FloatRange(0.00, 0.12)),
    OVERGROWTH("Overgrowth", List.of(ItemType.USP), Rarity.RESTRICTED, new FloatRange(0.06, 0.80)),
    ZIRKA("Zirka", List.of(ItemType.M4A4), Rarity.RESTRICTED, new FloatRange(0.06, 0.42)),
    GRAVEN("Graven", List.of(ItemType.MAC_10), Rarity.RESTRICTED, new FloatRange(0.06, 0.80)),
    BRIGHT_WATER("Bright Water", List.of(ItemType.M4A1), Rarity.RESTRICTED, new FloatRange(0.10, 0.22)),
    SHATTERED("Shattered", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),
    BONE_PILE("Bone Pile", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.06, 0.34)),
    BLACK_LIMBA("Black Limba", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),
    TEMPEST("Tempest", List.of(ItemType.NOVA), Rarity.MIL_SPEC, new FloatRange(0.06, 0.22)),
    WAVE_SPRAY("Wave Spray", List.of(ItemType.SG_553), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),
    DEMETER("Demeter", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),

    FADE("Fade", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT("Night", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}