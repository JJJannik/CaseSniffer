package de.jjjannik.classes;

import de.jjjannik.classes.entities.FloatRange;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Wear {
    FN("Factory New", new FloatRange(0.00, 0.07), 0.03),
    MW("Minimal Wear", new FloatRange(0.07, 0.15), 0.24),
    FT("Field-Tested", new FloatRange(0.15, 0.38), 0.33),
    WW("Well-Worn", new FloatRange(0.38, 0.45), 0.24),
    BS("Battle-Scarred", new FloatRange(0.45, 1.00), 0.16);

    @Getter
    private final String value;
    @Getter
    private final FloatRange floatRange;
    @Getter
    private final double probability;

    public static Wear getByName(String name) {
        return Arrays.stream(values()).filter(c -> c.getValue().equals(name)).findFirst().orElse(null);
    }
}