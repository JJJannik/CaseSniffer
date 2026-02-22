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
public enum Spectrum implements CSCollection {
    BLOODSPORT("Bloodsport", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.00, 0.45)),
    NEO_NOIR("Neo-Noir", List.of(ItemType.USP), Rarity.COVERT, new FloatRange(0.00, 0.70)),
    DECIMATOR("Decimator", List.of(ItemType.M4A1), Rarity.CLASSIFIED, new FloatRange(0.00, 0.85)),
    FEVER_DREAM("Fever Dream", List.of(ItemType.AWP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.55)),
    XIANGLIU("Xiangliu", List.of(ItemType.CZ75), Rarity.CLASSIFIED, new FloatRange(0.00, 0.56)),
    CRIMSON_TSUNAMI("Crimson Tsunami", List.of(ItemType.GALIL_AR), Rarity.RESTRICTED, new FloatRange(0.00, 0.55)),
    SCAFFOLD("Scaffold", List.of(ItemType.UMP), Rarity.RESTRICTED),
    LAST_DIVE("Last Dive", List.of(ItemType.MAC_10), Rarity.RESTRICTED, new FloatRange(0.00, 0.52)),
    EMERALD_POISON("Emerald Poison Dart", List.of(ItemType.M249), Rarity.RESTRICTED, new FloatRange(0.00, 0.45)),
    SEASONS("Seasons", List.of(ItemType.XM1014), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    OXIDE_BLAZE("Oxide Blaze", List.of(ItemType.DESERT_EAGLE), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    AKOBEN("Akoben", List.of(ItemType.MP7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    ZANDER("Zander", List.of(ItemType.SAWED_OFF), Rarity.MIL_SPEC, new FloatRange(0.05, 1.00)),
    CAPILLARY("Capillary", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    BLUEPRINT("Blueprint", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.75)),
    RIPPLE("Ripple", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    JUNGLE_SLIPSTREAM("Jungle Slipstream", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

    MARBLE_FADE("Marble Fade", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    DOPPLER("Doppler", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    TIGER_TOOTH("Tiger Tooth", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    ULTRAVIOLET("Ultraviolet", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DAMASCUS("Damascus Steel", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    RUST_COAT("Rust Coat", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.FALCHION, ItemType.HUNTSMAN, ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.40, 1.00));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}