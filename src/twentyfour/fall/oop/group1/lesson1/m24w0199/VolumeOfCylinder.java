package twentyfour.fall.oop.group1.lesson1.m24w0199;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
        //for calculate volume of cylinder 3.14*r^2*h

//        Scanner holdData = new Scanner(System.in);
//
//        System.out.println("Enter Value of Radius:");
//        double r = holdData.nextDouble();
//
//        System.out.println("Enter Height of Cylinder");
//        double h = holdData.nextDouble();


    float r= 7;
    float h = 3;
    float pi = 3.14f;
    float volume = pi *r*r*h;
    long bigNumber = 9L;



//    double volume = Math.PI* Math.pow(r,2) *h;

    System.out.println("volume of cylinder => " +volume);
    }
}
