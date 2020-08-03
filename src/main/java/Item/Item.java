package Item;

import Player.PlayerType;

public abstract class Item {
    protected String name;
    protected int damage;
    protected int healing;
    protected PlayerType playerType;

    public Item(String name, int damage, int healing, PlayerType playerType){
        this.name = name;
        this.damage = damage;
        this.healing = healing;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealing() {
        return healing;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }
}
