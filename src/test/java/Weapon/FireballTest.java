package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    private Fireball fireball;

    @Before
    public void setUp() {
        fireball = new Fireball(null, SpellType.FIREBALL);
    }

    @Test
    public void testCanGetName() {
        assertEquals("fireball", fireball.getSpellName());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(30, fireball.getSpellHitPoints());
    }
}
