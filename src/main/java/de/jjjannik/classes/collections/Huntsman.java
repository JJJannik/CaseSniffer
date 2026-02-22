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
public enum Huntsman implements CSCollection {
    DESERT_STRIKE("Desert-Strike", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.70)),
    VULCAN("Vulcan", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.00, 0.90)),
    CAIMAN("Caiman", List.of(ItemType.USP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.40)),
    ATOMIC_ALLOY("Atomic Alloy", List.of(ItemType.M4A1), Rarity.CLASSIFIED, new FloatRange(0.00, 0.90)),
    CYREX("Cyrex", List.of(ItemType.SCAR_20), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    TATTER("Tatter", List.of(ItemType.MAC_10), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    HEAVEN_GUARD("Heaven Guard", List.of(ItemType.XM1014), Rarity.RESTRICTED, new FloatRange(0.03, 0.50)),
    ANTIQUE("Antique", List.of(ItemType.PP_BIZON), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    TORQUE("Torque", List.of(ItemType.AUG), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    PULSE("Pulse", List.of(ItemType.P2000), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    MODULE("Module", List.of(ItemType.P90), Rarity.MIL_SPEC, new FloatRange(0.00, 0.35)),
    TWIST("Twist", List.of(ItemType.CZ75), Rarity.MIL_SPEC),
    ISAAC("Isaac", List.of(ItemType.TEC_9), Rarity.MIL_SPEC),
    KAMI("Kami", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    SLASHED("Slashed", List.of(ItemType.SSG_08), Rarity.MIL_SPEC, new FloatRange(0.15, 0.80)),

    FADE("Fade", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT("Night", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}