import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input array size: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        int[] arr1 = arr;
        int[] arr2 = arr;
        //System.out.print("Unsorted array: ");
        for (int i = 0; i<arr.length;i++) {
            arr[i] = (int) Math.round((Math.random()*2000)-1000);
           // System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        SelSort(arr);
        long start = System.currentTimeMillis();
        Arrays.sort(arr1);
        long finish = System.currentTimeMillis();
        long timeConsumed = finish - start;
        System.out.println("Integrated sort time: " + timeConsumed);
        int low=0;
        int high=arr2.length-1;
        start = System.currentTimeMillis();
        QuickSort.quickSort(arr2,low,high);
        finish = System.currentTimeMillis();
        timeConsumed = finish - start;
        System.out.println("Quick sort time: " + timeConsumed);

    }

    public static int[] SelSort(int[] array) {
        long start = System.currentTimeMillis();
    for (int i=0;i<array.length;i++) {
        int min = array[i];
        int min_i = i;
        for (int j=i+1; j<array.length;j++) {
            if (min>array[j]) {
                min = array[j];
                min_i = j;
            }
        }
        if (i != min_i) {
        int tmp = array[i];
        array[i] = array[min_i];
        array[min_i] = tmp;
        }
        }
        long finish = System.currentTimeMillis();
        long timeConsumed = finish - start;
        System.out.println("Selection sort time: " + timeConsumed);
        return array;
    }
    }


