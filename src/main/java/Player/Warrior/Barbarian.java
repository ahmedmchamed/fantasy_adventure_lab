package Player.Warrior;
import Player.Player;
import Item.Item;
import Quest.EnemyType.Enemy;

public class Barbarian extends Player {

    private int punchAbility;

    public Barbarian(String name, int health, Item equippedItem, int punchAbility) {
        super(name, health, equippedItem);
        this.punchAbility = punchAbility;
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }
}
