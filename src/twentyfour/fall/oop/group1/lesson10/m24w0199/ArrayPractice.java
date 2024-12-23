package twentyfour.fall.oop.group1.lesson10.m24w0199;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayPractice {
        public static void main(String[] args) {
            // Create an ArrayList of integers
            ArrayList<Integer> numbers = new ArrayList<>();

            // Manually add at least 6 different numbers
            numbers.add(10);
            numbers.add(5);
            numbers.add(20);
            numbers.add(15);
            numbers.add(8);
            numbers.add(12);

            // Use Collections.sort() to arrange the numbers in ascending order
            Collections.sort(numbers);

            // sorted numbers in numbers
            System.out.println("Sorted numbers: " + numbers);

            // highest and lowest numbers
            int highest = numbers.get(numbers.size() - 1);
            int lowest = numbers.get(0);
            System.out.println("Highest number: " + highest);
            System.out.println("Lowest number: " + lowest);

            // Remove a specific number 
            numbers.remove(Integer.valueOf(10));

            // Print the modified number lists
            System.out.println("Modified list: " + numbers);
        }

}
