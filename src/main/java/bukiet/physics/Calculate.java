package bukiet.physics;

import java.lang.Math;

public class Calculate {
    public static void main(String[] args) {

        double f1mag = 10;
        double f2mag = 10;
        double f1degree = 32;
        double f2degree = 105;


        double f1x = (f1mag * Math.cos(Math.toRadians(f1degree)));
        double f1y = (f1mag * Math.sin(Math.toRadians(f1degree)));
        double f2x = (f2mag * Math.cos(Math.toRadians(f2degree)));
        double f2y = (f2mag * Math.sin(Math.toRadians(f2degree)));

        double netX = f1x + f2x;
        double netY = f1y + f2y;
        double netNet = Math.sqrt((netX * netX) + (netY * netY));
        double sum = netY / netX;

        double direction = Math.toDegrees(Math.atan(sum));

        System.out.printf("The resulting force of the collision of one "
                + "force at 32 degrees and another at 105, "
                + "both with a magnitude of 10 is "
                + "%.2f"
                + " with an angle of "
                + "%.2f", netNet, direction);


    }
}
