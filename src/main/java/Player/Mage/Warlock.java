package Player.Mage;

import Item.Item;
import Player.Player;
import Quest.Enemy;

import java.util.ArrayList;

public class Warlock extends Mage implements ICast{

    private ArrayList<MythicalCreature> allCompanions;
    private MythicalCreature currentCompanion;

    public Warlock(int health, Item equippedItem, String name, ArrayList<MythicalCreature> allCompanions, MythicalCreature currentCompanion) {
        super(health, equippedItem, name);
        this.allCompanions = allCompanions;
        this.currentCompanion = currentCompanion;
    }

    public void receiveDamage(Enemy enemy) {
        if (this.currentCompanion.getHealth() > 0){
            this.currentCompanion.decreaseHealth(enemy.getDealDamage());
        }
        else {
            this.health -= enemy.getDealDamage();
        }
    }

    public void cast(Enemy enemy) {
        enemy.decreaseHealth(this.equippedItem.getDamage());
    }

}
