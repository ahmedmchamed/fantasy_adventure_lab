package Player.Warrior;
import Player.PlayerType;
import Player.Player;
import Item.Item;
import Quest.EnemyType.Enemy;

public class Barbarian extends Player implements IAttackEnemy {

    private int punchAbility;

    public Barbarian(String name, int health, Item equippedItem, PlayerType playerType, int punchAbility) {
        super(name, health, equippedItem, playerType);
        this.punchAbility = punchAbility;
    }

    public void receiveDamage(Enemy enemy) {
        this.health -= enemy.getDealDamage();
    }

    public void attackEnemy(Enemy enemy) {
        int fullDamage = this.punchAbility + this.equippedItem.getDamage();
        enemy.decreaseHealth(fullDamage);
    }

}
