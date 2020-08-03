package Player.Mage;
import Player.PlayerType;
import Player.Player;
import Item.Item;
import Quest.EnemyType.Enemy;

import java.util.ArrayList;

public class Wizard extends Player implements ICast {

    private ArrayList<MythicalCreature> companionsList;
    private MythicalCreature currentCompanion;
    private int fireTornado;

    public Wizard(String name, int health, Item equippedItem, PlayerType playerType, MythicalCreature currentCompanion, int fireTornado) {
        super(name, health, equippedItem, playerType);
        this.companionsList = new ArrayList<MythicalCreature>();
        this.currentCompanion = currentCompanion;
        this.fireTornado = fireTornado;
    }

    public void castEnemy(Enemy enemy) {
        int fullDamage = this.fireTornado + this.getEquippedItem().getDamage();
        enemy.decreaseHealth(fullDamage);
    }

}
