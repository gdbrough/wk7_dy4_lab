package Room;

public abstract class Room {

    private String roomName;
    private RoomType roomType;
    private Enemy enemy;
    private Player player;


    public Room(String roomName, RoomType roomType, Enemy enemy, Player player) {
        this.roomName = roomName;
        this.roomType = roomType;
        this.enemy = enemy;
        this.player = player;
    }

    public String getRoomName() {
        return roomName;
    }

}
