package Basics;

import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        //while loops
        
        try(Scanner input = new Scanner(System.in)){      

        int pin = 1234;
        int attempts = 2;
        System.out.println("Enter Password: ");
        int pin1 = input.nextInt();
                
        while(pin1!=pin && attempts!=0) {
            System.out.println("Wrong Pin!");
            attempts--;
            System.out.println(attempts + " attempts remaining");
            System.out.println("Re-Try!");
            pin1 = input.nextInt();
          
        }
        
        if (pin1!=pin && attempts==0) {
            System.out.println("You are not the owner!");
        }
        else{
            System.out.println("Welcome, bro!");
        }
        
        }
    }
}
