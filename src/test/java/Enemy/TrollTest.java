package Enemy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void setUp() {
        troll = new Troll("Mavi", 70, 11);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Mavi", troll.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(70, troll.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(11, troll.getHitPoints());
    }

}
