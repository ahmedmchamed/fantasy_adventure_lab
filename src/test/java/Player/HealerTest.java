package Player;

import Item.HealerItems.Staff;
import Player.Healer.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    private Cleric cleric;
    private Staff staff;

    @Before
    public void before() {
        staff = new Staff("Healing Staff", 0, 20, PlayerType.HEALER);
        cleric = new Cleric("The Doctor", 120, staff, PlayerType.HEALER, 40);
    }

    @Test
    public void canGetName() {
        assertEquals("The Doctor", cleric.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(120, cleric.getHealth());
    }

    @Test
    public void canGetItem() {
        assertEquals("Healing Staff", cleric.getEquippedItem().getName());
    }

    @Test
    public void canHealPlayer() {
        cleric.healPlayer(cleric);
        assertEquals(140, cleric.getHealth());
    }



}
