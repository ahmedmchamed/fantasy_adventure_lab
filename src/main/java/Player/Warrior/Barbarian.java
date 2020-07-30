package Player.Warrior;

import Item.Item;
import Player.Player;
import Quest.Enemy;

public class Barbarian extends Warrior {

    private int punchAbility;

    public Barbarian(int health, Item equippedItem, String name, int punchAbility) {
        super(health, equippedItem, name);
        this.punchAbility = punchAbility;
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }
}
