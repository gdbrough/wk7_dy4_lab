package Player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void setUp() {
        knight = new Knight("Arthur", 100, 10, FighterType.KNIGHT);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Arthur", knight.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(10, knight.getHitPoints());
    }

    @Test
    public void testCanGetPreferredWeapon() {
        assertEquals("Sword", knight.getPreferredWeapon());
    }
}
