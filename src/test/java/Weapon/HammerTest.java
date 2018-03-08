package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammerTest {

    private Hammer hammer;

    @Before
    public void setUp() {
        hammer = new Hammer(WeaponType.HAMMER);
    }

    @Test
    public void testCanGetName() {
        assertEquals("hammer", hammer.getName());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(4, hammer.getBonusPoints());
    }


}
