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
public enum Prisma implements CSCollection {
    THE_EMPEROR("The Emperor", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    ANGRY_MOB("Angry Mob", List.of(ItemType.FIVE_SEVEN), Rarity.COVERT, new FloatRange(0.00, 0.70)),
    INCINEGATOR("Incinegator", List.of(ItemType.XM1014), Rarity.CLASSIFIED, new FloatRange(0.14, 0.65)),
    MOMENTUM("Momentum", List.of(ItemType.AUG), Rarity.CLASSIFIED, new FloatRange(0.05, 1.00)),
    SKULL_CRUSHER("Skull Crusher", List.of(ItemType.REVOLVER), Rarity.CLASSIFIED, new FloatRange(0.25, 0.80)),
    ATHERIS("Atheris", List.of(ItemType.AWP), Rarity.RESTRICTED),
    LIGHT_RAIL("Light Rail", List.of(ItemType.DESERT_EAGLE), Rarity.RESTRICTED, new FloatRange(0.00, 0.90)),
    BAMBOOZLE("Bamboozle", List.of(ItemType.TEC_9), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    GAUSS("Gauss", List.of(ItemType.MP5), Rarity.RESTRICTED),
    MOONRISE("Moonrise", List.of(ItemType.UMP), Rarity.RESTRICTED, new FloatRange(0.00, 0.40)),
    UNCHARTED("Uncharted", List.of(ItemType.AK_47), Rarity.MIL_SPEC, new FloatRange(0.00, 0.75)),
    MISCHIEF("Mischief", List.of(ItemType.MP7), Rarity.MIL_SPEC, new FloatRange(0.10, 1.00)),
    WHITEFISH("Whitefish", List.of(ItemType.MAC_10), Rarity.MIL_SPEC),
    AKOBEN("Akoben", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC, new FloatRange(0.00, 0.75)),
    CRYPSIS("Crypsis", List.of(ItemType.FAMAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.55)),
    VERDIGRIS("Verdigris", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    OFF_WORLD("Off World", List.of(ItemType.P90), Rarity.MIL_SPEC, new FloatRange(0.00, 0.75)),

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