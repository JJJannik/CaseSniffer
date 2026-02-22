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
public enum Fever implements CSCollection {
    PRINTSTREAM("Printstream", List.of(ItemType.AWP), Rarity.COVERT),
    BAD_TRIP("Bad Trip", List.of(ItemType.FAMAS), Rarity.COVERT),
    SEARING_RAGE("Searing Rage", List.of(ItemType.AK_47), Rarity.CLASSIFIED),
    SHINOBU("Shinobu", List.of(ItemType.GLOCK), Rarity.CLASSIFIED),
    KO_FACTORY("K.O. Factory", List.of(ItemType.UMP), Rarity.CLASSIFIED),
    WAVE_BREAKER("Wave Breaker", List.of(ItemType.P90), Rarity.RESTRICTED, new FloatRange(0.00, 0.95)),
    RISING_SUN("Rising Sun", List.of(ItemType.NOVA), Rarity.RESTRICTED),
    SERPENT_STRIKE("Serpent Strike", List.of(ItemType.DESERT_EAGLE), Rarity.RESTRICTED, new FloatRange(0.00, 0.57)),
    CONTROL("Control", List.of(ItemType.GALIL_AR), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    TOSAI("Tosai", List.of(ItemType.ZEUS), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    PC_GRN("PC-GRN", List.of(ItemType.USP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    CHOPPA("Choppa", List.of(ItemType.M4A4), Rarity.MIL_SPEC),
    MEMORIAL("Memorial", List.of(ItemType.SSG_08), Rarity.MIL_SPEC),
    NEXUS("Nexus", List.of(ItemType.MP9), Rarity.MIL_SPEC),
    MOCKINGBIRD("Mockingbird", List.of(ItemType.XM1014), Rarity.MIL_SPEC),
    RESUPPLY("Resupply", List.of(ItemType.MAG_7), Rarity.MIL_SPEC),
    SURE_GRIP("Sure Grip", List.of(ItemType.P2000), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),

    MARBLE_FADE("Marble Fade", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    DOPPLER("Doppler", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    TIGER_TOOTH("Tiger Tooth", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    ULTRAVIOLET("Ultraviolet", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DAMASCUS("Damascus Steel", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    RUST_COAT("Rust Coat", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.40, 1.00));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}