package bukiet.physics;

public class Location {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    private double x;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;


    }

    public Location apply(Force f) {
        double displacementX = f.getMagnitude() * Math.cos(Math.toRadians(f.getDegrees()));
        double displacementY = f.getMagnitude() * Math.sin(Math.toRadians(f.getDegrees()));
        return new Location(this.x + displacementX, this.y + displacementY);
    }
}