package Practice;
import java.util.*;
//import java.io.*;

public class calculator2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
            //Menu
            System.out.println("CALCULATOR");
        
            System.out.print("How many times do you intend to run this program? ");
            int times = input.nextInt();

            for(int i = 0; i < times; i++){
                calcus();
            }
            System.out.println("Thank you for choosing this brand. Come again next time.");
            
            //Option To Continue Or Not
           /*            
            System.out.println("Would you like to continue?: (Y/N)");
            String con = input.next();
            String conn = con.toUpperCase();
            if (conn != "N") {
               calcus();    
            } 
            else {
                System.out.println(conn);
            }
            */

        }

    public static void calcus() {
            Scanner b = new Scanner(System.in);
            double num1;
            double num2;
            int choice;
            double result;
            

            //Menu Screen
            System.out.println("What operation would you like to perform?");
            System.out.println("1.Average");
            System.out.println("2.Basic Math");
            System.out.println("3.Maximum");
            System.out.println("4.Square Root");
            
            System.out.println("Select Choice"); 
            choice = b.nextInt();
            b.nextLine();


            //Calculations
            switch (choice) {
                case 1:
                    System.out.print("Enter 1st Value: ");
                    num1 = b.nextDouble();
                    System.out.print("Enter 2nd Value: ");
                    num2 = b.nextDouble();
                    double Average = (num1+num2)/2;
                    System.out.println("Your Answer Is: " + Average);
                    break;
                
                case 2:
                    System.out.print("Enter 1st Value: ");
                    num1 = b.nextDouble();
                    System.out.print("Enter 2nd Value: ");
                    num2 = b.nextDouble();
                    System.out.print("Enter Operation: ");
                    String operation = b.next();
                    switch (operation) {
                        case "+":
                            result = num1 + num2;
                            System.out.println("Your Answer Is: " + result);
                            break;
                        case "-":
                            result = num1 - num2;
                            System.out.println("Your Answer Is: " + result);
                            break;
                        case "*":
                            result = num1 * num2;
                            System.out.println("Your Answer Is: " + result);
                            break;
                        case "/":
                            result = num1 / num2;
                            System.out.println("Your Answer Is: " + result);
                            break;
                    
                        default:
                            System.out.println("Invalid Number or Operation");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Enter 1st Value: ");
                    num1 = b.nextDouble();
                    System.out.print("Enter 2nd Value: ");
                    num2 = b.nextDouble();
                    double maximum = Math.max(num1, num2);
                    System.out.println("Your Answer Is: " + maximum);
                    break;
                case 4:
                    System.out.print("Enter Value: ");
                    num1 = b.nextDouble();
                    result = Math.sqrt(num1);
                    System.out.println("Your Answer Is: " + result);
                    break;
            
                default:
                    System.out.println("Invalid Choice");
                    break;
            
    }
                
                
                
                
        }
}
    


