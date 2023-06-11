package Basics;

import java.util.Scanner;

public class thirteenth {
    public static void main(String[] args) {
        //Finding Max Value Between Numbers
        Scanner input = new Scanner(System.in);
        
        System.out.print("Value 1: ");
        int a = input.nextInt();
        System.out.print("Value 2: ");
        int b = input.nextInt();
        System.out.print("Value 3: ");
        int c = input.nextInt();
        System.out.print("Value 4: ");
        int d = input.nextInt();
        
        int max_Value = Math.max(a, Math.max(b, Math.max(c, d)));
        
        System.out.println("max value is " + max_Value);
        
        //Finding Quadrant
        System.out.print("Value 1: ");
        int e = input.nextInt();
        System.out.print("Value 2: ");
        int f = input.nextInt();
        
        if (e>0 && f>0) {
            System.out.println("1st quadrant: " + "(" + e+ "," + f + ")");
        } 
        else if (e<0 && f>0) {
            System.out.println("2nd quadrant: " + "(" + e+ "," + f + ")");
        } 
        else if (e<0 && f<0) {
            System.out.println("3rd quadrant: " + "(" + e+ "," + f + ")");
        } 
        else {
            System.out.println("4th quadrant: " + "(" + e+ "," + f + ")");
        }
       
        










    }
}
