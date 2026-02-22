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
public enum Kilowatt implements CSCollection {
    INHERITANCE("Inheritance", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    CHROME_CANNON("Chrome Cannon", List.of(ItemType.AWP), Rarity.COVERT),
    BLACK_LOTUS("Black Lotus", List.of(ItemType.M4A1), Rarity.CLASSIFIED, new FloatRange(0.00, 0.70)),
    JAWBREAKER("Jawbreaker", List.of(ItemType.USP), Rarity.CLASSIFIED),
    OLYMPUS("Olympus", List.of(ItemType.ZEUS), Rarity.CLASSIFIED, new FloatRange(0.00, 0.67)),
    SMILE("Just Smile", List.of(ItemType.MP7), Rarity.RESTRICTED),
    ETCH_LORD("Etch Lord", List.of(ItemType.M4A4), Rarity.RESTRICTED),
    HYBRID("Hybrid", List.of(ItemType.FIVE_SEVEN), Rarity.RESTRICTED),
    BLOCK("Block-18", List.of(ItemType.GLOCK), Rarity.RESTRICTED, new FloatRange(0.00, 0.67)),
    ANALOG("Analog Input", List.of(ItemType.SAWED_OFF), Rarity.RESTRICTED, new FloatRange(0.00, 0.62)),
    LIGHT_BOX("Light Box", List.of(ItemType.MAC_10), Rarity.MIL_SPEC),
    SLAG("Slag", List.of(ItemType.TEC_9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    DEZASTRE("Dezastre", List.of(ItemType.SSG_08), Rarity.MIL_SPEC),
    IREZUMI("Irezumi", List.of(ItemType.XM1014), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    MOTORIZED("Motorized", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    HIDEOUT("Hideout", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    DARK_SIGIL("Dark Sigil", List.of(ItemType.NOVA), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),

    FADE("Fade", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.KUKRI), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
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