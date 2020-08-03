package Player;
import Item.Item;
import Quest.EnemyType.Enemy;
import Quest.Room.Treasure.GoldCoin;

import java.util.ArrayList;

public abstract class Player {

    protected String name;
    protected int health;
    protected Item equippedItem;
    protected ArrayList<Item> weaponsInventory;
    protected ArrayList<GoldCoin> goldCollection;
    protected PlayerType playerType;

    public Player(String name, int health, Item equippedItem, PlayerType playerType) {
        this.name = name;
        this.health = health;
        this.equippedItem = equippedItem;
        this.weaponsInventory = new ArrayList<Item>();
        this.goldCollection = new ArrayList<GoldCoin>();
        this.playerType = playerType;
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
        return this.weaponsInventory;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }

    public void increaseHealth(int health) {
        this.health += health;
    }

    public void decreaseHealth(int health) {
        this.health -= health;
    }

    public void addToInventory(Item item) {
        if (item.getPlayerType() == this.getPlayerType()) {
            this.weaponsInventory.add(item);
        }
        else {
            System.out.println("The weapon type doesn't match your chosen class.");
        }
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }

    public void setEquippedItem(Item item) {
        this.equippedItem = item;
    }

    public void setName(String name) {
        this.name = name;
    }
}
