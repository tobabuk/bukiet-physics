package bukiet.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {
    @Test
    public void add() {
        Force force = new Force(1,2);
        Location location = new Location(7, 3);
        Projectile p = new Projectile(force, location);

        Force f = new Force(3,9);
        p.add(f);

        assertEquals(0, p.getForce().getX());
    }

    @Test
    public void move() {

    }
}