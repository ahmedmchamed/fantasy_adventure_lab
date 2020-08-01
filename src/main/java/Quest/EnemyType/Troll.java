package Quest.EnemyType;

public class Troll extends Enemy {

    private int groundSmash;

    public Troll(String name, int dealDamage, int health, int groundSmash) {
        super(name, dealDamage, health);
        this.groundSmash = groundSmash;
    }
}
