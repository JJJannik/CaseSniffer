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
public enum WinterOffensive implements CSCollection {
    ASIIMOV("Asiimov", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.18, 1.00)),
    THE_KRAKEN("The Kraken", List.of(ItemType.SAWED_OFF), Rarity.COVERT, new FloatRange(0.00, 0.40)),
    REDLINE("Redline", List.of(ItemType.AWP), Rarity.CLASSIFIED, new FloatRange(0.10, 0.40)),
    GUARDIAN("Guardian", List.of(ItemType.M4A1), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    MEHNDI("Mehndi", List.of(ItemType.P250), Rarity.CLASSIFIED),
    PULSE("Pulse", List.of(ItemType.FAMAS), Rarity.RESTRICTED, new FloatRange(0.00, 0.40)),
    ROSE_IRON("Rose Iron", List.of(ItemType.MP9), Rarity.RESTRICTED, new FloatRange(0.00, 0.30)),
    MARINA("Marina", List.of(ItemType.BERETTAS), Rarity.RESTRICTED, new FloatRange(0.06, 0.50)),
    RISING_SKULL("Rising Skull", List.of(ItemType.NOVA), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    SANDSTORM("Sandstorm", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC, new FloatRange(0.10, 0.60)),
    KAMI("Kami", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC, new FloatRange(0.00, 0.30)),
    COBALT_HALFTONE("Cobalt Halftone", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC, new FloatRange(0.05, 0.45)),
    MAGMA("Magma", List.of(ItemType.M249), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),

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