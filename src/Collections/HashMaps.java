package Collections;
import java.util.Map;
import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args){
        Map <String, Integer> ageOfPeople = new HashMap<>();
        ageOfPeople.put("Alice", 25);
        ageOfPeople.put("Bob", 30);
        ageOfPeople.put("Alice" ,23); // HashMaps allows duplicates and returns updated value
        ageOfPeople.put("Charlie", 26);

        //Accessing the value
        int AliceAge = ageOfPeople.get("Alice");
        System.out.println("Alice Age: " + AliceAge);

        for(Map.Entry<String, Integer> entry: ageOfPeople.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
