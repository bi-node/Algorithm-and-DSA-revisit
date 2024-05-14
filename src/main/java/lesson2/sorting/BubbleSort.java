package lesson2.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {56, 24, 5, 2, 45, 42, 5, 4, 24, 1, 3,  23};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++)
            for (int j = 0; j < arr.length -i- 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j+1);
            }
    }

    public static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
