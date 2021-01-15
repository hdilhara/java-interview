package algorithems.sorting.merge_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Merge sort!");
        int[] arr =  new int[]{1,4545,32,657,45,3,53,23,35,347,85,4,1};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] mergeSort(int[] arr) {

        int[] arr1 = null;
        int[] arr2 = null;
        //divide
           if(arr.length>1) {
            int divideFactor = arr.length / 2;
            arr1 = new int[divideFactor];
            arr2 = new int[arr.length - divideFactor];
            arr1 = Arrays.copyOfRange(arr, 0, divideFactor);
            arr2 = Arrays.copyOfRange(arr, divideFactor, arr.length);

//               System.out.println(Arrays.toString(arr1));
//               System.out.println(Arrays.toString(arr2));

            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            //merge
               int index1=0;
               int index2=0;
               int count=0;

       while (count < arr.length){
           if(index2 >= arr2.length){
               arr[count++] = arr1[index1++];
           }else if(index1 >= arr1.length){
               arr[count++] = arr2[index2++];
           }
           else if(arr1[index1]<=arr2[index2]){
               arr[count++] = arr1[index1++];
           }else if(arr2[index2]<=arr1[index1]){
               arr[count++] = arr2[index2++];
           }
       }
        }

        return arr;
    }

}
