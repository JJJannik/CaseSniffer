package de.jjjannik.classes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Rarity {
    MIL_SPEC("Mil-Spec Grade", 79.92), // DARK BLUE
    RESTRICTED("Restricted", 15.89), // PURPLE
    CLASSIFIED("Classified", 3.2),  // PINK
    COVERT("Covert", 0.64), // RED
    EXCEEDINGLY_RARE("Exceedingly Rare", 0.26); // GOLD GOLD GOLD

    @Getter
    private final String name;
    @Getter
    private final double probability; // In %

    public static Rarity getByName(String name) {
        return Arrays.stream(values()).filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }
}