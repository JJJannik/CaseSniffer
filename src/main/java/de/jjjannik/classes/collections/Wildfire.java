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
public enum Wildfire implements CSCollection {
    FUEL_INJECTOR("Fuel Injector", List.of(ItemType.AK_47), Rarity.COVERT),
    THE_BATTLESTAR("The Battlestar", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.64)),
    ELITE_BUILD("Elite Build", List.of(ItemType.AWP), Rarity.CLASSIFIED),
    KUMICHO_DRAGON("Kumicho Dragon", List.of(ItemType.DESERT_EAGLE), Rarity.CLASSIFIED, new FloatRange(0.00, 0.76)),
    HYPER_BEAST("Hyper Beast", List.of(ItemType.NOVA), Rarity.CLASSIFIED, new FloatRange(0.00, 0.60)),
    ROYAL_LEGION("Royal Legion", List.of(ItemType.GLOCK), Rarity.RESTRICTED),
    VALENCE("Valence", List.of(ItemType.FAMAS), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    IMPIRE("Impire", List.of(ItemType.MP7), Rarity.RESTRICTED, new FloatRange(0.00, 0.40)),
    TRIUMVIRATE("Triumvirate", List.of(ItemType.FIVE_SEVEN), Rarity.RESTRICTED, new FloatRange(0.00, 0.61)),
    PRAETORIAN("Praetorian", List.of(ItemType.MAG_7), Rarity.RESTRICTED, new FloatRange(0.00, 0.45)),
    LEAD_CONDUIT("Lead Conduit", List.of(ItemType.USP), Rarity.MIL_SPEC),
    NECROPOS("Necropos", List.of(ItemType.SSG_08), Rarity.MIL_SPEC),
    CARTEL("Cartel", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC),
    JAMBIYA("Jambiya", List.of(ItemType.TEC_9), Rarity.MIL_SPEC),
    LAPIS_GATOR("Lapis Gator", List.of(ItemType.MAC_10), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    PHOTIC_ZONE("Photic Zone", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC),

    FADE("Fade", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT("Night", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.BOWIE), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}