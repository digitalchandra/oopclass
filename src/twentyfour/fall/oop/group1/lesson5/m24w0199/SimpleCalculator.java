package twentyfour.fall.oop.group1.lesson5.m24w0199;
/**
 * Id: M24W0199
 * Name: Shrestha Chandra Bahadur
 * Assignment: KCGI/OOP
 * Note for professor: -
 */
import java.util.Scanner;

public class SimpleCalculator {
    // for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // for subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // for multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("************************************************");
            System.out.println("Please choose an arithmetic operation: + || - || * || / ");
            System.out.println("1 for + Add ");
            System.out.println("2 for - Subtract");
            System.out.println("3 for * Multiply");
            System.out.println("4 for / Divide");
            System.out.println("0 for Exit Calculator");
            System.out.println("---------------*****-----------------");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter First number:");
                int a = scanner.nextInt();
                System.out.println("Enter Second number:");
                int b = scanner.nextInt();

                double result = switch (choice) {
                    case 1 -> add(a, b);
                    case 2 -> subtract(a, b);
                    case 3 -> multiply(a, b);
                    case 4 -> divide(a, b);
                    default -> 0;
                };
                System.out.println("Result of the calculation: " + result);
            } else if (choice != 0) {
                System.out.println("Invalid Choice. Please try again.");
            }
        } while (choice != 0);

        System.out.println("Exiting Calculator...");
        scanner.close();
    }
}
