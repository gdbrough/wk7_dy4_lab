package Room;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomOneTest {

    RoomOne roomOne;

    @Before
    public void setUp() {
        roomOne = new RoomOne("Room 1", RoomType.COLLECT);
    }

    @Test
    public void testCanGetRoomName(){
        assertEquals("Room 1", roomOne.getRoomName());
    }
}
