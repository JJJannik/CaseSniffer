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
public enum Breakout implements CSCollection {
    ASIIMOV("Asiimov", List.of(ItemType.P90), Rarity.COVERT, new FloatRange(0.00, 0.92)),
    CYREX("Cyrex", List.of(ItemType.M4A1), Rarity.COVERT, new FloatRange(0.00, 0.50)),
    WATER("Water Elemental", List.of(ItemType.GLOCK), Rarity.CLASSIFIED, new FloatRange(0.00, 0.70)),
    FOWL_PLAY("Fowl Play", List.of(ItemType.FIVE_SEVEN), Rarity.CLASSIFIED),
    CONSPIRACY("Conspiracy", List.of(ItemType.DESERT_EAGLE), Rarity.CLASSIFIED, new FloatRange(0.00, 0.30)),
    TIGRIS("Tigris", List.of(ItemType.CZ75), Rarity.RESTRICTED),
    SUPERNOVA("Supernova", List.of(ItemType.P250), Rarity.RESTRICTED, new FloatRange(0.00, 0.40)),
    OSIRIS("Osiris", List.of(ItemType.PP_BIZON), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    KOI("Koi", List.of(ItemType.NOVA), Rarity.RESTRICTED, new FloatRange(0.00, 0.30)),
    ABYSS("Abyss", List.of(ItemType.SSG_08), Rarity.MIL_SPEC),
    URBAN_HAZARD("Urban Hazard", List.of(ItemType.MP7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    IVORY("Ivory", List.of(ItemType.P2000), Rarity.MIL_SPEC),
    LABYRINTH("Labyrinth", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.40)),
    DESERT_STRIKE("Desert-Strike", List.of(ItemType.NEGEV), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

    FADE("Fade", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT("Night", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.BUTTERFLY), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}