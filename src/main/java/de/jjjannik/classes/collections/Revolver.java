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
public enum Revolver implements CSCollection {
    ROYAL_PALADIN("Royal Paladin", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    FADE_S("Fade", List.of(ItemType.REVOLVER), Rarity.COVERT, new FloatRange(0.00, 0.40)),
    POINT_DISARRAY("Point Disarray", List.of(ItemType.AK_47), Rarity.CLASSIFIED, new FloatRange(0.00, 0.67)),
    THE_EXECUTIONER("The Executioner", List.of(ItemType.G3SG1), Rarity.CLASSIFIED, new FloatRange(0.14, 0.85)),
    SHAPEWOOD("Shapewood", List.of(ItemType.P90), Rarity.CLASSIFIED),
    AVALANCHE("Avalanche", List.of(ItemType.TEC_9), Rarity.RESTRICTED),
    POWER_LOADER("Power Loader", List.of(ItemType.NEGEV), Rarity.RESTRICTED),
    RETROBUTION("Retrobution", List.of(ItemType.FIVE_SEVEN), Rarity.RESTRICTED),
    TECLU_BURNER("Teclu Burner", List.of(ItemType.XM1014), Rarity.RESTRICTED, new FloatRange(0.00, 0.65)),
    TIGER_MOTH("Tiger Moth", List.of(ItemType.SG_553), Rarity.RESTRICTED),
    FUEL_ROD("Fuel Rod", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC),
    CRIMSON_WEB_S("Crimson Web", List.of(ItemType.REVOLVER), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),
    CORINTHIAN("Corinthian", List.of(ItemType.DESERT_EAGLE), Rarity.MIL_SPEC, new FloatRange(0.00, 0.44)),
    IMPERIAL("Imperial", List.of(ItemType.P2000), Rarity.MIL_SPEC, new FloatRange(0.00, 0.20)),
    YORICK("Yorick", List.of(ItemType.SAWED_OFF), Rarity.MIL_SPEC),
    RICOCHET("Ricochet", List.of(ItemType.AUG), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    OUTBREAK("Outbreak", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

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