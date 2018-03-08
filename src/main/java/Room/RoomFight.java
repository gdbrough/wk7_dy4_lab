package Room;

import Player.Player;
import Enemy.Enemy;

public abstract class RoomFight extends Room {

    Enemy enemy;

    public RoomFight(String roomName, RoomType roomType, Player player, Enemy enemy) {
        super(roomName, roomType, player);
        this.enemy = enemy;
    }
}
