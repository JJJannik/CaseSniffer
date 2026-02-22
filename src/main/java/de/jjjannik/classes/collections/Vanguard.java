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
public enum Vanguard implements CSCollection {
    WASTELAND_REBEL("Wasteland Rebel", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.05, 0.70)),
    FIRE_ELEMENTAL("Fire Elemental", List.of(ItemType.P2000), Rarity.COVERT, new FloatRange(0.00, 0.60)),
    TRANQUILITY("Tranquility", List.of(ItemType.XM1014), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    CARTEL("Cartel", List.of(ItemType.P250), Rarity.CLASSIFIED, new FloatRange(0.00, 0.75)),
    CARDIAC("Cardiac", List.of(ItemType.SCAR_20), Rarity.CLASSIFIED),
    BASILISK("Basilisk", List.of(ItemType.M4A1), Rarity.RESTRICTED, new FloatRange(0.00, 0.68)),
    GRIFFIN("Griffin", List.of(ItemType.M4A4), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    GRINDER("Grinder", List.of(ItemType.GLOCK), Rarity.RESTRICTED, new FloatRange(0.02, 0.25)),
    HIGHWAYMAN("Highwayman", List.of(ItemType.SAWED_OFF), Rarity.RESTRICTED),
    URBAND_HAZARD("Urban Hazard", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC, new FloatRange(0.00, 0.25)),
    FIRESTARTER("Firestarter", List.of(ItemType.MAG_7), Rarity.MIL_SPEC, new FloatRange(0.06, 0.49)),
    DELUSION("Delusion", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.06, 0.35)),
    DART("Dart", List.of(ItemType.MP9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.46)),
    MURKY("Murky", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.06, 0.25)),

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