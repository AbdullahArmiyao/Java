package DSA;

import java.util.Stack;

public class stack {
    //---------------------STACKS------------------

    /*
     * is a LIFO data structure....Last In First Out
     * stores objects in a tower form
     * push() to add to the top
     * pop() to remove from the top
     * the 5 methods stack uses are { push, pop, peek, isEmpty, search }
     * we can run out of memory when adding objects onto our stack
     *
     * --------USES--------
     * 1. can be used in undo/redo features in text editors
     * 2. used to move forward and back through web browsers
     * 3. backtracking algorithms (maze, file directories)
     * 4. calling a function
     */

    //-----------------------------------------------

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        //Using isEmpty()
        System.out.println("The stack is empty: " + stack.isEmpty());

        //Using push()
        stack.push("Call Of Duty: MW");
        stack.push("Call Of Duty: MW2");
        stack.push("Call Of Duty: MW3");
        stack.push("Call Of Duty: Warzone");
        stack.push("Call Of Duty: Warzone 2");
        System.out.println(stack);

        //Using pop()
        stack.pop();        //this removes warzone 2 from the stack
        System.out.println(stack);
        System.out.println("We popped: " + stack.pop());        //this prints out the removed item which in this case is warzone
        var popped = stack.pop();        //you can initialize a variable to hold the popped value
        System.out.println("We popped out "+ popped);
        //Note: an exception is thrown if you try to pop an empty stack

        //Using peek()
        stack.peek();
        System.out.println("We are peeking at " + stack.peek());           //with this you can view the top most item without it getting remove like pop
        var peeked = stack.peek();
        System.out.println("We peeked at " + peeked);

        //Using search()
        System.out.println(stack.search("Call Of Duty: MW"));       //searches the stack and prints the index of the item
        var search = stack.search("Call Of Duty: MW2");
        System.out.println("We searched for Call Of Duty MW2 which had an index of " + search);
        //Note the first (from the bottom) item will have an index of 1, not 0...so in the original stack Warzone 2 will be at index 1
        //If you search for an item that isnt in the stack it will return -1...observe
        System.out.println("We searched for minecraft and since it is not in the stack, it returns the value " + stack.search("MineCraft"));

        System.out.println(stack);
        System.out.println("The stack is empty: " + stack.isEmpty());
















    }
}
