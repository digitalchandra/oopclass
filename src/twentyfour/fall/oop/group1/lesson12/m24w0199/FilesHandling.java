package twentyfour.fall.oop.group1.lesson12.m24w0199;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesHandling {
    public static void main(String[] args) {
        // import file form the local folder
        File file = new File("test.txt");
        try (Scanner scanner = new Scanner(file)) {
            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //Seperate the line
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }
    }
}
