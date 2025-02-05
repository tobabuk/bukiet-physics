import java.lang.Math;

public class calculate {
    public static void main(String[] args){

        double f1_mag = 10;
        double f2_mag = 10;
        double f1_degree= 32;
        double f2_degree = 105;

     double   f1x =  (f1_mag * Math.cos(Math.toRadians(f1_degree)));
     double  f1y = (f1_mag * Math.sin(Math.toRadians(f1_degree)));
     double  f2x =  (f2_mag * Math.cos(Math.toRadians(f2_degree)));
     double f2y =  (f2_mag * Math.sin(Math.toRadians(f2_degree)));

     double netX = f1x + f2x;
     double netY = f1y + f2y;
     double netNet = Math.sqrt((netX*netX) +  (netY*netY));
     double sum = netY/netX;

     double direction =Math.toDegrees( Math.atan(sum));

        System.out.printf("The resulting force of the collision of one " +
                "force at 32 degrees and another at 105, " +
                "both with a magnitude of 10 is " + "%.2f" + " with an angle of " + "%.2f" , netNet ,  direction );


    }
}
