package ExceptionHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String contentToWrite = "Hello, this is a text file. \nWelcome to Java file 1/0!";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(contentToWrite);
            System.out.println("Data written to file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}