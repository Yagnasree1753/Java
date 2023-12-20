package Collections;
import java.util.ArrayList;
import java.util.List;
public class nonGeneric {
    public static void main(String[] args){
        List nonGenericList = new ArrayList<>();
        nonGenericList.add("Java");
        nonGenericList.add(5);

        String FirstElement = (String) nonGenericList.get(0);
        Integer SecondElement = (Integer) nonGenericList.get(1);

        System.out.println("First Element " + FirstElement);
        System.out.println("Second Element " + SecondElement);
    }
}
