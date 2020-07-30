package Player.Mage;

import Item.Item;
import Player.Player;
import Quest.Enemy;

public abstract class Mage extends Player {

    protected Item equippedItem;

    public Mage(int health, Item equippedItem, String name) {
        super(health, name);
        this.equippedItem = equippedItem;
    }

    public Item getEquippedItem() {
        return this.equippedItem;
    }

}
