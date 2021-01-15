package algorithems.sorting.bubble_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr =  new int[]{4545,32,657,45,3,53,23,35,347,85,4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        boolean isSort = true;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSort = false;
                }
            }
            if(isSort)
                break;
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

}
