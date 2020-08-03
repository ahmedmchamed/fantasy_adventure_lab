package Quest.EnemyType;

import Player.Player;

public class Demon extends Enemy implements IAttackPlayer {

    private int undeadSummon;

    public Demon(String name, int dealDamage, int health, EnemyType enemyType, int undeadSummon) {
        super(name, dealDamage, health, enemyType);
        this.undeadSummon = undeadSummon;
    }

    public void attackPlayer(Player player) {
        player.decreaseHealth(this.undeadSummon);
    }

}
