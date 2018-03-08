package Player;

import Weapon.MythicalCreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    MythicalCreatureType creatureType;

    @Before
    public void setUp() {
        wizard = new Wizard("Gandalf", 100, 10, MagicFolkType.WIZARD, MythicalCreatureType.DRAGON);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(10, wizard.getHitPoints());
    }

    @Test
    public void testCanGetPreferredSpell() {
        assertEquals("Lightning Strike", wizard.getPreferredSpell());
    }

    @Test
    public void testCanGetPreferredCreature() {
        assertEquals("dragon", wizard.getPreferredCreature());
    }
}
