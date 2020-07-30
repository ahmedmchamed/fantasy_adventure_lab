package Player;

import Item.Item;
import Item.WarriorItems.Sword;
import Player.Warrior.Knight;
import Quest.EnemyType.Ogre;
import Quest.EnemyType.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightClassTest {

    private Knight knight;
    private Sword sword;
    private Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre("Michael Blue Ballz",20,5,20);
        sword = new Sword("Master Sword", 20, 0);
        knight = new Knight(120, sword, "Jack", 150);
    }

    @Test
    public void canGetHealth() {
        assertEquals(120, knight.getHealth());
    }
    
    @Test
    public void canGetItem() {
        assertEquals(sword, knight.getEquippedItem());
    }

    @Test
    public void canGetEnemyName() {
        assertEquals("Michael Blue Ballz", ogre.getName());
    }

    @Test
    public void canReceiveDamage() {
        knight.receiveDamage(ogre);
        assertEquals(100, knight.getHealth());
    }

}
