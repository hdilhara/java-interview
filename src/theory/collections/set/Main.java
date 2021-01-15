package theory.collections.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>((a,b)->b-a);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,32,56,9,4,6,9,45,89,35,9,4,45);

        System.out.println(list);
        hashSet.addAll(list);
        linkedHashSet.addAll(list);
        treeSet.addAll(list);

        System.out.println("Hash Set: "+hashSet);
        System.out.println("Linked Hash Set: "+linkedHashSet);
        System.out.println("Tree Set: "+ treeSet);



    }


}
