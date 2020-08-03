package Quest.Room.Treasure;

public class GoldCoin implements ITreasure {

    private int goldCoinAmount;

    public GoldCoin() {
        this.goldCoinAmount = 5;
    }

    public int getValue() {
        return this.goldCoinAmount;
    }

}
