package twentyfour.fall.oop.group1.lesson2.m24w0199;
import java.util.Scanner;

public class TriangularPrismSurfaceArea {
    public static void main(String[] args){
        //
        Scanner scannerHoldData = new Scanner(System.in);
        System.out.println("Please Enter the Details of Triangular");

        System.out.println("Please Enter Base of Triangular:");
        double baseOfTriangular = scannerHoldData.nextDouble();

        //Height of Triangular input
        System.out.println("Please Enter Height of Triangular:");
        double heightOfTriangular = scannerHoldData.nextDouble();

        //Length of Triangular
        System.out.println("Enter the Length of Triangular");
        double lengthOfTriangular = scannerHoldData.nextDouble();

        // close the data Scanner
        scannerHoldData.close();

        double areaOfTriangular = 2 * (baseOfTriangular * heightOfTriangular *.5)+ 3*baseOfTriangular*lengthOfTriangular;


        // Print the Result
        System.out.println("The face of triangular prism is :"+areaOfTriangular);



    }

}
