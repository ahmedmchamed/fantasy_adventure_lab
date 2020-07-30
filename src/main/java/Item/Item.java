package Item;

public abstract class Item {
    protected String name;
    protected int damage;
    protected int healing;

    public Item(String name, int damage, int healing){
        this.name = name;
        this.damage = damage;
        this.healing = healing;
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
}
