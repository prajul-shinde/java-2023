package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        // a -> b -> c //c infront of queue
        System.out.println(queue);
        queue.offer("d");
        // d ->a ->b ->c //d at end of queue
        System.out.println(queue + "offer");

        System.out.println(queue.peek());
        // System.out.println( queue.element()); //yhrows exception if empty
        // queue.poll();
        // queue.remove(); // throws exception if empty
        System.out.println(queue);
    }

}
