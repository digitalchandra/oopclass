package twentyfour.fall.oop.group1.lesson12.m24w0199;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {

        public static void main(String[] args) {
            //Code for Write file
            String fileName = "Chandra.txt";
            String content = "KCG Student Hello !\nThis is a file writing example using FileWriter.";

            try (FileWriter writer = new FileWriter(fileName)) {
                // Writing above the text in the File
                writer.write(content);
                System.out.println("File written success on.. " + fileName);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
}
