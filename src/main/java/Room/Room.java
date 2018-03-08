package Room;

import Player.Player;

public abstract class Room {

    private String roomName;
    private RoomType roomType;
    private Player player;


    public Room(String roomName, RoomType roomType, Player player) {
        this.roomName = roomName;
        this.roomType = roomType;
        this.player = player;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomType() {
        return roomType.toString().toLowerCase();
    }
}
