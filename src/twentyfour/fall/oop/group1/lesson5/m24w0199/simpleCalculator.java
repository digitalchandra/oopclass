package twentyfour.fall.oop.group1.lesson5.m24w0199;
import javax.swing.text.Style;
import java.util.Scanner;

public class simpleCalculator {
    // for addition
    public static int add(int num1, int num2){
        return num1+num2;
    }
    // for substract
    public static int subtract(int num1, int num2){
        return num1-num2;
    }
    // multipication
    public static int multiplication(int num1, int num2){
        return num1*num2;
    }
    //deivision

    public  static  int division(int num1, int num2){
        if(num2==0){
            System.out.println("Error : Division by zero");
            return 0;
        }
        return num1/num2;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please choose arithmetic operation like + || - || * || / ");
            System.out.println("1 for + Add ");
            System.out.println("2 for - Subtract");
            System.out.println("3 for * Multiplication");
            System.out.println("4 for / Division");
        }
    }


}

