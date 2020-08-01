package Player.Mage;

import Item.Item;
import Player.Player;

import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<MythicalCreature> companionsList;
    private MythicalCreature currentCompanion;
    private int groundBurst;

    public Warlock(String name, int health, Item equippedItem, MythicalCreature currentCompanion) {
        super(name, health, equippedItem);
        this.companionsList = new ArrayList<MythicalCreature>();
        this.currentCompanion = currentCompanion;
    }
}
