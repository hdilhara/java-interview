package theory.collections.queue.priority_queue.array_dqueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDqueue = new ArrayDeque<>();

        Collections.addAll(arrayDqueue,23,454,65,65,7,67,787,45,2,3,56,57,67,6,45,454,5475,65,23,75);

        System.out.println(arrayDqueue);

        while (!arrayDqueue.isEmpty()){
            System.out.println(arrayDqueue.pollLast());
        }



    }


}
