package Quest.EnemyType;

public class Ogre extends Enemy {

    private int laserBeam;

    public Ogre(String name, int dealDamage, int health, int laserBeam) {
        super(name, dealDamage, health);
        this.laserBeam = laserBeam;
    }

}
