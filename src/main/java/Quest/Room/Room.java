package Quest.Room;

import Player.Player;
import Quest.EnemyType.Enemy;
import Quest.Room.Treasure.ITreasure;

import java.util.ArrayList;

public class Room {

    private String roomName;
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<ITreasure> treasures;
    private RoomExit exit;

    public Room(String roomName, Player player) {
        this.roomName = roomName;
        this.player = player;
        this.enemies = new ArrayList<Enemy>();
        this.treasures = new ArrayList<ITreasure>();
        this.exit = RoomExit.getRandomExit();
    }

    public String getRoomName() {
        return this.roomName;
    }

    public Player getPlayer() {
        return this.player;
    }

    public ArrayList<Enemy> getEnemies() {
        return this.enemies;
    }

    public ArrayList<ITreasure> getTreasures() {
        return this.treasures;
    }

    public RoomExit getExit() {
        return this.exit;
    }



}
