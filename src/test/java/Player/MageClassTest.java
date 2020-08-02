package Player;

import Item.MageItems.FireballScroll;
import Player.Mage.MythicalCreature;
import Player.Mage.Wizard;
import Quest.EnemyType.Ogre;
import org.junit.Before;

import org.junit.Test;import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MageClassTest {
    
    private Wizard wizard;
    private FireballScroll fireball;
    private Ogre ogre;
    private MythicalCreature dragon;
    
    @Before
    public void before() {
        ArrayList<MythicalCreature> mythicalCreatureList = new ArrayList<MythicalCreature>();
        mythicalCreatureList.add(dragon);
        
        ogre = new Ogre("Michael Blue Ballz",20,5,20);
        dragon = new MythicalCreature("Dragon", 50);
        fireball = new FireballScroll("Master Sword", 20, 0);
        wizard = new Wizard(120, fireball, "Jack", mythicalCreatureList, dragon,50);
    }
    @Test
    public void canReceiveDamage() {
        wizard.receiveDamage(ogre);
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void getMythicalCreatureName() {
        assertEquals("Dragon", dragon.getName());
    }


}
