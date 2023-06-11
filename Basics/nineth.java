package Basics;

import java.util.*;

public class nineth {
    public static void main(String[] args) {
        //For Loops
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println(i);
        
        }
        for (int i = 10; i >= 0; i--) {
            
            System.out.println(i);
        
        }

        //For-each Loops
        
        /*
         * takes less step and is more readable but less flexible
         */

         String[] pets = {"Cat", "Birds", "Dog", "Rat"};
         System.out.println(pets);
         for (String i : pets) {     // : represents in
            System.out.println(i);
         }


         ArrayList<String> animals = new ArrayList<>();
         animals.add("Lion");
         animals.add("Shark");
         animals.add("Fox");
         animals.add("Wolf");
         animals.add("Snake");
         animals.add("Falcon");
         System.out.println(animals);
         for (String animal : animals) {
            System.out.println(animal);
         }

    }
}
