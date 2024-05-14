package lesson2.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array)
    {

        for(int i=0; i<array.length-1;i++){
            int index=minimumIndex(array, i);
            swap(array,i, index);
        }

    }

    public static int minimumIndex(int[] arr, int start){
        int minValue=arr[start];
        int minIndex=start;
        for(int i=start+1; i<arr.length; i++)
        {
            if(arr[i]<minValue)
            {
                minValue=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void main(String[] args) {

        int[] a = {56, 24, 5, 2, 45, 42, -5, 4, -24, 1, 3,  23};
        selectionSort(a);
        System.out.println(Arrays.toString(a));

    }

}
