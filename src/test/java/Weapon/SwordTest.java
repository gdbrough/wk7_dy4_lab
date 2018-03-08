package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;

    @Before
    public void setUp() {
        sword = new Sword(WeaponType.SWORD);
    }

    @Test
    public void testCanGetName() {
        assertEquals("sword", sword.getName());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(5, sword.getBonusPoints());
    }
}
