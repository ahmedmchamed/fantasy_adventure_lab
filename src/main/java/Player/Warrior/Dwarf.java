package Player.Warrior;

import Item.Item;
import Player.Player;
import Quest.Enemy;

import java.util.Random;

public class Dwarf extends Warrior implements IAttack{

    private int dodge;

    public Dwarf(int health, Item equippedItem, String name, int dodge) {
        super(health, equippedItem, name);
        this.dodge = dodge;
    }


    public void receiveDamage(Enemy enemy) {

        Random rand = new Random();
        this.dodge = rand.nextInt(50);

        if (this.dodge > 25) {
            this.health -= enemy.getDealDamage();
        }
    }

}
