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
public enum Shadow implements CSCollection {
    KILL_CONFIRMED("Kill Confirmed", List.of(ItemType.USP), Rarity.COVERT),
    GOLDEN_COIL("Golden Coil", List.of(ItemType.M4A1), Rarity.COVERT),
    FRONTSIDE_MISTY("Frontside Misty", List.of(ItemType.AK_47), Rarity.CLASSIFIED, new FloatRange(0.02, 0.87)),
    BIG_IRON("Big Iron", List.of(ItemType.SSG_08), Rarity.CLASSIFIED, new FloatRange(0.00, 0.64)),
    FLUX("Flux", List.of(ItemType.G3SG1), Rarity.CLASSIFIED, new FloatRange(0.00, 0.90)),
    STONE_COLD("Stone Cold", List.of(ItemType.GALIL_AR), Rarity.RESTRICTED, new FloatRange(0.00, 0.90)),
    WINGSHOT("Wingshot", List.of(ItemType.P250), Rarity.RESTRICTED, new FloatRange(0.00, 0.90)),
    NEBULA_CRUSADER("Nebula Crusader", List.of(ItemType.M249), Rarity.RESTRICTED),
    SPECIAL_DELIVERY("Special Delivery", List.of(ItemType.MP7), Rarity.RESTRICTED, new FloatRange(0.00, 0.62)),
    WRAITHS("Wraiths", List.of(ItemType.GLOCK), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    DUALING_DRAGONS("Dualing Dragons", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC),
    SURVIVOR_Z("Survivor Z", List.of(ItemType.FAMAS), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    SCUMBRIA("Scumbria", List.of(ItemType.XM1014), Rarity.MIL_SPEC),
    GREEN_MARINE("Green Marine", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    COBALT_CORE("Cobalt Core", List.of(ItemType.MAG_7), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    RANGEEN("Rangeen", List.of(ItemType.MAC_10), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

    FADE("Fade", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT("Night", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.SHADOW_DAGGERS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}