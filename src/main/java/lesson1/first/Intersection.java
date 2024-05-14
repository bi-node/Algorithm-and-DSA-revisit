package lesson1.first;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Intersection {

    // private BinarySearch search = new BinarySearch();


    public List<Integer> intersectionFast(int[] a, int[] b) {
        int pointerA = 0, pointerB = 0;
        mergeSort(a);
        mergeSort(b);
        List<Integer> result = new ArrayList<>();

        while (pointerA < a.length && pointerB < b.length) {
            if (a[pointerA] == b[pointerB]) {
                result.add(a[pointerA]);    //can be written as b also
                pointerA++;
                pointerB++;
            } else if (a[pointerA] > b[pointerB]) {
                pointerB++;
            } else pointerA++;
        }
        return result;
    }

    public void mergeSort(int[] input) {
        Arrays.sort(input);
    }

    public static void main(String[] args) {
        Intersection inter = new Intersection();
        System.out.println(inter.intersectionFast(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        System.out.println(inter.intersectionFast(new int[]{4, 6, 11, 2, 3}, new int[]{5, 11, 3, 9, 1}));
    }
}
