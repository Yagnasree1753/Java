package LambdaFunctions;
import java.util.*;
import java.util.stream.*;

public class APICalling {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 4, 9, 1, 8, 6);

        // forEach
        System.out.println("Using forEach:");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println ();

        // toArray
        Integer[] numbersArray = numbers.stream().toArray(Integer[]::new);
        System.out.println("\n Converted to Array:" + Arrays.toString(numbersArray));

        // reduce
        Integer sum = numbers.stream().reduce( 0, (a, b) -> a + b);
        System.out.println("\nSum of numbers: " + sum);

        // collect
        List<Integer> doubledNumbers = numbers.stream().map(n->n*2).collect (Collectors.toList());
        System.out.println("Doubled numbers: " + doubledNumbers);

        // min
        Integer minNumber = numbers.stream() .min(Integer::compare).orElseThrow(NoSuchElementException::new);
        System.out.println("Minimum number: "+minNumber);

        // max
        Integer maxNumber = numbers.stream().max(Integer::compare).orElseThrow (NoSuchElementException::new);
        System.out.println("Maximum number:" + maxNumber);

        // count
        long count = numbers.stream().count();
        System.out.println("Count of numbers: " + count);

    }
}

