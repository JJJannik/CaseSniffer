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
public enum Falchion implements CSCollection {
    AQUAMARIN_REVENGE("Aquamarine Revenge", List.of(ItemType.AK_47), Rarity.COVERT),
    HYPER_BEAST("Hyper Beast", List.of(ItemType.AWP), Rarity.COVERT),
    NEMESIS("Nemesis", List.of(ItemType.MP7), Rarity.CLASSIFIED, new FloatRange(0.00, 0.32)),
    CYREX("Cyrex", List.of(ItemType.SG_553), Rarity.CLASSIFIED),
    YELLOW_JACKET("Yellow Jacket", List.of(ItemType.CZ75), Rarity.CLASSIFIED),
    LOUDMOUTH("Loudmouth", List.of(ItemType.NEGEV), Rarity.RESTRICTED, new FloatRange(0.14, 0.65)),
    EVIL_DAIMYO("Evil Daimyo", List.of(ItemType.M4A4), Rarity.RESTRICTED, new FloatRange(0.00, 0.52)),
    HANDGUN("Handgun", List.of(ItemType.P2000), Rarity.RESTRICTED),
    RUBY_POISON("Ruby Poison Dart", List.of(ItemType.MP9), Rarity.RESTRICTED, new FloatRange(0.00, 0.50)),
    NEURAL_NET("Neural Net", List.of(ItemType.FAMAS), Rarity.RESTRICTED, new FloatRange(0.00, 0.60)),
    ROCKET_POP("Rocket Pop", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC),
    BUNSEN_BURNER("Bunsen Burner", List.of(ItemType.GLOCK), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    TORQUE("Torque", List.of(ItemType.USP), Rarity.MIL_SPEC,  new FloatRange(0.00, 0.46)),
    ELITE_BUILD("Elite Build", List.of(ItemType.P90), Rarity.MIL_SPEC),
    RANGER("Ranger", List.of(ItemType.NOVA), Rarity.MIL_SPEC),
    RIOT("Riot", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),

    FADE("Fade", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT("Night", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.FALCHION), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}