package Quest.Room.Treasure;

public class SmallHealPotion implements ITreasure {

    private int smallHealBoost;

    public SmallHealPotion() {
        this.smallHealBoost = 5;
    }

    public int getValue() {
        return this.smallHealBoost;
    }

}
