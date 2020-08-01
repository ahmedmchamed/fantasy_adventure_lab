package Player.Warrior;
import Player.Player;
import Item.Item;
import Quest.EnemyType.Enemy;

public class Knight extends Player implements IAttack {

    private int armour;

    public Knight(String name, int health, Item equippedItem, int armour) {
        super(name, health, equippedItem);
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

    public void attackEnemy(Enemy enemy) {

    }

}
