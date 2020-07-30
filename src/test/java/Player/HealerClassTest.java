package Player;

import Item.HealerItems.Staff;
import Item.WarriorItems.Axe;
import Item.WarriorItems.Sword;
import Player.Healer.Cleric;
import Player.Healer.Healer;
import Player.Warrior.Knight;
import Quest.EnemyType.Ogre;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerClassTest {

    private Cleric cleric;
    private Staff staff;

    private Knight knight;
    private Sword sword;
    private Ogre ogre;

    @Before
    public void before() {
        staff = new Staff("Healing Staff", 0, 40);
        cleric = new Cleric(50, staff, "John Healerhans", 100);
        ogre = new Ogre("Michael Blue Ballz",20,5,20);
        sword = new Sword("Master Sword", 20, 0);
        knight = new Knight(120, sword, "Jack", 150);
    }

    @Test
    public void canHealCharacters() {
        knight.receiveDamage(ogre);
        cleric.receiveDamage(ogre);

        assertEquals(30, cleric.getHealth());
        assertEquals(100, knight.getHealth());

        cleric.healCharacter(cleric);
        cleric.healCharacter(knight);

        assertEquals(70, cleric.getHealth());
        assertEquals(140, knight.getHealth());

    }

}
