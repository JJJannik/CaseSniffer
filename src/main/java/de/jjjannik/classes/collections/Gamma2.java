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
public enum Gamma2 implements CSCollection {
    NEON_REVOLUTION("Neon Revolution", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    ROLL_CAGE("Roll Cage", List.of(ItemType.FAMAS), Rarity.COVERT),
    FUEL_INJECTOR("Fuel Injector", List.of(ItemType.TEC_9), Rarity.CLASSIFIED),
    AIRLOCK("Airlock", List.of(ItemType.MP9), Rarity.CLASSIFIED),
    SYD_MEAD("Syd Mead", List.of(ItemType.AUG), Rarity.CLASSIFIED, new FloatRange(0.00, 0.80)),
    DIRECTIVE("Directive", List.of(ItemType.DESERT_EAGLE), Rarity.RESTRICTED, new FloatRange(0.06, 1.00)),
    WEASEL("Weasel", List.of(ItemType.GLOCK), Rarity.RESTRICTED),
    POWERCORE("Powercore", List.of(ItemType.SCAR_20), Rarity.RESTRICTED),
    TRIARCH("Triarch", List.of(ItemType.SG_553), Rarity.RESTRICTED),
    PETROGLYPH("Petroglyph", List.of(ItemType.MAG_7), Rarity.RESTRICTED, new FloatRange(0.00, 0.44)),
    IMPRINT("Imprint", List.of(ItemType.CZ75), Rarity.MIL_SPEC),
    SCUMBRIA("Scumbria", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC),
    DAZZLE("Dazzle", List.of(ItemType.NEGEV), Rarity.MIL_SPEC, new FloatRange(0.10, 0.65)),
    GRIM("Grim", List.of(ItemType.P90), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    SLIPSTREAM("Slipstream", List.of(ItemType.XM1014), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    BRIEFING("Briefing", List.of(ItemType.UMP), Rarity.MIL_SPEC),
    VENTILATOR("Ventilator", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.45)),

    GAMMA_DOPPLER("Gamma Doppler", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    LORE("Lore", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    AUTOTRONIC("Autotronic", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.85)),
    FREEHAND("Freehand", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.48)),
    BRIGHT_WATER("Bright Water", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    BLACK_LAMINATE("Black Laminate", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE);

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}