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
public enum Prisma2 implements CSCollection {
    PLAYER_TWO("Player Two", List.of(ItemType.M4A1), Rarity.COVERT, new FloatRange(0.00, 0.84)),
    BULLET_QUEEN("Bullet Queen", List.of(ItemType.GLOCK), Rarity.COVERT),
    PHANTOM_DISRUPTOR("Phantom Disruptor", List.of(ItemType.AK_47), Rarity.CLASSIFIED, new FloatRange(0.00, 0.65)),
    DISCO_TECH("Disco Tech", List.of(ItemType.MAC_10), Rarity.CLASSIFIED),
    JUSTICE("Justice", List.of(ItemType.MAG_7), Rarity.CLASSIFIED),
    FEVER_DREAM("Fever Dream", List.of(ItemType.SSG_08), Rarity.RESTRICTED, new FloatRange(0.00, 0.72)),
    ACID_ETCHED("Acid Etched", List.of(ItemType.P2000), Rarity.RESTRICTED),
    DARKWING("Darkwing", List.of(ItemType.SG_553), Rarity.RESTRICTED),
    ENFORCER("Enforcer", List.of(ItemType.SCAR_20), Rarity.RESTRICTED),
    APOCALYPTO("Apocalypto", List.of(ItemType.SAWED_OFF), Rarity.RESTRICTED),
    CAPILLARY("Capillary", List.of(ItemType.AWP), Rarity.MIL_SPEC, new FloatRange(0.05, 0.70)),
    BLUE_PLY("Blue Ply", List.of(ItemType.DESERT_EAGLE), Rarity.MIL_SPEC),
    DESERT_STRIKE("Desert Strike", List.of(ItemType.MP5), Rarity.MIL_SPEC),
    DISTRESSED("Distressed", List.of(ItemType.CZ75), Rarity.MIL_SPEC),
    TOM_CAT("Tom Cat", List.of(ItemType.AUG), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    PROTOTYPE("Prototype", List.of(ItemType.NEGEV), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    BONE_FORGED("Bone Forged", List.of(ItemType.REVOLVER), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),

    MARBLE_FADE("Marble Fade", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    DOPPLER("Doppler", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    TIGER_TOOTH("Tiger Tooth", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    ULTRAVIOLET("Ultraviolet", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DAMASCUS("Damascus Steel", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    RUST_COAT("Rust Coat", List.of(ItemType.NAVAJA, ItemType.STILETTO, ItemType.TALON, ItemType.URSUS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.40, 1.00));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}