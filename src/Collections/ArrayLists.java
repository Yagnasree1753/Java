package Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); //List allows duplicates

        for (String name : names) {
            System.out.println(name);
        }
    }
}
