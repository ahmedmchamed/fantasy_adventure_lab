package Quest;

public abstract class Enemy {

    protected String name;
    protected int dealDamage;
    protected int health;

    public Enemy(String name, int dealDamage, int health) {
        this.name = name;
        this.dealDamage = dealDamage;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getDealDamage() {
        return this.dealDamage;
    }

    public int getHealth() {
        return this.health;
    }

}
