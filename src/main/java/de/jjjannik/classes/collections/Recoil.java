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
public enum Recoil implements CSCollection {
    PRINTSTREAM("Printstream", List.of(ItemType.USP), Rarity.COVERT, new FloatRange(0.00, 0.85)),
    CHROMATIC_ABERRATION("Chromatic Aberration", List.of(ItemType.AWP), Rarity.COVERT, new FloatRange(0.00, 0.70)),
    ICE_COALED("Ice Coaled", List.of(ItemType.AK_47), Rarity.CLASSIFIED, new FloatRange(0.00, 0.77)),
    KISS_LOVE("Kiss♥Love", List.of(ItemType.SAWED_OFF), Rarity.CLASSIFIED),
    VISIONS("Visions", List.of(ItemType.P250), Rarity.CLASSIFIED, new FloatRange(0.00, 0.70)),
    FLORA_CARNIVORA("Flora Carnivora", List.of(ItemType.BERETTAS), Rarity.RESTRICTED),
    CRAZY_8("Crazy 8", List.of(ItemType.REVOLVER), Rarity.RESTRICTED),
    DRAGON_TECH("Dragon Tech", List.of(ItemType.SG_553), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    VENT_RUSH("Vent Rush", List.of(ItemType.P90), Rarity.RESTRICTED, new FloatRange(0.00, 0.70)),
    DOWNTOWN("Downtown", List.of(ItemType.M249), Rarity.RESTRICTED, new FloatRange(0.00, 0.65)),
    POLY_MAG("Poly Mag", List.of(ItemType.M4A4), Rarity.MIL_SPEC),
    WINTERIZED("Winterized", List.of(ItemType.GLOCK), Rarity.MIL_SPEC),
    MEOW_36("Meow 36", List.of(ItemType.FAMAS), Rarity.MIL_SPEC),
    MONKEYFLAGE("Monkeyflage", List.of(ItemType.MAC_10), Rarity.MIL_SPEC),
    DROP_ME("Drop Me", List.of(ItemType.NEGEV), Rarity.MIL_SPEC),
    ROADBLOCK("Roadblock", List.of(ItemType.UMP), Rarity.MIL_SPEC),
    DESTROYER("Destroyer", List.of(ItemType.GALIL_AR), Rarity.MIL_SPEC, new FloatRange(0.00, 0.70)),

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