package Enemy;

import Player.FighterType;
import Player.Knight;
import Weapon.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void setUp() {
        orc = new Orc("Grunt", 30, 3);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Grunt", orc.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(30, orc.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(3, orc.getHitPoints());
    }

    @Test
    public void testCanAttack() {
        Knight knight = new Knight("Bob", 100, 100, FighterType.KNIGHT, WeaponType.HAMMER);
        orc.attack(knight);
        assertEquals(97,knight.getHealthPoints());
    }


}
