package Quest.EnemyType;

import Player.Player;

public class Troll extends Enemy implements IAttackPlayer {

    private int groundSmash;

    public Troll(String name, int dealDamage, int health, EnemyType enemyType, int groundSmash) {
        super(name, dealDamage, health, enemyType);
        this.groundSmash = groundSmash;
    }

    public void attackPlayer(Player player) {
        player.decreaseHealth(this.groundSmash);
    }

}
