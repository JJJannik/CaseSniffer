package de.jjjannik.classes;

import de.jjjannik.classes.entities.FloatRange;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Wear {
    FN("Factory New", new FloatRange(0.00, 0.07)),
    MW("Minimal Wear", new FloatRange(0.07, 0.15)),
    FT("Field-Tested", new FloatRange(0.15, 0.38)),
    WW("Well-Worn", new FloatRange(0.38, 0.45)),
    BS("Battle-Scarred", new FloatRange(0.45, 1.00));

    @Getter
    private final String value;
    @Getter
    private final FloatRange floatRange;

    public static Wear getByName(String name) {
        return Arrays.stream(values()).filter(c -> c.getValue().equals(name)).findFirst().orElse(null);
    }
}