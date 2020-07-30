package Player.Healer;

import Item.Item;
import Quest.Enemy;

public class Cleric extends Healer {

    private int megaHeal;

    public Cleric(int health, Item equippedItem, String name, int megaHeal) {
        super(health, equippedItem, name);
        this.megaHeal = megaHeal;
    }


}
