package Player.Healer;
import Player.Player;
import Item.Item;

public class Cleric extends Player {

    private int megaHeal;

    public Cleric(String name, int health, Item equippedItem, int megaHeal) {
        super(name, health, equippedItem);
        this.megaHeal = megaHeal;
    }


}
