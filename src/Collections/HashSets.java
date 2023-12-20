package Collections;
import java.util.Set;
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        Set <String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); //Duplicate Alice is ignored

        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}