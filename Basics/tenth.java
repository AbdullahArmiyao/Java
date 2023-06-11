package Basics;

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        //Nested Loops

        try(Scanner input = new Scanner(System.in)){
            int rows;
            int columns;
            String symbol = "";

            System.out.println("Enter Number Of Rows: ");
            rows = input.nextInt();
            System.out.println("Enter Number Of Columns: ");
            columns = input.nextInt();
            System.out.println("Enter Symbol: ");
            symbol = input.next();
        
            
            for (int i = 1; i <= rows; i++) {
                System.out.println();
                for (int j = 1; j <= columns; j++) {
                    System.out.print(symbol);
                }
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        

    }
}
