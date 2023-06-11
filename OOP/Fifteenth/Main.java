package OOP.Fifteenth;

public class Main {
    public static void main(String[] args) {
        //Interfaces
        /*
        * Think of it as templates that can be applied to a class
        * Similar to inheritance, but specifies what a class has/must do
        * Classes can apply more than one interface unlike in inheritance which is limited to one
        * Methods in interfaces don't have a body just like abstract
         */

        Rabbit rab = new Rabbit();
        rab.flee();

        Hawk hawk = new Hawk();
        hawk.chase();

        Fish fish = new Fish();
        fish.chase();
        fish.flee();




    }
}
