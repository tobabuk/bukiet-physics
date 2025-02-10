package bukiet.physics;

public class Force {

    private double degrees;
    private double magnitude;

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }


    public Force(double degrees, double magnitude) {

        this.degrees = degrees;
        this.magnitude = magnitude;
    }


    public Force addForces(Force f) {
        double fy1 = (this.magnitude * Math.sin(Math.toRadians(this.degrees)));
        double fx1 = (this.magnitude * Math.cos(Math.toRadians(this.degrees)));
        double fy2 = (f.magnitude * Math.sin(Math.toRadians(f.degrees)));
        double fx2 = (f.magnitude * Math.cos(Math.toRadians(f.degrees)));


        double netX = fx1 + fx2;
        double netY = fy1 + fy2;
        double netNet = Math.sqrt((netX * netX) + (netY * netY));
        double direction = Math.toDegrees(Math.atan2(netY, netX));
        return new Force(direction, netNet);


    }

    public Force scale(double t) {
        return new Force(this.degrees, this.magnitude * t);
    }
}