package theory.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> hashMap = new TreeMap<>((o1,o2)->o2-o1);

        hashMap.put(1,"Thilina");
        hashMap.put(2,"Dilhara");
        hashMap.put(3,"Hida");
        hashMap.put(4,"Shalitha");
        hashMap.put(5,"Shalitha");
        hashMap.put(6,"Shalitha");
        hashMap.put(7,"Shalitha");
        hashMap.put(8,"Shalitha");
        hashMap.put(9,"Shalitha");
        hashMap.put(10,"Shalitha");
        hashMap.put(11,"Shalitha");
        hashMap.put(12,"Shalitha");
        hashMap.put(13,"Shalitha");
        hashMap.put(14,"Shalitha");

        System.out.println(hashMap);

    }

}
