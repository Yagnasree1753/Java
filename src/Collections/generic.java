package Collections;
import java.util.ArrayList;
import java.util.List;
public class generic {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");

        String FirstElement = strings.get(0);
        String SecondElement = strings.get(1);

        System.out.println("First Element " + FirstElement);
        System.out.println("Second Element " + SecondElement);
    }
}
