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
public enum Chroma2 implements CSCollection {
    HYPER_BEAST("Hyper Beast", List.of(ItemType.M4A1), Rarity.COVERT),
    NEON_RIDER("Neon Rider", List.of(ItemType.MAC_10), Rarity.COVERT, new FloatRange(0.00, 0.45)),
    ECO("Eco", List.of(ItemType.GALIL_AR), Rarity.CLASSIFIED, new FloatRange(0.10, 0.85)),
    MONKEY_BUSINESS("Monkey Business", List.of(ItemType.FIVE_SEVEN), Rarity.CLASSIFIED, new FloatRange(0.10, 0.90)),
    DJINN("Djinn", List.of(ItemType.FAMAS), Rarity.CLASSIFIED),
    WORM_GOD("Worm God", List.of(ItemType.AWP), Rarity.RESTRICTED, new FloatRange(0.00, 0.45)),
    HEAT("Heat", List.of(ItemType.MAG_7), Rarity.RESTRICTED),
    POLE_POSITION("Pole Position", List.of(ItemType.CZ75), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    GRAND_PRIX("Grand Prix", List.of(ItemType.UMP), Rarity.RESTRICTED, new FloatRange(0.25, 0.35)),
    ELITE_BUILD("Elite Build", List.of(ItemType.AK_47), Rarity.MIL_SPEC),
    ARMOR_CORE("Armor Core", List.of(ItemType.MP7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    VALENCE("Valence", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    BRONZE_DECO("Bronze Deco", List.of(ItemType.DESERT_EAGLE), Rarity.MIL_SPEC, new FloatRange(0.00, 0.46)),
    ORIGAMI("Origami", List.of(ItemType.SAWED_OFF), Rarity.MIL_SPEC, new FloatRange(0.00, 0.55)),
    MAN_O_WAR("Man-o'-war", List.of(ItemType.NEGEV), Rarity.MIL_SPEC, new FloatRange(0.10, 0.20)),

    MARBLE_FADE("Marble Fade", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    DOPPLER("Doppler", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    TIGER_TOOTH("Tiger Tooth", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    ULTRAVIOLET("Ultraviolet", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DAMASCUS("Damascus Steel", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    RUST_COAT("Rust Coat", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.40, 1.00));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}