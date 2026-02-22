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
public enum CSGO3 implements CSCollection {
    VICTORIA("Victoria", List.of(ItemType.CZ75), Rarity.COVERT, new FloatRange(0.00, 0.75)),
    THE_FUSCHIA("The Fuschia Is Now", List.of(ItemType.CZ75), Rarity.CLASSIFIED, new FloatRange(0.00, 0.40)),
    UNDERTOW("Undertow", List.of(ItemType.P250), Rarity.CLASSIFIED, new FloatRange(0.00, 0.20)),
    HEIRLOOM("Heirloom", List.of(ItemType.DESERT_EAGLE), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    COPPER_GALAXY("Copper Galaxy", List.of(ItemType.FIVE_SEVEN), Rarity.RESTRICTED, new FloatRange(0.00, 0.20)),
    TITANIUM_BIT("Titanium Bit", List.of(ItemType.TEC_9), Rarity.RESTRICTED, new FloatRange(0.00, 0.20)),
    TREAD_PLATE("Tread Plate", List.of(ItemType.CZ75), Rarity.RESTRICTED, new FloatRange(0.00, 0.20)),
    STAINLESS("Stainless", List.of(ItemType.USP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    BLUE_FISSURE("Blue Fissure", List.of(ItemType.GLOCK), Rarity.MIL_SPEC, new FloatRange(0.06, 0.58)),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.CZ75), Rarity.MIL_SPEC, new FloatRange(0.06, 0.80)),
    PANTHER("Panther", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.58)),
    RED_FRAGCAM("Red FragCam", List.of(ItemType.P2000), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),

    FADE("Fade", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT("Night", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.BAYONET, ItemType.FLIP, ItemType.GUT, ItemType.KARAMBIT, ItemType.M9_BAYONET), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));;

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}