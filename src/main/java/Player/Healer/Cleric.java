package Player.Healer;
import Player.PlayerType;
import Player.Player;
import Item.Item;

public class Cleric extends Player implements IHeal {

    private int megaHeal;

    public Cleric(String name, int health, Item equippedItem, PlayerType playerType, int megaHeal) {
        super(name, health, equippedItem, playerType);
        this.megaHeal = megaHeal;
    }

    public void healPlayer(Player player) {
        player.increaseHealth(this.equippedItem.getHealing());
    }

}
