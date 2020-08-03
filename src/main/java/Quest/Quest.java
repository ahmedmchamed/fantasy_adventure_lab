package Quest;

import Item.HealerItems.Staff;
import Item.MageItems.FireballScroll;
import Item.MageItems.LightningStrikeScroll;
import Item.WarriorItems.Axe;
import Item.WarriorItems.Club;
import Item.WarriorItems.Sword;
import Player.Mage.Wizard;
import Player.Player;
import Player.Warrior.Barbarian;
import Player.Warrior.Dwarf;
import Player.Warrior.Knight;
import Quest.EnemyType.Enemy;
import Quest.Room.Room;
import Player.PlayerType;

import java.util.ArrayList;
import java.util.Scanner;

public class Quest {

    private Room room;
    private ArrayList<Player> playerClasses;

    public Quest(Room room) {
        this.room = room;
        this.playerClasses = new ArrayList<Player>();
    }

    public void play() {
        //Default characters and items
        Sword sword = new Sword("Chillrend", 15, 0, PlayerType.WARRIOR);
        Club club = new Club("BadAssClub", 17, 0, PlayerType.WARRIOR);
        Axe axe = new Axe("Death Claw", 19, 0, PlayerType.WARRIOR);

        FireballScroll fireballScroll = new FireballScroll("Fireball", 20, 0, PlayerType.MAGE);
        LightningStrikeScroll lightningStrikeScroll = new LightningStrikeScroll("Lightning", 20, 0, PlayerType.MAGE);

        Staff staff = new Staff("Healing Staff", 0, 15, PlayerType.HEALER);

        Knight knight = new Knight("", 100, sword, PlayerType.WARRIOR, 100);
        Dwarf dwarf = new Dwarf("", 120, club, PlayerType.WARRIOR);
        Barbarian barbarian = new Barbarian("", 120, axe, PlayerType.WARRIOR, 20);

//        Wizard wizard = new Wizard();

        System.out.println("Print your name below, saddo.\n");
        Scanner readName = new Scanner(System.in);
        String playerName = readName.nextLine();
        System.out.println("Choose your player class (each of them have their own starter values):\n");
    }

}
