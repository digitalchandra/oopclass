package twentyfour.fall.oop.group1.lesson4.m24w0199;
/**
 * Id: M24W0199
 * Name: Shrestha Chandra Bahadur
 * Assignment: KCGI/OOP
 * Note for professor: -
 */

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate Random Number Between 1 and 100
        int ranNumber = (int) (Math.random() * 100) + 1;

        // Array to hold the guesses
        byte[] guesses = new byte[10];
        int attempts = 0;

        // For loop to process guesses
        for (int a = 0; a < guesses.length; a++) {
            int guess;

            // Loop for user input
            while (true) {
                System.out.println("Enter a guess between 1 and 100:");
                try {
                    guess = (byte) Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            // Check for invalid guess range
            if (guess < 1 || guess > 100) {
                System.out.println("Not a valid guess. Please enter a number between 1 and 100.");
                a--;  // Allow user to re-enter for the same attempt
                continue;
            }

            attempts++;
            guesses[a] = (byte) guess;

            // Check if the guess is correct
            if (guess == ranNumber) {
                System.out.println("Congratulations! You guessed correctly in " + attempts + " attempts.");
                break;
            } else if (guess > ranNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            // Game over if max attempts are reached
            if (attempts == guesses.length) {
                System.out.println("Game Over! The correct number was " + ranNumber + ".");
                break;
            }
        }

        scanner.close(); // Close the scanner
    }
}
