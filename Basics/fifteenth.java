package Basics;

import java.util.*;
import java.io.*;

public class fifteenth {
    public static void main(String[] args) {
        //ArrayList

        /*
         * Is a resizable array, elements can be added and removed
         * after compilation
         * they only store reference data types
         */

        //to store values, instead of the primitive data type, we use the wrapper class
        /*
        * ArrayList<Integer> numbers = new ArrayList<Integer>();
        * ArrayList<Boolean> facts = new ArrayList<Boolean>();
        * ArrayList<Character> letters = new ArrayList<Character>();
        */ 
         ArrayList<String> food = new ArrayList<String>();

         food.add("Pizza");
         food.add("Hot dog");
         food.add("Burger");

         //Methods
        food.set(0, "Sushi");       //to replace a value at a certain index
        food.remove(2);     //self explanatory
        food.clear();       //self eplanatory



        for (int i = 0; i < food.size(); i++) {     //for arrays it is array.length
            System.out.println(food.get(i));        //to access elements in the arraylist
        }


            
    }
}
