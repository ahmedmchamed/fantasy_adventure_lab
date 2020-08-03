package Player;

import Item.WarriorItems.Sword;
import Player.Warrior.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Sword sword;

    @Before
    public void before() {
        sword = new Sword("Chillrend", 20, 0, PlayerType.WARRIOR);
        knight = new Knight("Bazooka", 150, sword, PlayerType.WARRIOR, 150);
    }

    @Test
    public void canGetName() {
        assertEquals("Bazooka", knight.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(150, knight.getHealth());
    }

    @Test
    public void canGetPlayerType() {
        assertEquals(PlayerType.WARRIOR, knight.getPlayerType());
    }

}
