package theory.streams.maping;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list =  new ArrayList<>();
        Collections.addAll(list,"Thilina","Hida","Raina","Gamage");

        list = list.stream().map(a->"Name: "+a).collect(Collectors.toList());
        System.out.println(list);

        list = list.stream().filter(a->!a.equals("Name: Thilina")).collect(Collectors.toList());
        System.out.println(list);

        Map<Integer,String> map =  new HashMap<>();
        map.put(1,"Thilina");
        map.put(2,"Dilhara");
        map.put(3,"Raina");
        map.put(4,"Hida");

        map.putIfAbsent(2,"Gamage");

        System.out.println(map);


    }

}
