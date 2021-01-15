package algorithems.sorting.selection_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Selection sort!");
        int[] arr =  new int[]{1,4545,32,657,45,3,53,23,35,347,85,4,1,5656565};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {
        int min;
        int minIndex;
        for(int i=0; i<arr.length-1; i++){
            minIndex = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
