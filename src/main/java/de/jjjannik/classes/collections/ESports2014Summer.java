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
public enum ESports2014Summer implements CSCollection {
    JAGUAR("Jaguar", List.of(ItemType.AK_47), Rarity.COVERT),
    BULLET_RAIN("Bullet Rain", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.02, 0.46)),
    BLOOMSTICK("Bloomstick", List.of(ItemType.NOVA), Rarity.CLASSIFIED, new FloatRange(0.06, 0.80)),
    CORTICERA("Corticera", List.of(ItemType.AWP, ItemType.P2000), Rarity.CLASSIFIED, new FloatRange(0.06, 0.30)),
    BENGAL_TIGER("Bengal Tiger", List.of(ItemType.AUG), Rarity.CLASSIFIED, new FloatRange(0.06, 0.80)),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.DESERT_EAGLE), Rarity.RESTRICTED, new FloatRange(0.06, 0.80)),
    STEEL_DISRUPTION("Steel Disruption", List.of(ItemType.GLOCK), Rarity.RESTRICTED, new FloatRange(0.00, 0.20)),
    OCEAN_FOAM("Ocean Foam", List.of(ItemType.MP7), Rarity.RESTRICTED, new FloatRange(0.00, 0.08)),
    BLUE_STREAK("Blue Streak", List.of(ItemType.PP_BIZON), Rarity.RESTRICTED, new FloatRange(0.06, 0.80)),
    VIRUS("Virus", List.of(ItemType.P90), Rarity.RESTRICTED, new FloatRange(0.06, 0.80)),
    ULTRAVIOLET("Ultraviolet", List.of(ItemType.MAC_10), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),
    BLOOD_TIGER("Blood Tiger", List.of(ItemType.USP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.30)),
    BRATATAT("Bratatat", List.of(ItemType.NEGEV), Rarity.MIL_SPEC),
    DARK_WATER("Dark Water", List.of(ItemType.SSG_08), Rarity.MIL_SPEC, new FloatRange(0.10, 0.26)),
    HEXANE("Hexane", List.of(ItemType.CZ75), Rarity.MIL_SPEC, new FloatRange(0.00, 0.40)),
    RED_PYTHON("Red Python", List.of(ItemType.XM1014), Rarity.MIL_SPEC, new FloatRange(0.08, 0.50)),

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