package algorithems.second_min;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1,23,55,56,55,34,34,23,2,354,35,36,45,54,1};
        int smin = findsMin(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(smin);
    }

    private static int findsMin(int[] arr) {
        int min=0;
        int smin=0;

        for(int i=0; i<arr.length; i++){
            if(i==0){
                min = arr[i];
                smin = min;
                continue;
            }


            if(min>arr[i]){
                smin = min;
                min = arr[i];
            }
            if(min<arr[i] && smin>arr[i]){
                smin = arr[i];
            }

            if(min == smin){
                smin = arr[i];
            }
        }

        return smin;
    }

}
