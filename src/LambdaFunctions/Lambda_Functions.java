package LambdaFunctions;
import java.util.function.Consumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;


public class Lambda_Functions {
    public static void main(String[] args){
        Consumer <String> display = x -> System.out.println(x);
        display.accept("Hello World!");

        BiFunction<Integer, Integer, Integer > add = (a,b) -> a + b;
        int result = add.apply(5,4);
        System.out.println("Sum: " + result);

        Function<String, Integer> length = S -> S.length();
        int len = length.apply("Yagna");
        System.out.println("Length : " + len);

        List<String> list = Arrays.asList("Java", "Python", "c++");
        list.forEach(element -> System.out.println(element));

        List<Integer> numbers = Arrays.asList(34, 4, 21, 54, 8, 7);
        numbers.sort((n1,n2) -> n1.compareTo(n2));
        System.out.println(numbers);
    }
//    public void DisplayString(String x){
//        System.out.println(x);
//    }

}
