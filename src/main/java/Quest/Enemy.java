package Quest;

public abstract class Enemy {

    protected int dealDamage;
    protected int health;

    public Enemy(int dealDamage, int health) {
        this.dealDamage = dealDamage;
        this.health = health;
    }

    public int getDealDamage() {
        return this.dealDamage;
    }

    public int getHealth() {
        return this.health;
    }

}
