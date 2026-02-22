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
public enum CSGO2 implements CSCollection {
    BLOOD_WATER("Blood in the Water", List.of(ItemType.SSG_08), Rarity.COVERT, new FloatRange(0.06, 0.20)),
    SERUM("Serum", List.of(ItemType.USP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.25)),
    COLD_BLOODED("Cold Blooded", List.of(ItemType.P90), Rarity.CLASSIFIED, new FloatRange(0.00, 0.08)),
    HYPNOTIC("Hypnotic", List.of(ItemType.MP9), Rarity.RESTRICTED, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.FIVE_SEVEN), Rarity.RESTRICTED),
    HEMOGLOBIN("Hemoglobin", List.of(ItemType.BERETTAS), Rarity.RESTRICTED, new FloatRange(0.00, 0.20)),
    GRAPHITE("Graphite", List.of(ItemType.NOVA), Rarity.RESTRICTED, new FloatRange(0.00, 0.12)),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),
    BLOOD_TIGER("Blood Tiger", List.of(ItemType.M4A1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.30)),
    BLUE_TITANIUM("Blue Titanium", List.of(ItemType.TEC_9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.04)),
    HIVE("Hive", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.30)),
    HEXANE("Hexane", List.of(ItemType.FAMAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.40)),

    FADE("Fade", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
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