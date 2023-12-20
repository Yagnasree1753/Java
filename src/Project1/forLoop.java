package Project1;

import java.util.Arrays;

public class forLoop {
    public static void main(String[] args){
        int[] arr = {5,20,30,40,50,60,70};
        System.out.println(Arrays.toString(arr));
        arr[0] = 10;
        System.out.println(Arrays.toString(arr));

        for(int element : arr){
          System.out.println(element);
        }

        System.out.println("--------------");

        for(int i=3; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
