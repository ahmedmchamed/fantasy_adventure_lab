package Player.Warrior;

import Item.Item;
import Player.Player;
import Quest.Enemy;

import java.util.Random;

public class Dwarf extends Warrior {

    private int dodge;

    public Dwarf(int health, Item equippedItem, String name) {
        super(health, equippedItem, name);
        Random rand = new Random();
        this.dodge = rand.nextInt(50);
    }

    public void receiveDamage(Enemy enemy) {
        if (this.dodge > 25) {
            this.health -= enemy.getDealDamage();
        }
    }

    public int getDodge() {
        return dodge;
    }
}
