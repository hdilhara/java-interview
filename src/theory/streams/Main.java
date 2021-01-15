package theory.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Map<Integer,String> map =  new HashMap<>();

        map.put(43,"pvlrm");
        map.put(45,"d45tbgf");
        map.put(345,"tkkr");
        map.put(99,"pe");
        map.put(23,"dfgfg");

        System.out.println(map);

        Optional<Map.Entry<Integer, String>> max = map.entrySet().stream().max((a, b)->a.getKey()-b.getKey());

        if(max.isPresent())
            System.out.println(max.get());




    }


}
