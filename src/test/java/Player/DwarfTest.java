package Player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Gimmly", 100, 10, FighterType.DRAWF);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Gimmly", dwarf.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(10, dwarf.getHitPoints());
    }

    @Test
    public void testCanGetPreferredWeapon() {
        assertEquals("Axe", dwarf.getPreferredWeapon());
    }
}
