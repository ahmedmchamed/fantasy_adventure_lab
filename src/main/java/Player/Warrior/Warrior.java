package Player.Warrior;

import Item.Item;
import Player.Player;
import Quest.Enemy;

public abstract class Warrior extends Player {
    protected Item equippedItem;

    public Warrior(int health, Item equippedItem, String name) {
        super(health, name);
        this.equippedItem = equippedItem;
    }
    public Item getEquippedItem() {
        return this.equippedItem;
    }

}
