package algorithems.stringmanipulation.sentence_capitalization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String str = "sde rttrt rbghty eokwe, gfhken";

        System.out.println(sentenceCapitalize(str));

    }

    private static String sentenceCapitalize(String str) {
        String[] arr = str.split(" ");

        List<String > list  =  new ArrayList<>(Arrays.asList(arr));

        list = list.stream().map(a->{
            StringBuilder sb = new StringBuilder(a.trim().toLowerCase());
            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
            return sb.toString();
        }).collect(Collectors.toList());

        str = String.join(" ",list);

        return str;
    }

}
