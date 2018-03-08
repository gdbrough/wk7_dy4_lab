package Player;

//import Enemy.Enemy;
import Enemy.Enemy;
import Enemy.Troll;
import Weapon.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void setUp() {
        knight = new Knight("Arthur", 100, 10, FighterType.KNIGHT, WeaponType.SWORD);
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
        assertEquals("sword", knight.getPreferredWeapon());
    }

    @Test
    public void testCanGetCurrentWeapon() {
        assertEquals("sword", knight.getCurrentWeapon().getName());
    }

    @Test
    public void testCanChangeWeapon() {
        knight.setCurrentWeaponType(WeaponType.HAMMER);
        assertEquals("hammer", knight.getCurrentWeapon().getName());
    }

    @Test
    public void testCanAttack__PreferredWeapon() {
        Troll troll = new Troll("Bob", 100, 100);
        knight.attack(troll);
        assertEquals(85, troll.getHealthPoints());

    }

    @Test
    public void testCanAttack__OtherWeapon() {
        knight.setCurrentWeaponType(WeaponType.HAMMER);
        Troll troll = new Troll("Bob", 100, 100);
        knight.attack(troll);
        assertEquals(90, troll.getHealthPoints());
    }
}
