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
public enum Gallery implements CSCollection {
    VAPORWAVE("Vaporwave", List.of(ItemType.M4A1), Rarity.COVERT, new FloatRange(0.00, 0.60)),
    GOLD_TOOF("Gold Toof", List.of(ItemType.GLOCK), Rarity.COVERT, new FloatRange(0.00, 0.73)),
    OUTSIDERS("The Outsiders", List.of(ItemType.AK_47), Rarity.CLASSIFIED, new FloatRange(0.00, 0.90)),
    NEO_NOIR("Neo-Noir", List.of(ItemType.UMP), Rarity.CLASSIFIED),
    EPICENTER("Epicenter", List.of(ItemType.P250), Rarity.CLASSIFIED, new FloatRange(0.00, 0.80)),
    TURBINE("Turbine", List.of(ItemType.M4A4), Rarity.RESTRICTED, new FloatRange(0.00, 0.85)),
    RAPID_TRANSIT("Rapid Transit", List.of(ItemType.SSG_08), Rarity.RESTRICTED, new FloatRange(0.00, 0.75)),
    SAIBA_ONI("Saibā Oni", List.of(ItemType.MAC_10), Rarity.RESTRICTED, new FloatRange(0.00, 0.66)),
    HYDRO_STRIKE("Hydro Strike", List.of(ItemType.BERETTAS), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    RANDY_RUSH("Randy Rush", List.of(ItemType.P90), Rarity.RESTRICTED, new FloatRange(0.00, 0.75)),
    CALLIGRAFFITI("Calligraffiti", List.of(ItemType.DESERT_EAGLE), Rarity.MIL_SPEC),
    S_27("27", List.of(ItemType.USP), Rarity.MIL_SPEC),
    TANGO("Tango", List.of(ItemType.REVOLVER), Rarity.MIL_SPEC, new FloatRange(0.00, 0.85)),
    LUXE_TRIM("Luxe Trim", List.of(ItemType.AUG), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    STATICS("Statics", List.of(ItemType.MP5), Rarity.MIL_SPEC),
    HYPNOSIS("Hypnosis", List.of(ItemType.M249), Rarity.MIL_SPEC),
    TRAIL_BLAZER("Trail Blazer", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),

    FADE("Fade", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT_STRIPE("Night Stripe", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}