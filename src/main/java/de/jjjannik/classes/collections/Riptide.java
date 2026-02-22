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
public enum Riptide implements CSCollection {
    LEET_MUSEO("Leet Museo", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.00, 0.65)),
    OCEAN_DRIVE("Ocean Drive", List.of(ItemType.DESERT_EAGLE), Rarity.COVERT),
    SNACK_ATTACK("Snack Attack", List.of(ItemType.GLOCK), Rarity.CLASSIFIED),
    TURBO_PEEK("Turbo Peek", List.of(ItemType.SSG_08), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    TOYBOX("Toybox", List.of(ItemType.MAC_10), Rarity.CLASSIFIED),
    SPIDER_LILY("Spider Lily", List.of(ItemType.M4A4), Rarity.RESTRICTED),
    MOUNT_FUJI("Mount Fuji", List.of(ItemType.MP9), Rarity.RESTRICTED, new FloatRange(0.00, 0.55)),
    ZX_SPECTRON("ZX Spectron", List.of(ItemType.FAMAS), Rarity.RESTRICTED),
    BOOST_PROTOCOL("Boost Protocol", List.of(ItemType.FIVE_SEVEN), Rarity.RESTRICTED, new FloatRange(0.00, 0.41)),
    BI83_SPECTRUM("BI83 Spectrum", List.of(ItemType.MAG_7), Rarity.RESTRICTED, new FloatRange(0.00, 0.60)),
    BLACK_LOTUS("Black Lotus", List.of(ItemType.USP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    WATCHDOG("Watchdog", List.of(ItemType.XM1014), Rarity.MIL_SPEC),
    TREAD("Tread", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC),
    GUERRILLA("Guerrilla", List.of(ItemType.MP7), Rarity.MIL_SPEC),
    KEEPING_TABS("Keeping Tabs", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    LUMEN("Lumen", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC, new FloatRange(0.00, 0.77)),
    PLAGUE("Plague", List.of(ItemType.AUG), Rarity.MIL_SPEC, new FloatRange(0.00, 0.76)),

    GAMMA_DOPPLER("Gamma Doppler", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    LORE("Lore", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE),
    AUTOTRONIC("Autotronic", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.85)),
    FREEHAND("Freehand", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.48)),
    BRIGHT_WATER("Bright Water", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    BLACK_LAMINATE("Black Laminate", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE);

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}