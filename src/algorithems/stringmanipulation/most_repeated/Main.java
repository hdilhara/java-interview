package algorithems.stringmanipulation.most_repeated;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        String str = "ewebgfhgwhgfdw";
        System.out.println(str);
        System.out.println(String.valueOf(mostRepeated(str)));

    }

    private static String mostRepeated(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        Map.Entry<Character,Integer> max = map.entrySet().stream().max((o1, o2)->o1.getKey()-o2.getKey()).get();

        return max.toString();
    }

}
