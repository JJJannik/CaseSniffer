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
public enum Horizon implements CSCollection {
    NEON_RIDER("Neon Rider", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    CODE_RED("Code Red", List.of(ItemType.DESERT_EAGLE), Rarity.COVERT),
    NIGHTMARE("Nightmare", List.of(ItemType.M4A1), Rarity.CLASSIFIED),
    EYE_ATHENA("Eye of Athena", List.of(ItemType.FAMAS), Rarity.CLASSIFIED, new FloatRange(0.00, 0.70)),
    DEVOURER("Devourer", List.of(ItemType.SAWED_OFF), Rarity.CLASSIFIED, new FloatRange(0.00, 0.80)),
    POWERCORE("Powercore", List.of(ItemType.MP7), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    PAW("PAW", List.of(ItemType.AWP), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    ECO("Eco", List.of(ItemType.CZ75), Rarity.RESTRICTED),
    TOY_SOLDIER("Toy Soldier", List.of(ItemType.NOVA), Rarity.RESTRICTED),
    HIGH_SEAS("High Seas", List.of(ItemType.G3SG1), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    WARHAWK("Warhawk", List.of(ItemType.GLOCK), Rarity.MIL_SPEC),
    SNEK_9("Snek-9", List.of(ItemType.TEC_9), Rarity.MIL_SPEC),
    TRACTION("Traction", List.of(ItemType.P90), Rarity.MIL_SPEC),
    CAPILLARY("Capillary", List.of(ItemType.MP9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    SURVIVALIST("Survivalist", List.of(ItemType.REVOLVER), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    SHRED("Shred", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    AMBER_SLIPSTREAM("Amber Slipstream", List.of(ItemType.AUG), Rarity.MIL_SPEC, new FloatRange(0.00, 0.55)),

    FADE("Fade", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT_STRIPE("Night Stripe", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}