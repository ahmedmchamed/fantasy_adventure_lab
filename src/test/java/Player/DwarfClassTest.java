package Player;

import Item.WarriorItems.Axe;
import Item.WarriorItems.Sword;
import Player.Warrior.Dwarf;
import Player.Warrior.Knight;
import Quest.EnemyType.Ogre;
import org.junit.Before;
import org.junit.Test;

public class DwarfClassTest {

    private Dwarf dwarf;
    private Axe axe;
    private Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre("Michael Blue Ballz",20,5,20);
        axe = new Axe("Goblin-Slasher", 20, 0);
        dwarf = new Dwarf(120, axe, "Ahmed");
    }

    @Test
    public void canGetDodge() {
        System.out.println(dwarf.getDodge());
    }
}
