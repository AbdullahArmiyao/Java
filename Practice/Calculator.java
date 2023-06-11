package Practice;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {        
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter Value 1: ");
        double value1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Operation: ");
        String operation = input.nextLine();
        
        System.out.print("Enter Value 2: ");
        double value2 = input.nextDouble();
        
        double answer;
        switch (operation) {
            case "+":
                answer = value1 + value2;
                System.out.println(answer);
                break;
            case "-":
                answer = value1 - value2;
                System.out.println(answer);
                break;
            case "*":
                answer = value1 * value2;
                System.out.println(answer);
                break;
            case "/":
                answer = value1 / value2;
                System.out.println(answer);
                break;
        
            default:
                System.out.println("Invalid Number or Operation");
                break;
            
            }       
        }
    }
}
