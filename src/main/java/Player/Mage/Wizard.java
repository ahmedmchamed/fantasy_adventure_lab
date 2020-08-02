package Player.Mage;

import Item.Item;
import Player.Player;
import Quest.Enemy;

import java.util.ArrayList;

public class Wizard extends Mage implements ICast {

    private ArrayList<MythicalCreature> allCompanions;
    private MythicalCreature currentCompanion;
    private int fireTornado;

    public Wizard(int health, Item equippedItem, String name, ArrayList<MythicalCreature> allCompanions, MythicalCreature currentCompanion, int fireTornado) {
        super(health, equippedItem, name);
        this.allCompanions = allCompanions;
        this.currentCompanion = currentCompanion;
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }

    @Override
    public void cast(Enemy enemy) {
        enemy.decreaseHealth(this.equippedItem.getDamage() + fireTornado);
    }
}
