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
public enum DangerZone implements CSCollection {
    ASIIMOV("Asiimov", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.05, 0.70)),
    NEO_NOIR("Neo-Noir", List.of(ItemType.AWP), Rarity.COVERT, new FloatRange(0.00, 0.50)),
    MECHA_INDUSTRIES("Mecha Industries", List.of(ItemType.DESERT_EAGLE), Rarity.CLASSIFIED, new FloatRange(0.00, 0.60)),
    PHOSPHOR("Phosphor", List.of(ItemType.MP5), Rarity.CLASSIFIED, new FloatRange(0.00, 0.80)),
    MOMENTUM("Momentum", List.of(ItemType.UMP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    PIPE_DOWN("Pipe Down", List.of(ItemType.MAC_10), Rarity.RESTRICTED, new FloatRange(0.00, 0.90)),
    NEVERMORE("Nevermore", List.of(ItemType.P250), Rarity.RESTRICTED, new FloatRange(0.00, 0.40)),
    FLASHBACK("Flashback", List.of(ItemType.USP), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    SIGNAL("Signal", List.of(ItemType.GALIL_AR), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    SCAVENGER("Scavenger", List.of(ItemType.G3SG1), Rarity.RESTRICTED, new FloatRange(0.00, 0.65)),
    MAGNESIUM("Magnesium", List.of(ItemType.M4A4), Rarity.MIL_SPEC),
    FUBAR("Fubar", List.of(ItemType.TEC_9), Rarity.MIL_SPEC, new FloatRange(0.14, 1.00)),
    OXIDE_BLAZE("Oxide Blaze", List.of(ItemType.GLOCK), Rarity.MIL_SPEC, new FloatRange(0.00, 0.85)),
    WOOD_FIRED("Wood Fired", List.of(ItemType.NOVA), Rarity.MIL_SPEC, new FloatRange(0.00, 0.75)),
    BLACK_SAND("Black Sand", List.of(ItemType.SAWED_OFF), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    MODEST_THREAT("Modest Threat", List.of(ItemType.MP9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.75)),
    DANGER_CLOSE("Danger Close", List.of(ItemType.SG_553), Rarity.MIL_SPEC, new FloatRange(0.02, 0.80)),

    FADE("Fade", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
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