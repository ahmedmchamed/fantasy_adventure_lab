package Quest.Room;

public enum RoomExit {
    NORTH("North"),
    SOUTH("South"),
    EAST("East"),
    WEST("West");

    String exit;

    RoomExit(String exit) {
        this.exit = exit;
    }

    public String getExit() {
        return this.exit;
    }

    public static RoomExit getRandomExit() {
        return values()[(int) Math.random() * values().length];
    }

}
