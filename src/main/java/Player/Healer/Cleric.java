package Player.Healer;

import Item.Item;

public class Cleric extends Healer {

    private int megaHeal;

    public Cleric(int health, Item equippedItem, String name, int megaHeal) {
        super(health, equippedItem, name);
        this.megaHeal = megaHeal;
    }
}
