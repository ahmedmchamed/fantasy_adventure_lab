package Player.Healer;

import Item.Item;
import Player.Player;

public class Cleric extends Player {

    private int megaHeal;

    public Cleric(int health, Item equippedItem, String name, int megaHeal) {
        super(health, equippedItem, name);
        this.megaHeal = megaHeal;
    }
}
