package Player.Warrior;

import Item.Item;
import Player.Player;
import Quest.Enemy;

public class Knight extends Warrior implements IAttack {

    private int armour;

    public Knight(int health, Item equippedItem, String name, int armour) {
        super(health, equippedItem, name);
        this.armour = armour;
    }

    public void receiveDamage(Enemy enemy) {
        if (this.armour > 0) {
            this.armour -= enemy.getDealDamage();
        }
        else {
            this.health -= enemy.getDealDamage();
        }
    }

    public int getArmour() {
        return armour;
    }

    public void attack(Enemy enemy) {
        enemy.decreaseHealth(this.equippedItem.getDamage());
    }

}
