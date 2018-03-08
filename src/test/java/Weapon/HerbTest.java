package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    private Herb herb;

    @Before
    public void setUp() {
        herb = new Herb(HealingToolsType.HERBS);
    }

    @Test
    public void testCanGetName() {
        assertEquals("herbs", herb.getName());
    }

    @Test
    public void testCanGetHealingPoints() {
        assertEquals(-5, herb.getHealingPoints());
    }


}
