package lesson1.first;

public class BinarySearchRecursion {

    public boolean binarySearch(int x, int[] arr, int start, int end){
        if(start>end) return false;
        else{
            int mid=(start+end)/2;
            if(arr[mid]==x) return true;
            else if(x>arr[mid])  return binarySearch(x, arr, mid+1, arr.length-1);
            else return binarySearch(x, arr, 0, mid-1);
        }

    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(binarySearch.binarySearch(5, new int[]{1, 2, 3, 4, 45, 6, 7, 8, 9, 10}));
    }
}
