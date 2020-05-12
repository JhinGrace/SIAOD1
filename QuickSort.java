import java.util.Scanner;
public class QuickSort {
    public static void quickSort(int[] array, int low, int high)
    {
        if(array.length==0)
        return;
        if (low>=high)
            return;
        int middle=low+(high-low)/2;
        int opora=array[middle];
        int i=low, j=high;
        while(i<=j)
        {while(array[j]>opora)
            j--;
            while(array[i]<opora)
                i++;
            if(i<=j){
                int tmp=array[i];
                array[i]=array[j];
                array[j]=tmp;
                i++;
                j--;
            }
        }
        if(low<j)
            quickSort(array,low,j);
        if(high>i)
            quickSort(array,i,high);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input array size: ");
        int n=in.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++)
        {System.out.println("Input" + i + "-th element");
            array[i]=in.nextInt();
        }
        int low=0;
        int high=array.length-1;
        quickSort(array,low,high);
        System.out.println("Sorted array: ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
}
