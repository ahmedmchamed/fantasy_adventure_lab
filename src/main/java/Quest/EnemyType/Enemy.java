package Quest.EnemyType;

public abstract class Enemy {

    protected String name;
    protected int dealDamage;
    protected int health;
    protected EnemyType enemyType;

    public Enemy(String name, int dealDamage, int health, EnemyType enemyType) {
        this.name = name;
        this.dealDamage = dealDamage;
        this.health = health;
        this.enemyType = enemyType;
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

    public EnemyType getEnemyType() {
        return this.enemyType;
    }

    public void increaseHealth(int health) {
        this.health +=  health;
    }

    public void decreaseHealth(int health) {
        this.health -= health;
    }

}
