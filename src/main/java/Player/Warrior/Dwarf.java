package Player.Warrior;

import Item.Item;
import Player.Player;

public class Dwarf extends Player {

    private boolean dodge;
    public Dwarf(int health, Item equippedItem, String name, Boolean dodge) {
        super(health, equippedItem, name);
        this.dodge =dodge;
    }
}
