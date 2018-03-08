package Weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    private Club club;

    @Before
    public void setUp() {
        club = new Club(WeaponType.CLUB);
    }

    @Test
    public void testCanGetName() {
        assertEquals("club", club.getName());
    }

    @Test
    public void testCanGetWeaponHitPoints() {
        assertEquals(2, club.getBonusPoints());
    }



}
