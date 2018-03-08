package Player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setUp() {
        barbarian = new Barbarian("Conan", 100, 10, FighterType.BARBARIAN);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(10, barbarian.getHitPoints());
    }

    @Test
    public void testCanGetPreferredWeapon() {
        assertEquals("Club", barbarian.getPreferredWeapon());
    }
}
