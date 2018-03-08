package Player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void setUp(){
        cleric = new Cleric("Eric", 100, 10, HealerType.CLERIC);

    }

    @Test
    public void testCanGetName() {
        assertEquals("Eric", cleric.getName());
    }

    @Test
    public void testCanGertHealthPoints() {
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void testCanGetHitPoints() {
        assertEquals(10, cleric.getHitPoints());
    }

    @Test
    public void testCanGetPreferredHealingTool() {
        assertEquals("potion", cleric.getPreferredHealingTool());
    }

}
