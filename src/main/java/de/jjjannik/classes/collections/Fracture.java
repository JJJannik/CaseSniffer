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
public enum Fracture implements CSCollection {
    PRINTSTREAM("Printstream", List.of(ItemType.DESERT_EAGLE), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    LEGION_ANUBIS("Legion of Anubis", List.of(ItemType.AK_47), Rarity.COVERT, new FloatRange(0.00, 0.70)),
    TOOTH_FAIRY("Tooth Fairy", List.of(ItemType.M4A4), Rarity.CLASSIFIED, new FloatRange(0.00, 0.73)),
    VOGUE("Vogue", List.of(ItemType.GLOCK), Rarity.CLASSIFIED, new FloatRange(0.00, 0.75)),
    ENTOMBED("Entombed", List.of(ItemType.XM1014), Rarity.CLASSIFIED, new FloatRange(0.00, 0.50)),
    MONSTER_CALL("Monster Call", List.of(ItemType.MAG_7), Rarity.RESTRICTED),
    BROTHER("Brother", List.of(ItemType.TEC_9), Rarity.RESTRICTED),
    ALLURE("Allure", List.of(ItemType.MAC_10), Rarity.RESTRICTED),
    CONNEXION("Connexion", List.of(ItemType.GALIL_AR), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    KITBASH("Kitbash", List.of(ItemType.MP5), Rarity.RESTRICTED, new FloatRange(0.00, 0.80)),
    RUNIC("Runic", List.of(ItemType.PP_BIZON), Rarity.MIL_SPEC),
    MAINFRAME("Mainframe 001", List.of(ItemType.SSG_08), Rarity.MIL_SPEC),
    GNARLED("Gnarled", List.of(ItemType.P2000), Rarity.MIL_SPEC),
    FREIGHT("Freight", List.of(ItemType.P90), Rarity.MIL_SPEC),
    CASSETTE("Cassette", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),
    OL_RUSTY("Ol' Rusty", List.of(ItemType.SG_553), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    ULTRALIGHT("Ultralight", List.of(ItemType.NEGEV), Rarity.MIL_SPEC, new FloatRange(0.00, 0.79)),

    FADE("Fade", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    HARDENED("Case Hardened", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE),
    CRIMSON("Crimson Web", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NIGHT_STRIPE("Night Stripe", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCORCHED("Scorched", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    STAINED("Stained", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE),
    BOREAL("Boreal Forest", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FOREST("Forest DDPAT", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    URBAN("Urban Masked", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SAFARI("Safari Mesh", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));

    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}