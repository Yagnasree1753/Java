package Project1;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args){
        int[] numbers = {34,21,4,56,65,23};
        // sorting array elements in ascending order
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //to print last to second elemnt
        System.out.println(numbers[numbers.length-2]);
    }
}
