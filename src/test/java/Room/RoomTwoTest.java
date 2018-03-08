package Room;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTwoTest {

    RoomTwo roomTwo;

    @Before
    public void setUp() {
        roomTwo = new RoomTwo("Room 2", RoomType.COLLECT, null);
    }

    @Test
    public void testCanGetRoomName(){
        assertEquals("Room 2", roomTwo.getRoomName());
    }

    @Test
    public void testCanGetRoomType() {
        assertEquals("collect", roomTwo.getRoomType());
    }
}
