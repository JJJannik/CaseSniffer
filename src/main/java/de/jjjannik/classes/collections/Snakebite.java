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
public enum Snakebite implements CSCollection {
    THE_TRAITOR("The Traitor", List.of(ItemType.USP), Rarity.COVERT),
    LIVING_COLOR("In Living Color", List.of(ItemType.M4A4), Rarity.COVERT, new FloatRange(0.00, 0.79)),
    CHROMATIC_ABERRATION("Chromatic Aberration", List.of(ItemType.GALIL_AR), Rarity.CLASSIFIED),
    FOOD_CHAIN("Food Chain", List.of(ItemType.MP9), Rarity.CLASSIFIED),
    XOXO("XOXO", List.of(ItemType.XM1014), Rarity.CLASSIFIED, new FloatRange(0.00, 0.90)),
    SLATE("Slate", List.of(ItemType.AK_47), Rarity.RESTRICTED),
    TRIGGER_DISCIPLINE("Trigger Discipline", List.of(ItemType.DESERT_EAGLE), Rarity.RESTRICTED, new FloatRange(0.00, 0.97)),
    BUTTON_MASHER("Button Masher", List.of(ItemType.MAC_10), Rarity.RESTRICTED),
    CYBER_SHELL("Cyber Shell", List.of(ItemType.P250), Rarity.RESTRICTED, new FloatRange(0.00, 0.85)),
    DEV_TEXTURE("dev_texture", List.of(ItemType.NEGEV), Rarity.RESTRICTED, new FloatRange(0.00, 0.65)),
    CLEAR_POLYMER("Clear Polymer", List.of(ItemType.GLOCK), Rarity.MIL_SPEC),
    CIRCAETUS("Circaetus", List.of(ItemType.CZ75), Rarity.MIL_SPEC, new FloatRange(0.00, 0.90)),
    JUNK_YARD("Junk Yard", List.of(ItemType.REVOLVER), Rarity.MIL_SPEC),
    HEAVY_METAL("Heavy Metal", List.of(ItemType.SG_553), Rarity.MIL_SPEC),
    WINDBLOWN("Windblown", List.of(ItemType.NOVA), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),
    OSIPR("O.S.I.P.R.", List.of(ItemType.M249), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),
    OSCILLATOR("Oscillator", List.of(ItemType.UMP), Rarity.MIL_SPEC, new FloatRange(0.00, 0.50)),

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