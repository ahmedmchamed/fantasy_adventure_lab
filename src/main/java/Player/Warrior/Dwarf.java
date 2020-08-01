package Player.Warrior;
import Player.Player;
import Item.Item;
import Quest.EnemyType.Enemy;

import java.util.Random;

public class Dwarf extends Player {

    private int dodge;

    public Dwarf(String name, int health, Item equippedItem) {
        super(name, health, equippedItem);
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
}
