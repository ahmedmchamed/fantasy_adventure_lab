package Quest.EnemyType;

import Quest.Enemy;

public class Troll extends Enemy {

    private int groundSmash;

    public Troll(String name, int dealDamage, int health, int groundSmash) {
        super(name, dealDamage, health);
        this.groundSmash = groundSmash;
    }
}
