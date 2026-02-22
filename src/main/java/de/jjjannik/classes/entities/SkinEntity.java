package de.jjjannik.classes.entities;

import de.jjjannik.classes.Case;
import de.jjjannik.classes.ItemType;
import de.jjjannik.classes.Rarity;
import de.jjjannik.classes.Wear;
import de.jjjannik.classes.collections.CSCollection;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class SkinEntity {
    private ItemType itemType;
    private CSCollection skin;
    private Rarity rarity;
    private Wear wear;
    private Case cCase;
    private boolean isStatTrak;

    public String toSteamMarketHash() { // Skin Pattern: (StatTrak™) [Item Name] | [Skin Name] ([Wear])
        StringBuilder hashBuilder = new StringBuilder();

        if (itemType == null) { // Case Pattern: [Case Name] Case

            if (cCase == null) {
                throw new IllegalArgumentException("Case cannot be null, when ItemType is.");
            }

            hashBuilder.append(cCase.getValue());
            return hashBuilder.toString();
        }

        if (rarity == Rarity.EXCEEDINGLY_RARE) {
            hashBuilder.append("★ ");
        }

        if (isStatTrak) {
            hashBuilder.append("StatTrak™ ");
        }

        hashBuilder.append(itemType.getValue());

        if (skin == null || skin.getName() == null || skin.getName().isEmpty()) { // no skin -> Vanilla Skin -> Pattern: "★ [Item Name]"
            return hashBuilder.toString();
        }

        hashBuilder.append(" | ");
        hashBuilder.append(skin.getName());

        if (wear == null) {
            throw new IllegalStateException("Wear can't be null here");
        }

        hashBuilder.append(" (%s)".formatted(wear.getValue()));

        return hashBuilder.toString();
    }

    @Override
    public String toString() {
        return "Type: %s, Skin: %s, Rarity: %s, Wear: %s, Case: %s, StatTrak: %s".formatted(itemType, skin.getName(), rarity, wear, cCase, isStatTrak);
    }
}