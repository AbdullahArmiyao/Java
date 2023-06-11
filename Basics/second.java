package Basics;

import java.util.Scanner; //In order to accept input, you need to import Scanner

public class second {

    public static void main(String[] args) {
        //Accepting User Input
        try (Scanner input = new Scanner(System.in)){
            
            System.out.println("What's your name?");
            String name = input.nextLine();     //taking the user input
            System.out.println("Hey there, " + name);
            
            System.out.println("How old are you?");
            int age = input.nextInt();      //taking the user input
            System.out.println(age + " years old? Wow, cool!");
            input.nextLine();
            
            System.out.println("What's your hobby?");
            String hobby = input.nextLine();     //taking the user input
            System.out.println("You like " + hobby);
            
            System.out.println("What is your favourite number?");
            int num = input.nextInt();      //taking the user input
            System.out.println(num + " is a great number after all.");
        
        }
        /*

        *"Scanner "insert desired name here" = new Scanner(System.in)" Never forget this line
         this line allows you to access the input function
        
         *I think the scanner line has to be in the () of the try code while the remaining code goes into
         the {} of the try block but is not compulsory
        
         *You notice you are not able to enter the hobby. To prevent this, 
         you have to type this "input.nextLine()" after the first int input
        
         */




    }
}
