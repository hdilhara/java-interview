package algorithems.searching.binary_search;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{3,6567,3,34,34,65,23,54,5,6464,34,5,46,7,69,9,8,343,2,43,65,7,454,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = binarySearch(arr, 6464);
        System.out.println(index);

        int index1 = binarySearchRecurtion(arr, 6464);
        System.out.println(index1);

    }

    private static int binarySearchRecurtion(int[] arr, int i) {
        if(arr.length == 1) {
            if(arr[0] == i)
                return 0;
            else
                return -1;
        }

        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        int mid = (leftIndex+rightIndex)/2;

        if(arr.length == 2){
            if(i==arr[leftIndex])
                return leftIndex;
            else if(i==arr[rightIndex])
                return rightIndex;
            else
                return -1;
        }else if(i<=arr[mid])
            return leftIndex+binarySearchRecurtion(Arrays.copyOfRange(arr,leftIndex,mid+1),i);
        else if(i> arr[mid])
            return mid+binarySearchRecurtion(Arrays.copyOfRange(arr,mid,rightIndex+1),i);
        return -1;
    }

    private static int binarySearch(int[] arr, int i) {

        if(arr.length == 1){
            if(arr[0] == i)
                return 0;
            else
                return -1;
        }

        int leftIndex = 0;
        int rightIndex = arr.length-1;

        while (true){
            int mid = (leftIndex+rightIndex)/2;

            if((rightIndex-leftIndex) == 1){
                if(i==arr[leftIndex])
                    return leftIndex;
                else if(i==arr[rightIndex])
                    return rightIndex;
                else
                    return -1;
            }
            else if(i<=arr[mid]){
                if(i==arr[mid])
                    return mid;
                rightIndex =mid;
            }else if(i>arr[mid]){
                leftIndex = mid;
            }
        }
    }

}
