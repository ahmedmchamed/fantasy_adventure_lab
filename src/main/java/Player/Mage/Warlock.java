package Player.Mage;
import Player.PlayerType;
import Item.Item;
import Player.Player;
import Quest.EnemyType.Enemy;

import java.util.ArrayList;

public class Warlock extends Player implements ICast {

    private ArrayList<MythicalCreature> companionsList;
    private MythicalCreature currentCompanion;
    private int groundBurst;

    public Warlock(String name, int health, Item equippedItem, PlayerType playerType,
                   MythicalCreature currentCompanion, int groundBurst) {
        super(name, health, equippedItem, playerType);
        this.companionsList = new ArrayList<MythicalCreature>();
        this.currentCompanion = currentCompanion;
        this.groundBurst = groundBurst;
    }

    public void castEnemy(Enemy enemy) {
        int fullDamage = this.equippedItem.getDamage() + this.groundBurst;
    }

    public ArrayList<MythicalCreature> getCompanionsList() {
        return this.companionsList;
    }

    public MythicalCreature getCurrentCompanion() {
        return this.currentCompanion;
    }
}
