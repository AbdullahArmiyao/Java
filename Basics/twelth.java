package Basics;

public class twelth {
    public static void main(String[] args) {
        //String Class Methods


        String name = "     Bro     ";

        //METHODS
        boolean result = name.equals("     bro     ");           //compares strings to see if they are equal
        boolean result1 = name.equalsIgnoreCase("     bro     ");      //same thing but ignores casing     //compares strings to see if they are equal
        int result2 = name.length();        //gives us the length of the string
        char result3 = name.charAt(5);       //gets the character index
        int result4 = name.indexOf("o");       //vice versa of charAt
        boolean result5 = name.isEmpty();       //checks to see if the variable is empty
        String result6 = name.toLowerCase();    //...to lower case
        String result7 = name.toUpperCase();    //...to upper case
        String result8 = name.trim();    //removes empty spaces before and after a variable
        String result9 = name.replace('o', 'a');       //self explanatory








        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
    
    }
}
