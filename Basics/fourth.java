package Basics;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        //Using The Math Class
        
        double x = 3.14;
        double y = -4.13;
        double z = Math.max(x, y);      //Finding max value
        double a = Math.abs(y);      //Finding absolute value
        double o = Math.sqrt(x);       //Finding Square root
        double b = Math.round(x);       //Finding the rounded value
        double s = Math.ceil(x);       //Finding the value rounded up
        double e = Math.floor(x);       //Finding the value rounded down
        
        
        System.out.println(z);
        System.out.println(a);
        System.out.println(o);
        System.out.println(b);
        System.out.println(s);
        System.out.println(e);


        //A program to find the hypothenus of a triangle
        
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter Length: ");
            double L = input.nextDouble();
            System.out.print("Enter Height: ");
            double H = input.nextDouble();
            
            double hypothenus = Math.sqrt((L*L) + (H*H));
            System.out.println("The hypothenuse is " + hypothenus);
        
            input.close();
        }



    }
}
