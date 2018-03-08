package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    private Dragon dragon;

    @Before
    public void setUp() {
        dragon = new Dragon(MythicalCreatureType.DRAGON, null);
    }

    @Test
    public void testCanGetName() {
        assertEquals("dragon", dragon.getCreature());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(15, dragon.getBonusPoints());
    }
}
