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
public enum ShatteredWeb implements CSCollection {
    CONTAINMENT_BREACH("Containment Breach", List.of(ItemType.AWP), Rarity.COVERT),
    STALKER("Stalker", List.of(ItemType.MAC_10), Rarity.COVERT),
    BLOODSHOT("Bloodshot", List.of(ItemType.SSG_08), Rarity.CLASSIFIED, new FloatRange(0.14, 0.60)),
    DECIMATOR("Decimator", List.of(ItemType.TEC_9), Rarity.CLASSIFIED, new FloatRange(0.00, 0.75)),
    COLONY_IV("Colony IV", List.of(ItemType.SG_553), Rarity.CLASSIFIED),
    RAT_ROD("Rat Rod", List.of(ItemType.AK_47), Rarity.RESTRICTED),
    NEON_PLY("Neon Ply", List.of(ItemType.MP7), Rarity.RESTRICTED),
    EMBARGO("Embargo", List.of(ItemType.PP_BIZON), Rarity.RESTRICTED),
    OBSIDIAN("Obsidian", List.of(ItemType.P2000), Rarity.RESTRICTED),
    ARCTIC_WOLF("Arctic Wolf", List.of(ItemType.AUG), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    BALANCE("Balance", List.of(ItemType.BERETTAS), Rarity.MIL_SPEC),
    MEMENTO("Memento", List.of(ItemType.REVOLVER), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    WARBIRD("Warbird", List.of(ItemType.M249), Rarity.MIL_SPEC, new FloatRange(0.05, 0.65)),
    PLUME("Plume", List.of(ItemType.NOVA), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    BLACK_SAND("Black Sand", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    TORN("Torn", List.of(ItemType.SCAR_20), Rarity.MIL_SPEC, new FloatRange(0.00, 0.45)),
    ACID_WASH("Acid Wash", List.of(ItemType.MP5), Rarity.MIL_SPEC, new FloatRange(0.00, 0.68)),

    FADE("Fade", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.00, 0.08)),
    CASE_HARDENED("Case Hardened", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE),
    SLAUGHTER("Slaughter", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.01, 0.26)),
    BLUE_STEEL("Blue Steel", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE),
    VANILLA("", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE),
    CRIMSON_WEB("Crimson Web", List.of(ItemType.NOMAD, ItemType.PARACORD, ItemType.SKELETON, ItemType.SURVIVAL), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
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