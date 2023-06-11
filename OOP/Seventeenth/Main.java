package OOP.Seventeenth;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Dynamic Polymorphism = the ability of an object to take many forms after compilation
        //dynamic means after compilation

        Scanner sc = new Scanner(System.in);
        Animal animal;


        System.out.println("What animal do you want?\n(1=Dog) or (2=Cat?)");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("Invalid Choice");
            animal.speak();
        }

    }
}
