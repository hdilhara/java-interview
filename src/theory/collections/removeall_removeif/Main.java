package theory.collections.removeall_removeif;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        Collections.addAll(list,12,22,35,414,4,8,4,4,8,22);
        Collections.addAll(list1,4,8,22);

        System.out.println(list);

        //list.removeAll(list1);

//        list.removeIf(a->a>20);

        list.retainAll(list1);

        System.out.println(list);


    }

}
