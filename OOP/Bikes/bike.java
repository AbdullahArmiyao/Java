package OOP.Bikes;

public class bike{
    //creating attributes
    String name;
    String model;
    String color;
    int year;
    double price;

    //Creating a constructor within a class...reason why we can create different objects of the same class
    bike(String name, String model, String color, int year, double price){
        //Assigning the values of the constructor to the variables
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        // The " this" keyword is used to replace the object name

    }

    //creating methods to access attributes from within the class
    void ride(){
        System.out.println(this.name + " is fast, especially the " + this.model);
    }
    void style(){
        System.out.println(this.name + " is more of a fancy one...especially it's model, " + this.model);
    }

}