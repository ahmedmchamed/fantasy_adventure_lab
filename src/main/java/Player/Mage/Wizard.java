package Player.Mage;
import Player.Player;
import Item.Item;
import Quest.EnemyType.Enemy;

import java.util.ArrayList;

public class Wizard extends Player implements ICast {

    private ArrayList<MythicalCreature> allCompanions;
    private MythicalCreature currentCompanion;
    private int fireTornado;

    public Wizard(String name, int health, Item equippedItem, ArrayList<MythicalCreature> allCompanions, MythicalCreature currentCompanion, int fireTornado) {
        super(name, health, equippedItem);
        this.allCompanions = allCompanions;
        this.currentCompanion = currentCompanion;
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }

}
