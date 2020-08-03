package Player;

import Item.WarriorItems.Sword;
import Player.Mage.MythicalCreature;
import Player.Mage.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

    private Warlock warlock;
    private MythicalCreature mythicalCreature;
    private Sword sword;

    @Before
    public void before() {

        sword = new Sword("Master Sword", 20, 0, PlayerType.WARRIOR);

        mythicalCreature = new MythicalCreature("Beastie", 50);

        warlock = new Warlock("Guardian", 120, sword,
                PlayerType.WARRIOR, mythicalCreature, 15);
    }

    @Test
    public void canGetHealth() {
        assertEquals(120, warlock.getHealth());
    }

}
