package bukiet.physics;

public class Angle {
    private double value;


    public Angle(double value) {
        this.value = value;
    }

    public double toRadian() {
        return Math.toRadians(value);
    }

    public double toDegrees() {
        return value;
    }
}
