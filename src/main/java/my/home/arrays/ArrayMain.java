package my.home.arrays;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        //####### Перебор элементов массива; #######//

        //Нумерация массива:
        int[] arr = new int[5];
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            arr[i] = j;
        }

        //Вывод значений в прямом порядке:
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Вывод в обратном порядке
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
