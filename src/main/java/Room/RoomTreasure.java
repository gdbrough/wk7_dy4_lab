package Room;

import Player.Player;
import Treasure.Treasure;

public abstract class RoomTreasure extends Room {

    private Treasure treasure;

    public RoomTreasure(String roomName, RoomType roomType, Player player, Treasure treasure) {
        super(roomName, roomType, player);
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }
}
