package Collections;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();
        System.out.println("Hello" + name + "!" );
        scanner.close();
    }
}
