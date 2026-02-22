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
public enum Gamma implements CSCollection {
    MECHA_INDUSTRIES("Mecha Industries", List.of(ItemType.M4A1), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    WASTELAND_REBEL("Wasteland Rebel", List.of(ItemType.GLOCK), Rarity.COVERT, new FloatRange(0.00, 0.54)),
    DESOLATE_SPACE("Desolate Space", List.of(ItemType.M4A4), Rarity.CLASSIFIED),
    IMPERIAL_DRAGON("Imperial Dragon", List.of(ItemType.P2000), Rarity.CLASSIFIED, new FloatRange(0.00, 0.63)),
    BLOODSPORT("Bloodsport", List.of(ItemType.SCAR_20), Rarity.CLASSIFIED, new FloatRange(0.00, 0.45)),
    PHOBOS("Phobos", List.of(ItemType.AWP), Rarity.RESTRICTED, new FloatRange(0.00, 0.40)),
    REBOOT("Reboot", List.of(ItemType.REVOLVER), Rarity.RESTRICTED),
    LIMELIGHT("Limelight", List.of(ItemType.SAWED_OFF), Rarity.RESTRICTED),
    ARISTOCRAT("Aristocrat", List.of(ItemType.AUG), Rarity.RESTRICTED, new FloatRange(0.00, 0.65)),
    CHOPPER("Chopper", List.of(ItemType.P90), Rarity.RESTRICTED, new FloatRange(0.00, 0.60)),
    VIOLENT_DAIMYO("Violent Daimyo", List.of(ItemType.FIVE_SEVEN), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    CARNIVORE("Carnivore", List.of(ItemType.MAC_10), Rarity.MIL_SPEC),
    IRON_CLAD("Iron Clad", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.05, 0.80)),
    ICE_CAP("Ice Cap", List.of(ItemType.TEC_9), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    HARVESTER("Harvester", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC),
    AERIAL("Aerial", List.of(ItemType.SG_553), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    EXO("Exo", List.of(ItemType.NOVA), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

    GAMMA_DOPPLER("Gamma Doppler", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    LORE("Lore", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    AUTOTRONIC("Autotronic", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.85)),
    FREEHAND("Freehand", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.48)),
    BRIGHT_WATER("Bright Water", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.50)),
    BLACK_LAMINATE("Black Laminate", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE);

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}