package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightningStrikeTest {

    private LightningStrike lightningStrike;

    @Before
    public void setUp() {
        lightningStrike = new LightningStrike(null, SpellType.LIGHTNING_STRIKE);
    }

    @Test
    public void testCanGetName() {
        assertEquals("lightning strike", lightningStrike.getSpellName());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(50, lightningStrike.getSpellHitPoints());
    }


}
