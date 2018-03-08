package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    private Potion potion;

    @Before
    public void setUp() {
        potion = new Potion(HealingToolsType.POTION);
    }

    @Test
    public void testCanGetName() {
        assertEquals("potion", potion.getName());
    }

    @Test
    public void testCanGetHealingPoints() {
        assertEquals(-10, potion.getHealingPoints());
    }

}
