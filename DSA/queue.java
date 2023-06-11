package DSA;

import java.util.Queue;
import java.util.LinkedList;

public class queue {
    //---------------------QUEUE------------------

    /*
     * is a FIFO data structure....First In First Out
     * a collection designed for holding elements prior to processing
     * is a linear data structure
     * add = enqueue, offer()
     * remove = dequeue, poll()
     * element = peek()
     * add, remove and element throw exceptions
     * offer, poll and peek return special values
     * it extends the collection class so it inherits the methods of the collection class
     * isEmpty(), size(), contains()
     *
     * --------USES--------
     * 1. used in keyboard buffers
     * 2. printer queues
     * 3. used in linkedLists, priorityQueues, and Breadth-first search
     * 4.
     */

    //-----------------------------------------------
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        //As you can see we cannot instantiate a queue because queue is actually an interface not a class
        //there are only 2 classes that implement queues {linkedList and priorityQueue}

        //using offer()
        queue.offer("John");
        queue.offer("Frank");
        queue.offer("Mason");
        queue.offer("Steve");
        System.out.println(queue);

        //Using peek()
        System.out.println(queue.peek());

        //using poll()
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        //as you can see, unlike stacks, with this one, the first element was removed first


    }
}
