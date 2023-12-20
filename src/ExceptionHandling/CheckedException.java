package ExceptionHandling;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt");
            // Read and process the file
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }

    }
}

