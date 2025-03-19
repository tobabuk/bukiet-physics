package bukiet.physics;

public class Location {

    private double y;
    private double x;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Location{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }

    public Location apply(Force f) {
        double displacementX = f.getMagnitude() * Math.cos(f.getAngle());
        double displacementY = f.getMagnitude() * Math.sin(f.getAngle());
        return new Location(this.x + displacementX, this.y + displacementY);
    }
}