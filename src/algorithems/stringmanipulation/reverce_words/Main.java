package algorithems.stringmanipulation.reverce_words;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String str = "    Hey, I'm     Thilina Dilhara .";

        System.out.println(str);

        System.out.println(reverceWords(str));

    }

    private static String reverceWords(String str) {
        String[] arr = str.split(" ");
        Collections.reverse(Arrays.asList(arr));

        return String.join(" ",arr);
    }

}
