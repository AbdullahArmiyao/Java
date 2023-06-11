package Basics;

import java.util.Random;

public class fifth {
    public static void main(String[] args) {
        //Working With Random

        Random mine = new Random();  //getting access to the random instance to generate pseudo random numbers
        
        double x = mine.nextDouble();
        System.out.println(x);

        //Code to roll a dice
        int y = mine.nextInt(6)+1;      //plus 1 because the computer would read the range from 0-5, so adding one...you already know this
        System.out.println(y);


















    }
}