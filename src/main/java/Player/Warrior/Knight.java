package Player.Warrior;

import Item.Item;
import Player.Player;

public class Knight extends Player {

    private int armour;

    public Knight(int health, Item equippedItem, String name, int armour) {
        super(health, equippedItem, name);
        this.armour = armour;
    }
}
