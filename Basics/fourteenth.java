package Basics;

import java.util.*;
import java.io.*;

public class fourteenth{
    public static void main(String[] args){
        //Wrapper Class

        /*
         * Provides a way to use primitive data types(int, boolean, char, double) as
         * reference data types
         * Reference data types include String
         * Reference data types contain useful methods
         * They can be used with collections
         * 
         * primitive            wrapper
         * ---------            ---------
         * int                  Integer
         * boolean              Boolean
         * char                 Character
         * double               Double
         * 
         * 
         * 
         * autoboxing is the automatic conversion that the compiler makes between
         * primitive data types and their corresponding wrapper class
         * unboxing is the reverse of autoboxing
         * 
         */

         //Autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        //unboxing
        if (a==true) {
            System.out.println("this is true");
        }
        if (b=='@') {
            System.out.println("this is true");
        }
        if (c==123) {
            System.out.println("this is true");
        }
        if (d==3.14) {
            System.out.println("this is true");
        }
        if (e=="bro") {
            System.out.println("this is true");
        }



        //But primitive dt is faster than wrapper classes.



















    }
}