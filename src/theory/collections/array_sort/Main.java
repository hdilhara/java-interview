package theory.collections.array_sort;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{343,545,99,23,5,35,66,44,2,44,66};

//        Arrays.sort(arr);

        Collections.sort(Arrays.asList(arr), (a,b)->b-a);

        System.out.println(Arrays.toString(arr));
    }

}
