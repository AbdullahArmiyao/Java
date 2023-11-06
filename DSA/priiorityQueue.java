package DSA;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import  java.util.PriorityQueue;

public class priiorityQueue {
    //---------------------PRIORITY QUEUE------------------

    /*
     * is a FIFO data structure....First In First Out
     * serves elements with highest priorities first before elements with lower priority
     * add = enqueue, offer()
     * remove = dequeue, poll()
     * element = peek()
     *
     *
     * --------USES--------
     * 1.
     * 2.
     * 3.
     * 4.
     */

    //-----------------------------------------------

    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        //Collections.reverseOrder() is pretty self-explanatory
        queue.offer(3.0);
        queue.offer(5.0);
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(1.0);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

      /*
      *With lnkedlists the order is the same unlike priority queue where it is arranged
      Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(5.0);
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(1.0);

        System.out.println(queue);
       */






    }

}
