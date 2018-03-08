package Room;

public abstract class Room {

    private String roomName;
    private RoomType roomType;

    public Room(String roomName, RoomType roomType) {
        this.roomName = roomName;
        this.roomType = roomType;
    }
}
