package Quest.Room.Treasure;

public class BigHealthPotion implements ITreasure {

    private int largeHealBoost;

    public BigHealthPotion() {
        this.largeHealBoost = 10;
    }

    public int getValue() {
        return this.largeHealBoost;
    }

}
