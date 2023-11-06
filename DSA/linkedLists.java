package DSA;

import java.util.LinkedList;

public class linkedLists {
    public static void main(String[] args) {
        //---------------------LINKED LISTS------------------

        /*


         *  Stores nodes in 2 parts (data and address)
         *  Nodes are in non-consecutive memory locations
         *  Can be singly or doubly linked lists
         *  Elements are linked using pointers

                               *** Singly Linked Lists ***

               Node                      Node                      Node
          [data | address]    ->    [data | address]    ->    [data | address]


                               *** Doubly Linked Lists ***

                     Node                                 Node
          [address | data | address]    <->    [address | data | address]

         -----METHODS-----
         *  offerFirst() = addFirst()
         *  offerLast() = addLast()
         *  pollFirst() = removeFirst()
         *  pollLast() = removeLast()
         *  peekFirst() = getFirst()
         *  peekLast() = getLast()
         *  push()
         *  pop()
         *  offer()
         *  poll()

         --------ADVANTAGES--------
         * Dynamic data structure
         * Insertion and deletion of nodes is easy
         * No/low memory waste

         --------DISADVANTAGES--------
         * Greater memory usage
         * No random access of elements
         * Searching/Accessing

         --------USES--------
         1. implement stacks/queues
         2. gps navigation
         3. music playlist


         */

        //-----------------------------------------------

        LinkedList<String> linkedlist = new LinkedList<String>();

//        linkedlist.push("A");
//        linkedlist.push("B");
//        linkedlist.push("C");
//        linkedlist.push("D");
//        linkedlist.push("F");
//        String removed = linkedlist.pop();
//        System.out.println(linkedlist + "...linked list can be created as a stack " + removed);

//        linkedlist.offer("A");
//        linkedlist.offer("B");
//        linkedlist.offer("C");
//        linkedlist.offer("D");
//        linkedlist.offer("F");
//        String removed = linkedlist.poll();
//        System.out.println(linkedlist + "...linked list can be created as a queue " + removed);

        linkedlist.offer("a");
        linkedlist.offer("b");
        linkedlist.offer("c");
        linkedlist.offer("d");
        linkedlist.offer("f");
        System.out.println(linkedlist);
        linkedlist.add(4, "e");
        System.out.println(linkedlist+"\nas you can see we added e at the index of F which shifted f to a new node");

//      System.out.println(linkedlist.indexOf());        //this is to search for an element
//      System.out.println(linkedlist.peekFirst());     //this is to see the element to the head
//      System.out.println(linkedlist.peekLast());      //this is to see the element to the tail
//      linkedlist.addFirst();                          //this is to add an element to the first node
//      linkedlist.addLast();                           //this is to add an element to the last node
//      linkedlist.removeFirst();                       //this is to remove an element to the first node
//      linkedlist.removeLast();                        //this is to remove an element to the last node
//


    }
}
