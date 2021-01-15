package theory.collections.collection_toarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"Thilina","Dilhara","Hida","Raina");

        System.out.println(list);

        String[] arr = list.toArray(new String[1]);

        System.out.println(Arrays.toString(arr));

    }


}
