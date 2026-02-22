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
public enum Phoenix implements CSCollection {
    ASIIMOV("Asiimov", List.of(ItemType.AWP), Rarity.COVERT, new FloatRange(0.18, 1.00)),
    CHAMELEON("Chameleon", List.of(ItemType.AUG), Rarity.COVERT, new FloatRange(0.00, 0.50)),
    REDLINE("Redline", List.of(ItemType.AK_47), Rarity.CLASSIFIED, new FloatRange(0.10, 0.70)),
    TRIGON("Trigon", List.of(ItemType.P90), Rarity.CLASSIFIED, new FloatRange(0.08, 0.75)),
    ANTIQUE("Antique", List.of(ItemType.NOVA), Rarity.CLASSIFIED, new FloatRange(0.00, 0.30)),
    HEAT("Heat", List.of(ItemType.MAC_10), Rarity.RESTRICTED),
    SERGEANT("Sergeant", List.of(ItemType.FAMAS), Rarity.RESTRICTED, new FloatRange(0.10, 1.00)),
    GUARDIAN("Guardian", List.of(ItemType.USP), Rarity.RESTRICTED, new FloatRange(0.00, 0.38)),
    PULSE("Pulse", List.of(ItemType.SG_553), Rarity.RESTRICTED, new FloatRange(0.10, 0.60)),
    SANDSTORM("Sandstorm", List.of(ItemType.TEC_9), Rarity.MIL_SPEC, new FloatRange(0.10, 0.70)),
    CORPORAL("Corporal", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.05, 0.75)),
    HEAVEN_GUARD("Heaven Guard", List.of(ItemType.MAG_7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.40)),
    TERRAIN("Terrain", List.of(ItemType.NEGEV), Rarity.MIL_SPEC, new FloatRange(0.00, 0.45)),

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