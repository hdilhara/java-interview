package theory.collections.distinct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        List<Integer> list  = new ArrayList<>();

        Collections.addAll(list,435,56,8,56,45,7,4,3,6,5,67,7,8,435);

        System.out.println(list);

        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);



    }

}
