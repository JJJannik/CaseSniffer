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
public enum Spectrum2 implements CSCollection {
    THE_EMPRESS("The Empress", List.of(ItemType.AK_47), Rarity.COVERT),
    SEE_YA_LATER("See Ya Later", List.of(ItemType.P250), Rarity.COVERT, new FloatRange(0.00, 0.70)),
    LEADED_GLASS("Leaded Glass", List.of(ItemType.M4A1), Rarity.CLASSIFIED, new FloatRange(0.00, 0.70)),
    HIGH_ROLLER("High Roller", List.of(ItemType.PP_BIZON), Rarity.CLASSIFIED),
    LLAMA_CANNON("Llama Cannon", List.of(ItemType.REVOLVER), Rarity.CLASSIFIED, new FloatRange(0.03, 0.70)),
    GOO("Goo", List.of(ItemType.MP9), Rarity.RESTRICTED, new FloatRange(0.00, 0.60)),
    TACTICAT("Tacticat", List.of(ItemType.CZ75), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    ZIGGY("Ziggy", List.of(ItemType.XM1014), Rarity.RESTRICTED, new FloatRange(0.00, 0.72)),
    PHANTOM("Phantom", List.of(ItemType.SG_553), Rarity.RESTRICTED, new FloatRange(0.00, 0.60)),
    EXPOSURE("Exposure", List.of(ItemType.UMP), Rarity.RESTRICTED, new FloatRange(0.00, 0.55)),
    OFF_WORLD("Off World", List.of(ItemType.GLOCK), Rarity.MIL_SPEC),
    CRACKED_OPAL("Cracked Opal", List.of(ItemType.TEC_9), Rarity.MIL_SPEC),
    TRIQUA("Triqua", List.of(ItemType.AUG), Rarity.MIL_SPEC),
    HUNTER("Hunter", List.of(ItemType.G3SG1), Rarity.MIL_SPEC),
    MORRIS("Morris", List.of(ItemType.SAWED_OFF), Rarity.MIL_SPEC),
    OCEANIC("Oceanic", List.of(ItemType.MAC_10), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    JUNGLE_SLIPSTREAM("Jungle Slipstream", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

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