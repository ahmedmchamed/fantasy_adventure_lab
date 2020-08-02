package Enemy;

import Item.WarriorItems.Sword;
import Player.Warrior.Knight;
import Item.WarriorItems.Sword;
import Player.Warrior.Knight;
import Quest.EnemyType.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreClassTest {
    
    private Ogre ogre;
    private Knight knight;
    private Sword sword;
    
    
    @Before
    public void before() {
        ogre = new Ogre("Michael Blue Ballz",20,50,20);
        sword = new Sword("Master Sword", 20, 0);
        knight = new Knight(120, sword, "Jack", 150);
    }

    @Test
    public void canReceiveDamage() {
        ogre.receiveDamageFromWarrior(knight);
        assertEquals(30, ogre.getHealth());
    }

}
