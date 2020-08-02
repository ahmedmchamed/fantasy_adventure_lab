package Quest;

import Player.Healer.Cleric;
import Player.Healer.Healer;
import Player.Mage.Mage;
import Player.Player;
import Player.Warrior.Warrior;

public abstract class Enemy {

    protected String name;
    protected int dealDamage;
    protected int health;

    public Enemy(String name, int dealDamage, int health) {
        this.name = name;
        this.dealDamage = dealDamage;
        this.health = health;
    }
    public void receiveDamageFromWarrior(Warrior warrior) {
        this.health -= warrior.getEquippedItem().getDamage();
    }
    public void receiveDamageFromHealer(Healer healer) {
        this.health -= healer.getEquippedItem().getDamage();
    }
    public void receiveDamageFromMage(Mage mage) {
        this.health -= mage.getEquippedItem().getDamage();
    }

    public String getName() {
        return this.name;
    }

    public int getDealDamage() {
        return this.dealDamage;
    }

    public int getHealth() {
        return this.health;
    }

    public void increaseHealth(int health) {
        this.health += health;
    }

    public void decreaseHealth(int health) {
        this.health -= health;
    }

}
