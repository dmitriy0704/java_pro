package my.home.oop;

import java.util.Arrays;

public class OopMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArr(int[] ar){
        ar[0] = 10;
    }
}
