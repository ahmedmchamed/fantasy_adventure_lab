package Quest.EnemyType;

import Player.Player;

public class Ogre extends Enemy implements IAttackPlayer {

    private int laserBeam;

    public Ogre(String name, int dealDamage, int health, EnemyType enemyType, int laserBeam) {
        super(name, dealDamage, health, enemyType);
        this.laserBeam = laserBeam;
    }

    public void attackPlayer(Player player) {
        player.decreaseHealth(this.laserBeam);
    }

}
