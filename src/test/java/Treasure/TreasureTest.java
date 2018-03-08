package Treasure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void setUp() {
        treasure = new Treasure("Gold", 20, 2000);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Gold", treasure.getName());
    }

    @Test
    public void testCanGetAmount() {
        assertEquals(20, treasure.getAmount());
    }

    @Test
    public void testCanGetValue() {
        assertEquals(2000, treasure.getValue());
    }
}
