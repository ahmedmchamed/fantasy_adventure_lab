package Player;

import Item.WarriorItems.Club;
import Player.Warrior.Barbarian;
import Quest.EnemyType.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianClassTest {
    
    private Barbarian barbarian;
    private Club club;
    private Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre("Michael Blue Ballz",20,100,20);
        club = new Club("Bouncy Bat", 15, 0);
        barbarian = new Barbarian(150, club, "George", 2);
    }

    @Test
    public void canDamageEnemy() {
        barbarian.attack(ogre);
        assertEquals(70, ogre.getHealth());
    }

}
