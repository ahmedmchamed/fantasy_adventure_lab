package Player.Mage;

import Item.Item;
import Player.Player;

import java.util.ArrayList;

public class Wizard extends Player {

    private ArrayList<MythicalCreature> allCompanions;
    private MythicalCreature currentCompanion;

    public Wizard(int health, Item equippedItem, String name, ArrayList<MythicalCreature> allCompanions, MythicalCreature currentCompanion) {
        super(health, equippedItem, name);
        this.allCompanions = allCompanions;
        this.currentCompanion = currentCompanion;
    }

}
