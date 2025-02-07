

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest {
@Test
    public void addForces() {
    // given
    Force a = new Force(32,10);
    Force b = new Force(105,10);
    //when
    Force c = a.add(b);
    //then
    assertEquals(68.5, c.getDegrees(), 0.1);
    assertEquals(16.08, c.getMagnitude(), 0.1);

}

}