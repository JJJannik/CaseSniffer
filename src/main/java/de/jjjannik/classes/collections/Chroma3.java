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
public enum Chroma3 implements CSCollection {
    CHANTICO_FIRE("Chantico's Fire", List.of(ItemType.M4A1), Rarity.COVERT, new FloatRange(0.00, 0.99)),
    JUDGEMENT_ANUBIS("Judgement of Anubis", List.of(ItemType.PP_BIZON), Rarity.COVERT, new FloatRange(0.00, 0.50)),
    ASIIMOV("Asiimov", List.of(ItemType.P250), Rarity.CLASSIFIED, new FloatRange(0.10, 1.00)),
    FLEET_FLOCK("Fleet Flock", List.of(ItemType.AUG), Rarity.CLASSIFIED),
    PRIMAL_SABER("Primal Saber", List.of(ItemType.UMP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.77)),
    GHOST_CRUSADER("Ghost Crusader", List.of(ItemType.SSG_08), Rarity.RESTRICTED),
    FIREFIGHT("Firefight", List.of(ItemType.GALIL_AR), Rarity.RESTRICTED),
    BLACK_TIE("Black Tie", List.of(ItemType.XM1014), Rarity.RESTRICTED, new FloatRange(0.00, 0.75)),
    RE_ENTRY("Re-Entry", List.of(ItemType.TEC_9), Rarity.RESTRICTED, new FloatRange(0.00, 0.43)),
    RED_ASTOR("Red Astor", List.of(ItemType.CZ75), Rarity.RESTRICTED),
    FUBAR("Fubar", List.of(ItemType.SAWED_OFF), Rarity.MIL_SPEC, new FloatRange(0.40, 1.00)),
    BIOLEAK("Bioleak", List.of(ItemType.MP9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    ORANGE_CRASH("Orange Crash", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.52)),
    OCEANIC("Oceanic", List.of(ItemType.P2000), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    ATLAS("Atlas", List.of(ItemType.SG_553), Rarity.MIL_SPEC, new FloatRange(0.00, 0.81)),
    VENTILATORS("Ventilators", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.45)),
    SPECTRE("Spectre", List.of(ItemType.M249), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

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