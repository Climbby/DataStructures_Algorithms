package DataStructures.Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Queues {

    public static void main(String[] args) {

        // Queue -  FIFO data structure. First-In First-Out (ex. A line of people)
        //          A collection designed for holding elements prior to processing
        //          Linear data structure

        //          add    = enqueue, offer()
        //          remove = dequeue, poll()

        // can't instantiate a Queue directly because it's an interface, not a class
        // so instead, we create a new LinkedList, a class that implements Queues
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek()); // returns the front of the line
        queue.poll(); // removes the item at front of the line

        // because queue extends Collections, it's inherited and it's methods can be used
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        System.out.println(queue);

        // uses of queues:
        // 1. Keyboard Buffer (letters appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

    }
}
