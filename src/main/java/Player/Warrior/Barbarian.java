package Player.Warrior;

import Item.Item;
import Player.Player;

public class Barbarian extends Warrior {

    private int punchAbility;

    public Barbarian(int health, Item equippedItem, String name, int punchAbility) {
        super(health, equippedItem, name);
        this.punchAbility = punchAbility;
    }
}
