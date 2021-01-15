package theory.collections.queue.priority_queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>(25,(o1, o2) -> o1-o2);

        priorityQueue.add(233);
        priorityQueue.add(53);
        priorityQueue.add(2);
        priorityQueue.add(33);
        priorityQueue.add(8787);
        priorityQueue.offer(65);
        priorityQueue.add(43);
        priorityQueue.add(13);
        priorityQueue.add(5);

        System.out.println(priorityQueue);

        System.out.println("Peek : "+priorityQueue.peek());
//poll - peek gives  the head  and remove the head element as well
        //peek - return the heead of the queue
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }


//        Collections.addAll(priorityQueue, 12,32,3,23,53,53,6,6,564,34,34,3,543,46,46,4676,565);




    }

}
