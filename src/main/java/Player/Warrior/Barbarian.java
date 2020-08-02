package Player.Warrior;

import Item.Item;
import Player.Player;
import Quest.Enemy;

public class Barbarian extends Warrior implements IAttack{

    private int brutality;

    public Barbarian(int health, Item equippedItem, String name, int brutality) {
        super(health, equippedItem, name);
        this.brutality = brutality;
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }

    public void attack(Enemy enemy){
        enemy.decreaseHealth(this.equippedItem.getDamage() * brutality);
    }
}
