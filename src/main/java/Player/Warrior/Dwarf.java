package Player.Warrior;
import Player.PlayerType;
import Player.Player;
import Item.Item;
import Quest.EnemyType.Enemy;

import java.util.Random;

public class Dwarf extends Player implements IAttackEnemy {

    private int dodge;

    public Dwarf(String name, int health, Item equippedItem, PlayerType playerType) {
        super(name, health, equippedItem, playerType);
    }

    public void receiveDamage(Enemy enemy) {
        Random rand = new Random();
        this.dodge = rand.nextInt(50);
        if (this.dodge > 25) {
            this.health -= enemy.getDealDamage();
        }
    }

    public int getDodge() {
        return dodge;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.decreaseHealth(this.equippedItem.getDamage());
    }
}
