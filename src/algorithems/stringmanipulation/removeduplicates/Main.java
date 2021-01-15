package algorithems.stringmanipulation.removeduplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String str = "Thilinathilina";
        System.out.println(str);
        System.out.println(removeDuplicates(str));

    }

    private static String removeDuplicates(String str) {
        char[] arr = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for(char c:arr){
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(Character c: set){
            sb.append(c);
        }

        return sb.toString();
    }

}
