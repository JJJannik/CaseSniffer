package de.jjjannik.classes.entities;

import de.jjjannik.classes.Wear;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
public class FloatRange {
    private final double min;
    private final double max;

    public FloatRange(double min, double max) {
        if (min > max || min < 0.0 || max - 1.0 > 1e-4) {
            throw new IllegalArgumentException("Invalid Float Range [%f, %f]".formatted(min, max));
        }

        this.min = min;
        this.max = max;
    }

    public double getRange() {
        return max - min;
    }

    private static final double EPS = 1e-9;
    public double getOverlap(Wear wear) {
        return BigDecimal
                .valueOf(Math.max(
                        0.0,
                        Math.min(this.max, wear.getFloatRange().max) - Math.max(this.min, wear.getFloatRange().min - EPS)
                ))
                .setScale(5, RoundingMode.HALF_UP)
                .doubleValue();
    }
}