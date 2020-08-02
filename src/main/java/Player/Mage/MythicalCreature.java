package Player.Mage;

public class MythicalCreature {

    private String name;
    private int health;

    public MythicalCreature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void decreaseHealth(int decreaseHealth) {
        this.health -= decreaseHealth;
    }

    public int getHealth() {
        return health;
    }
}
