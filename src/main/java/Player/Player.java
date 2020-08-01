package Player;

import Item.Item;
import Quest.EnemyType.Enemy;

import java.util.ArrayList;

public abstract class Player {

    protected String name;
    protected int health;
    protected Item equippedItem;
    protected ArrayList<Item> inventory;

    public Player(String name, int health, Item equippedItem) {
        this.name = name;
        this.health = health;
        this.equippedItem = equippedItem;
        this.inventory = new ArrayList<Item>();
    }

    public String getName() {
        return this.name;
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

    public void increaseHealth(int health) {
        this.health += health;
    }

    public void decreaseHealth(int health) {
        this.health -= health;
    }

    public void addToInventory(Item item) {
        this.inventory.add(item);
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }

    public void setHealth(int health) {
        this.health += health;
    }
}
