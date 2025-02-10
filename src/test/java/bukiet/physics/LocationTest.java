package bukiet.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    @Test
    public void apply() {
        Location one = new Location(7, 3);
        Force f = new Force(36.87, 5);
        Location two = one.apply(f);
        assertEquals(11, two.getX(), .8);
        assertEquals(6, two.getY(), .8);
    }
}