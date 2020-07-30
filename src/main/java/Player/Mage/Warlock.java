package Player.Mage;

import Item.Item;
import Player.Player;

import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<MythicalCreature> allCompanions;
    private MythicalCreature currentCompanion;
    private int groundBurst;

    public Warlock(int health, Item equippedItem, String name, ArrayList<MythicalCreature> allCompanions, MythicalCreature currentCompanion) {
        super(health, equippedItem, name);
        this.allCompanions = allCompanions;
        this.currentCompanion = currentCompanion;
    }
}
