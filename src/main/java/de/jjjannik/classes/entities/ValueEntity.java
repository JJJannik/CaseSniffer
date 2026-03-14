package de.jjjannik.classes.entities;

import de.jjjannik.classes.Case;
import lombok.Data;

@Data
public class ValueEntity {
    private final Case cCase;
    private final double expV;
    private final double roi;
    private final long timestamp;
}