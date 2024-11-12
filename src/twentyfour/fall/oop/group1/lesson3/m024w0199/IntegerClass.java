package twentyfour.fall.oop.group1.lesson3.m024w0199;
import java.util.Random;
public class IntegerClass {
    public static void main(String[] args){
        // constant value for special ASCII characters

        final char PLUS_MINUS = '±';
        final char HALF = '½';
        final char QUARTER = '¼';

        // Use short data type for integer range as it is sufficient
        short minInt = Short.MIN_VALUE;
        short maxInt = Short.MAX_VALUE;

        // Calculate quarter and half of the range values
        short quarterMin = (short) (minInt / 4);
        short halfMin = (short) (minInt / 2);
        short quarterMax = (short) (maxInt / 4);
        short halfMax = (short) (maxInt / 2);

        Random random = new Random();
        short randomInt = (short) (random.nextInt(maxInt - minInt + 1) + minInt);
        //short randomQuarter = (short) (random.nextInt(quarterMax - quarterMin + 1) + quarterMin);
        short randomHalf = (short) (random.nextInt(halfMax - halfMin + 1) + halfMin);
        // Print the results in a readable format
        System.out.println("The range of the integer data type is approximately:");
        System.out.println("Minimum: " + minInt);
        System.out.println("Maximum: " + maxInt);
        System.out.println();
        System.out.println("The ¼ of this range is:");
        System.out.println("Minimum: " + quarterMin + " (" + PLUS_MINUS + QUARTER + minInt + ")");
        System.out.println("Maximum: " + quarterMax + " (" + PLUS_MINUS + QUARTER + maxInt + ")");
        System.out.println();
        System.out.println("The ½ of this range is");
        System.out.println("Minimum: " + halfMin + " (" + PLUS_MINUS + HALF + minInt + ")");
        System.out.println("Maximum: " + halfMax + " (" + PLUS_MINUS + HALF + maxInt + ")");
        //for Random value
        System.out.println("Random Value: " + randomHalf);
        System.out.println();
        System.out.println("Random Value within the Entire Range:");
        System.out.println(randomInt);
//        System.out.println("Random Quator Value is ");
//        System.out.println(randomQuarter);


    }
}
