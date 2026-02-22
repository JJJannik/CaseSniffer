package de.jjjannik.classes.collections;

import de.jjjannik.classes.ItemType;
import de.jjjannik.classes.Rarity;
import de.jjjannik.classes.entities.FloatRange;

import java.util.List;

public interface CSCollection {
    String getName();
    List<ItemType> getItemTypes();
    Rarity getRarity();
    FloatRange getFloatRange();
}