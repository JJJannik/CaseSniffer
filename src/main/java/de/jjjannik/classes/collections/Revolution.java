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
public enum Revolution implements CSCollection {
    TEMUKAU("Temukau", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    HEADSHOT("Head Shot", List.of(ItemType.AK_47), Rarity.COVERT),
    DUALITY("Duality", List.of(ItemType.AWP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.80)),
    WICKED("Wicked Sick", List.of(ItemType.P2000), Rarity.CLASSIFIED),
    WILD_CHILD("Wild Child", List.of(ItemType.UMP), Rarity.CLASSIFIED),
    EMPHOROSAUR("Emphorosaur-S", List.of(ItemType.M4A1), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    BANANA("Banana Cannon", List.of(ItemType.REVOLVER), Rarity.RESTRICTED),
    UMBRAL("Umbral Rabbit", List.of(ItemType.GLOCK), Rarity.RESTRICTED, new FloatRange(0.00, 0.75)),
    NEOQUEEN("Neoqueen", List.of(ItemType.P90), Rarity.RESTRICTED, new FloatRange(0.00, 0.60)),
    SAKKAKU("Sakkaku", List.of(ItemType.MAC_10), Rarity.RESTRICTED, new FloatRange(0.21, 0.79)),
    LIQUIDATION("Liquidation", List.of(ItemType.MP5), Rarity.MIL_SPEC),
    FEATHERWEIGHT("Featherweight", List.of(ItemType.MP9), Rarity.MIL_SPEC),
    REBEL("Rebel", List.of(ItemType.TEC_9), Rarity.MIL_SPEC),
    INSOMNIA("Insomnia", List.of(ItemType.MAG_7), Rarity.MIL_SPEC),
    CYBERFORCE("Cyberforce", List.of(ItemType.SG_553), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    REBUILT("Re.built", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    FRAGMENTS("Fragments", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.78)),

    IMPERIAL_PLAID("Imperial Plaid", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    KING_SNAKE("King Snake", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    OVERTAKE("Overtake", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    RACING_GREEN("Racing Green", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    COBALT_SKULLS("Cobalt Skulls", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    OVERPRINT("Overprint", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DUCT_TAPE("Duct Tape", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    ARBOREAL("Arboreal", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    EMERALD("Emerald", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    MANGROVE("Mangrove", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    RATTLER("Rattler", List.of(ItemType.HYDRA), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    POW("POW!", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    POLYGON("Polygon", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    TURTLE("Turtle", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    TRANSPORT("Transport", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    MOGUL("Mogul", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FADE("Fade", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BUCKSHOT("Buckshot", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    AMPHIBIOUS("Amphibious", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    VICE("Vice", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    OMEGA("Omega", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BRONZE_MORPH("Bronze Morph", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}