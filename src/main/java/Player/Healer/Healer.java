package Player.Healer;

import Item.Item;
import Player.Player;
import Quest.Enemy;

public abstract class Healer extends Player {

    protected Item equippedItem;

    public Healer(int health, Item equippedItem, String name) {
        super(health, name);
        this.equippedItem = equippedItem;
    }

    public Item getEquippedItem() {
        return this.equippedItem;
    }

    public void healCharacter(Player player) {
        player.setHealth(this.equippedItem.getHealing());
    }

}
