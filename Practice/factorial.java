package Practice;

import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter The Number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            fact*=i;
        }

        System.out.println("The factorial is " + fact);

    }
}
