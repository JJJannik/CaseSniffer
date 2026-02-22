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
public enum BrokenFang implements CSCollection {
    PRINTSTREAM("Printstream", List.of(ItemType.M4A1), Rarity.COVERT, new FloatRange(0.00, 0.80)),
    NEO_NOIR("Neo-Noir", List.of(ItemType.GLOCK), Rarity.COVERT),
    FAIRY_TALE("Fairy Tale", List.of(ItemType.FIVE_SEVEN), Rarity.CLASSIFIED, new FloatRange(0.02, 0.90)),
    CYBER_SECURITY("Cyber Security", List.of(ItemType.M4A4), Rarity.CLASSIFIED, new FloatRange(0.00, 0.98)),
    MONSTER_MASHUP("Monster Mashup", List.of(ItemType.USP), Rarity.CLASSIFIED, new FloatRange(0.00, 0.70)),
    EXOSKELETON("Exoskeleton", List.of(ItemType.AWP), Rarity.RESTRICTED),
    CLEAR_POLYMER("Clear Polymer", List.of(ItemType.NOVA), Rarity.RESTRICTED),
    PARALLAX("Parallax", List.of(ItemType.SSG_08), Rarity.RESTRICTED),
    DEZASTRE("Dezastre", List.of(ItemType.BERETTAS), Rarity.RESTRICTED),
    GOLD_BISMUTH("Gold Bismuth", List.of(ItemType.UMP), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    DEEP_RELIEF("Deep Relief", List.of(ItemType.M249), Rarity.MIL_SPEC),
    VANDAL("Vandal", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC),
    CONDITION_ZERO("Condition Zero", List.of(ItemType.MP5), Rarity.MIL_SPEC),
    VENDETTA("Vendetta", List.of(ItemType.CZ75), Rarity.MIL_SPEC),
    CONTAMINANT("Contaminant", List.of(ItemType.P250), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    DIGITAL_MESH("Digital Mesh", List.of(ItemType.G3SG1), Rarity.MIL_SPEC, new FloatRange(0.00, 0.80)),
    COCOA_RAMPAGE("Cocoa Rampage", List.of(ItemType.P90), Rarity.MIL_SPEC, new FloatRange(0.00, 0.60)),

    JADE("Jade", List.of(ItemType.BROKEN_FANG), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    UNHINGED("Unhinged", List.of(ItemType.BROKEN_FANG), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    YELLOW_BANDED("Yellow-banded", List.of(ItemType.BROKEN_FANG), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NEEDLE_POINT("Needle Point", List.of(ItemType.BROKEN_FANG), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SNOW_LEOPARD("Snow Leopard", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    REZAN_THE_RED("Rezan the Red", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BLACK_TIE("Black Tie", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    QUEEN_JAGUAR("Queen Jaguar", List.of(ItemType.DRIVER), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CAUTION("CAUTION!", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    GIRAFFE("Giraffe", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    DESERT_SHAMAGH("Desert Shamagh", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    CONSTRICTOR("Constrictor", List.of(ItemType.HAND_WRAPS), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BLOOD_PRESSURE("Blood Pressure", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SMOKE_OUT("Smoke Out", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FINISH_LINE("Finish Line", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    COMMAND_COMPANY("3rd Commando Company", List.of(ItemType.MOTO), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    LT_COMMANDER("Lt. Commander", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    TIGER_STRIKE("Tiger Strike", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    MARBLE("Marble Fade", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    FIELD_AGENT("Field Agent", List.of(ItemType.SPECIALIST), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    NOCTS("Nocts", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SLINGSHOT("Slingshot", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    SCARLET_SHAMAGH("Scarlet Shamagh", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80)),
    BIG_GAME("Big Game", List.of(ItemType.SPORT), Rarity.EXCEEDINGLY_RARE, new FloatRange(0.06, 0.80));


    @Getter
    private final String name;
    @Getter
    private final List<ItemType> itemTypes;
    @Getter
    private final Rarity rarity;
    @Getter
    private FloatRange floatRange;
}