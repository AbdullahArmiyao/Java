package OOP.Fifth;



public class carMain{
    public static void main(String[] args) {
        //toString Method


        car a = new car("Chevrolet", "Camaro", "Blue", 2021);

        System.out.println();
        System.out.println(a.name);
        System.out.println(a.model);
        System.out.println(a.color);
        System.out.println(a.year);

        System.out.println();

        System.out.println(a);      //this prints out the address of the object

        //but after overriding the toString method, the line above will work just fine

        //this is where toString comes in
        System.out.println();
        System.out.println(a.toString());

    }
}