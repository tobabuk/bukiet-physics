package bukiet.physics;

public class Force {
    public static final Force GRAVITY = new Force(0,-9.8);
    private double x;
    private double y;


    public Force(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public Force(Angle angle, double magnitude) {
    double radians = angle.toRadian();
   x = (magnitude * Math.cos(radians));
   y = (magnitude * Math.sin(radians));
    }

    public double getX() {
       return x;

    }
    public double getY() {
        return y;
    }

    public double getAngle(){
        return Math.toDegrees(Math.atan2(y, x));
    }
    public double getMagnitude(){
        return Math.sqrt(x*x+y*y);
    }


    public Force addForces(Force f) {
   return new Force(x+ f.x, y+f.y);

    }

    public Force scale(double t) {
        return new Force( this.getAngle(), this.getMagnitude() * t);
    }
}