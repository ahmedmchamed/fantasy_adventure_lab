package Player.Warrior;
import Player.Player;
import Player.PlayerType;
import Item.Item;
import Quest.EnemyType.Enemy;

public class Knight extends Player implements IAttackEnemy {

    private int armour;

    public Knight(String name, int health, Item equippedItem, PlayerType playerType, int armour) {
        super(name, health, equippedItem, playerType);
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
        enemy.decreaseHealth(this.equippedItem.getDamage());
    }

}
