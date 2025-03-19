package bukiet.physics;

public class Projectile {

   private Force force;
   private Location location;
   private int radius;


   public Projectile (Force force, Location location)
   {
      this.force = force;
      this.location = location;
   }
   public Location getLocation() {

      return location;
   }


   public Force getForce() {

      return force;
   }



   public void add(Force f)
   {
       this.force = this.force.addForces(f);
   }

   public void move(double time)
   {
      Force scaled = force.scale(time);
      location = location.apply(scaled);
   }


}
