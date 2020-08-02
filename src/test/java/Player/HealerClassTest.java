package Player;

import Item.HealerItems.Staff;
import Item.MageItems.FireballScroll;
import Item.MageItems.LightningStrikeScroll;
import Item.WarriorItems.Axe;
import Item.WarriorItems.Club;
import Item.WarriorItems.Sword;
import Player.Healer.Cleric;
import Player.Healer.Healer;
import Player.Mage.MythicalCreature;
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
    private MythicalCreature dragon;
    private FireballScroll fireball;
    private LightningStrikeScroll lightningStrikeScroll;
    private Knight knight;
    private Axe axe;
    private Sword sword;
    private Club club;
    private Ogre ogre;

    @Before
    public void before() {
        staff = new Staff("Staff of Galadriel", 0, 40);
        axe = new Axe("Celebrimbor", 30, 45);
        sword = new Sword("Chillrend", 35, 50);
        club = new Club("Head-smusher", 40, 50);
        dragon = new MythicalCreature("Mr Jenkins", 50);
        fireball = new FireballScroll("Flare", 30, 0);
        lightningStrikeScroll = new LightningStrikeScroll("Thundara", 40, 0);


        sword = new Sword("Master Sword", 20, 0);
        sword = new Sword("Master Sword", 20, 0);
        sword = new Sword("Master Sword", 20, 0);

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
        assertEquals(120, knight.getHealth());

        cleric.healCharacter(cleric);
        cleric.healCharacter(knight);

        assertEquals(70, cleric.getHealth());
        assertEquals(160, knight.getHealth());

    }

}
