package bukiet.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest {
    @Test
    public void addForces() {
        // given
        Force a = new Force(32, 10);
        Force b = new Force(105, 10);
        //when
        Force c = a.addForces(b);
        //then
        assertEquals(68.5, c.getDegrees(), 0.1);
        assertEquals(16.08, c.getMagnitude(), 0.1);

    }

    @Test
    public void scale() {
        Force f = new Force(30, 15);
        Force a = f.scale(.391);
        assertEquals(30, a.getDegrees(), .01);
        assertEquals(5.865, a.getMagnitude(), .001);

    }
}