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
public enum DreamsNightmares implements CSCollection {
    NIGHTWISH("Nightwish", List.of(ItemType.AK_47), Rarity.COVERT),
    STARLIGHT_PROT("Starlight Protector", List.of(ItemType.MP9), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    ABYSSAL_APPARITION("Abyssal Apparition", List.of(ItemType.MP7), Rarity.CLASSIFIED),
    RAPID_EYE("Rapid Eye Movement", List.of(ItemType.FAMAS), Rarity.CLASSIFIED),
    MELONDRAMA("Melondrama", List.of(ItemType.BERETTAS), Rarity.CLASSIFIED),
    NIGHT_TERROR("Night Terror", List.of(ItemType.M4A1), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    TICKET2HELL("Ticket to Hell", List.of(ItemType.USP), Rarity.RESTRICTED, new FloatRange(0.00, 0.76)),
    DREAM_GLADE("Dream Glade", List.of(ItemType.G3SG1), Rarity.RESTRICTED),
    SPACE_CAT("Space Cat", List.of(ItemType.PP_BIZON), Rarity.RESTRICTED, new FloatRange(0.00, 0.67)),
    ZOMBIE_OFFENSIVE("Zombie Offensive", List.of(ItemType.XM1014), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    SCRAWL("Scrawl", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC),
    NECRO("Necro Jr.", List.of(ItemType.MP5), Rarity.MIL_SPEC),
    ENSNARED("Ensnared", List.of(ItemType.MAC_10), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    LIFTED_SPIRITS("Lifted Spirits", List.of(ItemType.P2000), Rarity.MIL_SPEC),
    SPIRIT_BOARD("Spirit Board", List.of(ItemType.SAWED_OFF), Rarity.MIL_SPEC),
    FORESIGHT("Foresight", List.of(ItemType.MAG_7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    POULTRYGEIST("Poultrygeist", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.57)),

    GAMMA_DOPPLER("Gamma Doppler", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.SHADOW_DAGGERS, ItemType.FALCHION, ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    LORE("Lore", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.SHADOW_DAGGERS, ItemType.FALCHION, ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE),
    AUTOTRONIC("Autotronic", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.SHADOW_DAGGERS, ItemType.FALCHION, ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.85)),
    FREEHAND("Freehand", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.SHADOW_DAGGERS, ItemType.FALCHION, ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.48)),
    BRIGHT_WATER("Bright Water", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.SHADOW_DAGGERS, ItemType.FALCHION, ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    BLACK_LAMINATE("Black Laminate", List.of(ItemType.BOWIE, ItemType.BUTTERFLY, ItemType.SHADOW_DAGGERS, ItemType.FALCHION, ItemType.HUNTSMAN), Rarity.EXCEEDINGLY_RARE);

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}