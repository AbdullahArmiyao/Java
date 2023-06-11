package Basics;

import java.util.*;

public class sixteenth {
    public static void main(String[] args) {
        //2D ArrayList

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

      ArrayList<String> bakerylist = new ArrayList<>();
        bakerylist.add("pasta");
        bakerylist.add("pizza");
        bakerylist.add("bread");

        System.out.println(bakerylist);
        System.out.println(bakerylist.get(0));
        System.out.println(bakerylist.get(1));
        System.out.println(bakerylist.get(2));
        
        
        ArrayList<String> producelist = new ArrayList<>();
        producelist.add("Tomatoes");
        producelist.add("Pepper");
        producelist.add("Onion");
        
        System.out.println(producelist);
        System.out.println(producelist.get(0));
        System.out.println(producelist.get(1));
        System.out.println(producelist.get(2));
    
        
        
        ArrayList<String> drinklist = new ArrayList<>();
        drinklist.add("Kalypo");
        drinklist.add("Fanta");
        
        System.out.println(drinklist);
        System.out.println(drinklist.get(0));
        System.out.println(drinklist.get(1));

        ArrayList<Integer> priceList = new ArrayList<>();
        priceList.add(10);
        priceList.add(20);
        priceList.add(30);
        priceList.add(40);
        priceList.add(50);

        System.out.println(priceList);
      for (int i : priceList) {
        System.out.println(i);

      }


    
        groceryList.add(bakerylist);
        groceryList.add(producelist);
        groceryList.add(drinklist);


        System.out.println(groceryList);        //to print the 2d list
        System.out.println(groceryList.get(0));        //to print a member in the list
        System.out.println(groceryList.get(0).get(0));        //to print member's own list

    }
}

