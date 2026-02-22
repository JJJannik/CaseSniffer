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
public enum ESports2013Winter implements CSCollection {
    X_RAY("X-Ray", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.30)),
    COBALT_DISRUPTION("Cobalt Disruption", List.of(ItemType.DESERT_EAGLE), Rarity.CLASSIFIED, new FloatRange(0.00, 0.20)),
    ELECTRIC_HIVE("Electric Hive", List.of(ItemType.AWP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.40)),
    AFTERIMAGE("Afterimage", List.of(ItemType.FAMAS), Rarity.RESTRICTED, new FloatRange(0.02, 0.40)),
    BLUE_LAMINATE("Blue Laminate", List.of(ItemType.AK_47), Rarity.RESTRICTED, new FloatRange(0.02, 0.40)),
    BLIND_SPOT("Blind Spot", List.of(ItemType.P90), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    BLUE_TITANIUM("Blue Titanium", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC, new FloatRange(0.00, 0.04)),
    NIGHTSHADE("Nightshade", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    STEEL_DISRUPTION("Steel Disruption", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.20)),
    WATER_SIGIL("Water Sigil", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    GHOST_CAMO("Ghost Camo", List.of(ItemType.NOVA), Rarity.MIL_SPEC, new FloatRange(0.00, 0.40)),
    AZURE_ZEBRA("Azure Zebra", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.28)),

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