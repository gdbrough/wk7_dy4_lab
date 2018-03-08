package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    private Ogre ogre;

    @Before
    public void setUp() {
        ogre = new Ogre(MythicalCreatureType.ORGE, null);
    }

    @Test
    public void testCanGetName() {
        assertEquals("ogre", ogre.getCreature());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(10, ogre.getBonusPoints());
    }


}
