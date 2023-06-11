package Practice.OOPs.First;

import java.util.*;

public class calcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();

        //Welcome
        System.out.println("Hello, Welcome to CalculatorX...What would you like to do?");
        System.out.println("1. Area\n2. Volume");
        int choose = sc.nextInt();
        System.out.println();
        //Declaration
        double len = 0;
        double hig = 0;
        double wid = 0;
        double rad = 0;
        double num = 0;

        //Linking To Corresponding Constructors
        //calc a = new calc(len, wid, hig, rad);
        calc b = new calc(len, wid);
        calc c = new calc(rad);
        calc d = new calc(rad, hig, num);
        calc e = new calc(len, wid, hig, num);
        calc f = new calc(rad, hig, 0, 0, 0);
        calc g = new calc(rad, 0, 0, 0, 0 ,0);

        if (choose == 1) {
            System.out.println("1. Area of Square or Rectangle\n2. Area Of Circle\n3. Area of Cylinder");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Length: ");
                    len = sc.nextInt();
                    System.out.println("Enter Width: ");
                    wid = sc.nextInt();
                    System.out.println("The area of your quadrilateral is " + b.area_of_quadrilateral(len, wid));
                    break;
                case 2:
                    System.out.println("Enter Radius: ");
                    rad = sc.nextInt();
                    System.out.println("The are of your circle is " + c.circle_area(rad));
                    break;
                case 3:
                    System.out.println("Enter Radius: ");
                    rad = sc.nextInt();
                    System.out.println("Enter Height: ");
                    hig = sc.nextInt();
                    System.out.println("The area of your cylinder is " + d.cylinder_area(rad, hig));
                    break;
                default:
                    System.out.println("Error");
            }


        }
        else if (choose == 2) {
            System.out.println("1. Volume of Square or Rectangle\n2. Volume Of Sphere\n3. Volume of Cylinder");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Length: ");
                    len = sc.nextInt();
                    System.out.println("Enter Width: ");
                    wid = sc.nextInt();
                    System.out.println("Enter Height: ");
                    hig = sc.nextInt();
                    System.out.println("The volume of your quadrilateral is " + e.volume_of_quadrilateral(len, wid, hig));
                    break;
                case 2:
                    System.out.println("Enter Radius: ");
                    rad = sc.nextInt();

                    System.out.println("The volume of your sphere is " + g.volume_of_sphere(rad));
                    break;
                case 3:
                    System.out.println("Enter Radius: ");
                    rad = sc.nextInt();
                    System.out.println("Enter Height: ");
                    hig = sc.nextInt();
                    System.out.println("The volume of your cylinder is " + f.cylinder_volume(rad, hig));

                    break;
                default:
                    System.out.println("Error");

            }
        } else {
            System.out.println("Invalid Choice");
        }
    }
}