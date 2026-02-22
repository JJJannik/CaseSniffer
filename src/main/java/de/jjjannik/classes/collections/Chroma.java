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
public enum Chroma implements CSCollection {
    CHATTERBOX("Chatterbox", List.of(ItemType.GALIL_AR), Rarity.COVERT, new FloatRange(0.35, 0.85)),
    MAN_O_WAR("Man-o'-war", List.of(ItemType.AWP), Rarity.COVERT, new FloatRange(0.10, 0.20)),
    CARTEL("Cartel", List.of(ItemType.AK_47), Rarity.CLASSIFIED, new FloatRange(0.00, 0.75)),
    DRAGON_KING("龍王 (Dragon King)", List.of(ItemType.M4A4), Rarity.CLASSIFIED, new FloatRange(0.00, 0.75)),
    MUERTOS("Muertos", List.of(ItemType.P250), Rarity.CLASSIFIED, new FloatRange(0.00, 0.60)),
    NAGA("Naga", List.of(ItemType.DESERT_EAGLE), Rarity.RESTRICTED),
    MALACHITE("Malachite", List.of(ItemType.MAC_10), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    URBAN_SHOCK("Urban Shock", List.of(ItemType.BERETTAS), Rarity.RESTRICTED, new FloatRange(0.00, 0.47)),
    SERENITY("Serenity", List.of(ItemType.SAWED_OFF), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    DEADLY_POISON("Deadly Poison", List.of(ItemType.MP9), Rarity.MIL_SPEC),
    CATACOMBS("Catacombs", List.of(ItemType.GLOCK), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    SYSTEM_LOCK("System Lock", List.of(ItemType.M249), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    QUICKSILVER("Quicksilver", List.of(ItemType.XM1014), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    GROTTO("Grotto", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

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