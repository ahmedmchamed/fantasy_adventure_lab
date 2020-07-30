import Item.WarriorItems.Axe;
import Item.WarriorItems.Club;
import Item.WarriorItems.Sword;
import Item.WarriorItems.Sword;
import Player.Player;
import Player.Warrior.*;
import Player.Player;
import Player.Warrior.Knight;
import Quest.EnemyType.Ogre;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Welcome to our fantasy game!\n");
        System.out.println("Give us your name:\n");

        Scanner readName = new Scanner(System.in);
        String playerName = readName.nextLine();

        System.out.println("Here are some items that you can choose form:\n");
        System.out.println("\t* Sword");
        System.out.println("\t* Axe");
        System.out.println("\t* Club");
        
        Scanner readWeapon = new Scanner(System.in);
        String weapon = readWeapon.nextLine();
        
        if (weapon.equals("Sword")) {
            Sword sword = new Sword("Chillrend", 35, 50);
            System.out.println("What class would you like to be:\n");
            System.out.println("\t* Knight");
            System.out.println("\t* Dwarf");
            System.out.println("\t* Barbarian");
            Scanner readClass = new Scanner(System.in);
            String chosenClass = readClass.nextLine();
            if (chosenClass.equals("Knight")) {
                Knight knight = new Knight(120, sword, playerName, 150);
                System.out.println("\nAwesome! You've created a character.");
                String welcome = String.format("Your character is:\n" +
                                "\tName: %s\n" +
                                "\tWeapon: %s\n" +
                                "\tClass: Knight\n",
                        knight.getName(),
                        knight.getEquippedItem().getName());
                System.out.println(welcome);
                System.out.println("\nOh no! It's an Ogre! Fight to the death, nerd.\n");
                Ogre ogre = new Ogre("Michael Blue Ballz",20,50,20);
                String fightWelcome = String.format("Here's the enemy details:\n" +
                                "\tName: %s\n" +
                                "\tHealth: %s\n",
                        ogre.getName(),
                        ogre.getHealth());
                System.out.println(fightWelcome);

                System.out.println("\nType attack to fight!\n");
                Scanner attackInput = new Scanner(System.in);
                String attackRead = attackInput.nextLine();
                if (attackRead.equals("Attack")) {
                    ogre.receiveDamageFromWarrior(knight);
                }
                String afterFight = String.format("Here's the enemy details:\n" +
                                "\tName: %s\n" +
                                "\tHealth: %s\n",
                        ogre.getName(),
                        ogre.getHealth());
                System.out.println(afterFight);
            }
            if (chosenClass.equals("Dwarf")) {
                Dwarf dwarf = new Dwarf(120, sword, playerName);
            }
            if (chosenClass.equals("Barbarian")) {
                Barbarian barbarian = new Barbarian(120, sword, playerName, 15);
            }
        }
        if (weapon.equals("Axe")) {
            Axe axe = new Axe("Celebrimbor", 30, 45);
            System.out.println("What class would you like to be:\n");
            System.out.println("\t* Knight");
            System.out.println("\t* Dwarf");
            System.out.println("\t* Barbarian");
            Scanner readClass = new Scanner(System.in);
            String chosenClass = readClass.nextLine();
            if (chosenClass.equals("Knight")) {
                Knight knight = new Knight(120, axe, playerName, 150);
            }
            if (chosenClass.equals("Dwarf")) {
                Dwarf dwarf = new Dwarf(120, axe, playerName);
            }
            if (chosenClass.equals("Barbarian")) {
                Barbarian barbarian = new Barbarian(120, axe, playerName, 15);
            }
        }
        if (weapon.equals("Club")) {
            Club club = new Club("Head-Smusher", 40, 50);
            System.out.println("What class would you like to be:\n");
            System.out.println("\t* Knight");
            System.out.println("\t* Dwarf");
            System.out.println("\t* Barbarian");
            Scanner readClass = new Scanner(System.in);
            String chosenClass = readClass.nextLine();
            if (chosenClass.equals("Knight")) {
                Knight knight = new Knight(120, club, playerName, 150);
            }
            if (chosenClass.equals("Dwarf")) {
                Dwarf dwarf = new Dwarf(120, club, playerName);
            }
            if (chosenClass.equals("Barbarian")) {
                Barbarian barbarian = new Barbarian(120, club, playerName, 15);
            }
        }




    }

}
//new Staff("Staff of Galadriel", 0, 40);
//new MythicalCreature("Mr Jenkins", 50);
//new FireballScroll("Flare", 30, 0);
//new LightningStrikeScroll("Thundara", 40, 0);
