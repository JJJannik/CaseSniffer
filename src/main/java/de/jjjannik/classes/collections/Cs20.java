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
public enum Cs20 implements CSCollection {
    WILDFIRE("Wildfire", List.of(ItemType.AWP), Rarity.COVERT, new FloatRange(0.01, 0.70)),
    COMMEMORATION("Commemoration", List.of(ItemType.FAMAS), Rarity.COVERT, new FloatRange(0.00, 0.50)),
    HYDRA("Hydra", List.of(ItemType.MP9), Rarity.CLASSIFIED),
    NOSTALGIA("Nostalgia", List.of(ItemType.P90), Rarity.CLASSIFIED, new FloatRange(0.00, 0.57)),
    DEATH_BY_PUPPY("Death by Puppy", List.of(ItemType.AUG), Rarity.CLASSIFIED, new FloatRange(0.00, 0.40)),
    AGENT("Agent", List.of(ItemType.MP5), Rarity.RESTRICTED),
    INFERNO("Inferno", List.of(ItemType.P250), Rarity.RESTRICTED, new FloatRange(0.00, 0.68)),
    BUDDY("Buddy", List.of(ItemType.FIVE_SEVEN), Rarity.RESTRICTED, new FloatRange(0.00, 0.55)),
    PLASTIQUE("Plastique", List.of(ItemType.UMP), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    AZTEC("Aztec", List.of(ItemType.M249), Rarity.RESTRICTED, new FloatRange(0.00, 0.75)),
    SACRIFICE("Sacrifice", List.of(ItemType.GLOCK), Rarity.MIL_SPEC),
    DECOMMISSIONED("Decommissioned", List.of(ItemType.FAMAS), Rarity.MIL_SPEC),
    CLASSIC_CRATE("Classic Crate", List.of(ItemType.MAC_10), Rarity.MIL_SPEC),
    FLASH_OUT("Flash Out", List.of(ItemType.TEC_9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    ELITE("Elite 1.6", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    POPDOG("Popdog", List.of(ItemType.MAG_7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    ASSAULT("Assault", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.62)),

    FADE("Fade", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT_STRIPE("Night Stripe", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.CLASSIC), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}