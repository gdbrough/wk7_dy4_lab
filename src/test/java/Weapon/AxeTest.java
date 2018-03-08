package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    private Axe axe;

    @Before
    public void setUp() {
        axe = new Axe(WeaponType.AXE);
    }

    @Test
    public void testCanGetName() {
        assertEquals("axe", axe.getName());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(3, axe.getBonusPoints());
    }
}
