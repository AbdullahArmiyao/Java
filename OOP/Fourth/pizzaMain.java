package OOP.Fourth;

public class pizzaMain{
    public static void main(String[] args) {
        //Using Overloaded Constructors

        //Original Pizza Items
        pizza pizza = new pizza("Tea Bread","Blue Band", "Tomato", "Pepperoni");
        //Another constructor with same names but different parameters (overloaded constructor)
        //In this case we took off the topping from the constructor's parameters
        pizza pizza2 = new pizza("Tea Bread","Blue Band", "Tomato");
        //Vegan pizza delivery
        pizza pizza3 = new pizza("Tea Bread", "Tomato");

        System.out.println();

        System.out.println("Here are the ingredients for your pizza delivery: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);

        System.out.println();

        System.out.println("Here are the ingredients for your 2nd pizza delivery: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);

        System.out.println();

        System.out.println("Here are the ingredients for your 3rd pizza delivery: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);

        System.out.println();






    }
}