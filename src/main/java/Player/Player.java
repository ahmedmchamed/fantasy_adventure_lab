package Player;

import Item.Item;

import java.util.ArrayList;

public abstract class Player {

    protected int health;
    protected Item equippedItem;
    protected ArrayList<Item> inventory;
    protected String name;

    public Player(int health, Item equippedItem, String name) {
        this.health = health;
        this.equippedItem = equippedItem;
        this.inventory = new ArrayList<Item>();
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public Item getEquippedItem() {
        return this.equippedItem;
    }

    public ArrayList<Item> getInventory() {
        return this.inventory;
    }

    public String getName() {
        return this.name;
    }

}
