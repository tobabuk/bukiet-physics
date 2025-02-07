package bukiet.physics;

public class Force {
    private double magnitude;
    private double degrees;


    public Force(double degrees, double magnitude) {

        this.degrees = degrees;
        this.magnitude = magnitude;
    }




        public double addForces ( double degrees, double magnitude){
            double fy = (magnitude * Math.cos(Math.toRadians(degrees)));
            double fx = (magnitude * Math.cos(Math.toRadians(degrees)));


            double netNet = Math.sqrt((netX * netX) + (netY * netY));
            double sum = netY / netX;


            double direction = Math.toDegrees(Math.atan(sum));
     System.out.printf("The resulting force of the collision is:" + netNet + direction);



    }
}