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
public enum Clutch implements CSCollection {
    NEO_NOIR("Neo-Noir", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.90)),
    BLOODSPORT("Bloodsport", List.of(ItemType.MP7), Rarity.COVERT, new FloatRange(0.00, 0.65)),
    CORTEX("Cortex", List.of(ItemType.USP), Rarity.CLASSIFIED),
    MORTIS("Mortis", List.of(ItemType.AWP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.64)),
    STYMPHALIAN("Stymphalian", List.of(ItemType.AUG), Rarity.CLASSIFIED, new FloatRange(0.00, 0.63)),
    MOONRISE("Moonrise", List.of(ItemType.GLOCK), Rarity.RESTRICTED, new FloatRange(0.00, 0.65)),
    SWAG("SWAG-7", List.of(ItemType.MAG_7), Rarity.RESTRICTED, new FloatRange(0.00, 0.92)),
    ARCTIC_WOLF("Arctic Wolf", List.of(ItemType.UMP), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    WILD_SIX("Wild Six", List.of(ItemType.NOVA), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    LIONFISH("Lionfish", List.of(ItemType.NEGEV), Rarity.RESTRICTED, new FloatRange(0.00, 0.55)),
    URBAN_HAZARD("Urban Hazard", List.of(ItemType.P2000), Rarity.MIL_SPEC),
    GRIP("Grip", List.of(ItemType.REVOLVER), Rarity.MIL_SPEC),
    FLAME_TEST("Flame Test", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC, new FloatRange(0.00, 0.65)),
    BLACK_SAND("Black Sand", List.of(ItemType.MP9), Rarity.MIL_SPEC),
    ALOHA("Aloha", List.of(ItemType.SG_553), Rarity.MIL_SPEC, new FloatRange(0.00, 0.55)),
    NIGHT_RIOT("Night Riot", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    OXIDE_BLAZE("Oxide Blaze", List.of(ItemType.XM1014), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),

    IMPERIAL_PLAID("Imperial Plaid", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    KING_SNAKE("King Snake", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    OVERTAKE("Overtake", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    RACING_GREEN("Racing Green", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    COBALT_SKULLS("Cobalt Skulls", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    OVERPRINT("Overprint", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DUCT_TAPE("Duct Tape", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    ARBOREAL("Arboreal", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    EMERALD("Emerald", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    MANGROVE("Mangrove", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    RATTLER("Rattler", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    POW("POW!", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    POLYGON("Polygon", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    TURTLE("Turtle", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    TRANSPORT("Transport", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    MOGUL("Mogul", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FADE("Fade", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BUCKSHOT("Buckshot", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    AMPHIBIOUS("Amphibious", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    VICE("Vice", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    OMEGA("Omega", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BRONZE_MORPH("Bronze Morph", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}