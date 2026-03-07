package de.jjjannik.utils.math;

import de.jjjannik.classes.Wear;
import de.jjjannik.classes.entities.FloatRange;

import java.util.*;
import java.util.function.Consumer;

public class FloatDistributionFunction {
    private final Map<FloatRange, Double> definition;
    public static final FloatDistributionFunction STANDARD_FLOAT;

    static {
        Map<FloatRange, Double> def = new HashMap<>();
        // Here follows the float probability distribution for a skin with no float cap -> float (0.00 - 1.00)

        def.put(new FloatRange(0.00, 0.07), Wear.FN.getProbability() / 0.07);
        def.put(new FloatRange(0.08, 0.15), Wear.MW.getProbability() / 0.07);
        def.put(new FloatRange(0.16, 0.38), Wear.FT.getProbability() / 0.22);
        def.put(new FloatRange(0.39, 0.45), Wear.WW.getProbability() / 0.06);
        def.put(new FloatRange(0.46, 1.00), Wear.BS.getProbability() / 0.54);

        // Deadzone 1 - 4
        def.put(new FloatRange(0.07, 0.08), 0.0);
        def.put(new FloatRange(0.15, 0.16), 0.0);
        def.put(new FloatRange(0.38, 0.39), 0.0);
        def.put(new FloatRange(0.45, 0.46), 0.0);

        STANDARD_FLOAT = new FloatDistributionFunction(def);
    }

    private FloatDistributionFunction(Map<FloatRange, Double> definition) {
        this.definition = definition;
    }

    public double getProbability(Wear wear) {
        double prob = 0;

        for (Map.Entry<FloatRange, Double> entry : definition.entrySet()) {
            prob += entry.getKey().getOverlap(wear) * entry.getValue();
        }

        return prob;
    }

    public FloatDistributionFunction modifyForFloatCap(FloatRange cap) {
        if (cap == null) {
            cap = new FloatRange(0.00, 1.00);
        }

        return this.compressAlongX(cap).moveAlongX(cap.getMin());
    }

    public FloatDistributionFunction moveAlongX(double offset) {
        Map<FloatRange, Double> newDefinition = new HashMap<>();

        for (Map.Entry<FloatRange, Double> entry : definition.entrySet()) {
            newDefinition.put(
                    new FloatRange(entry.getKey().getMin() + offset, entry.getKey().getMax() + offset),
                    entry.getValue()
            );
        }

        return new FloatDistributionFunction(newDefinition);
    }

    public FloatDistributionFunction compressAlongX(FloatRange cap) {
        Map<FloatRange, Double> newDefinition = new HashMap<>();

        double factor = cap.getRange();

        definition.keySet()
                .stream()
                .sorted(Comparator.comparingDouble(FloatRange::getMin))
                .forEach(new Consumer<>() {
                    double lastEnd = 0.00;

                    @Override
                    public void accept(FloatRange range) {
                        FloatRange newRange = new FloatRange(lastEnd, range.getRange() * factor + lastEnd);
                        lastEnd = newRange.getMax();

                        newDefinition.put(newRange, definition.get(range) / factor);
                    }
                });

        return new FloatDistributionFunction(newDefinition);
    }

    public Map<FloatRange, Double> getUnmodifiableDefinition() {
        return Collections.unmodifiableMap(definition);
    }
}