package OOP.Fourth;

public class pizza{

    String bread;
    String sauce;
    String cheese;
    String topping;
    pizza(String bread, String cheese, String sauce, String topping){

        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = topping;

    }
    pizza(String bread, String cheese, String sauce){

        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;

    }
    pizza(String bread, String sauce){

        this.bread = bread;
        this.sauce = sauce;

    }
}