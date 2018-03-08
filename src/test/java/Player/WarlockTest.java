package Player;

import Weapon.MythicalCreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before
    public void setUp() {
        warlock = new Warlock("Alatar", 100, 10, MagicFolkType.WARLOCK, MythicalCreatureType.ORGE);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Alatar", warlock.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(10, warlock.getHitPoints());
    }

    @Test
    public void testCanGetPreferredSpell() {
        assertEquals("Fireball", warlock.getPreferredSpell());
    }

    @Test
    public void testCanGetPreferredCreature() {
        assertEquals("ogre", warlock.getPreferredCreature());
    }
}
