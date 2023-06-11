package OOP.Sixteenth;

public class Main {
    public static void main(String[] args) {
        //Polymorphism
        /*
        * Ability of a class of an object to identify as more than
        * one type
        */

        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();


        Vehicle[] racers = new Vehicle[3];
        racers[0] = car;
        racers[1] = bike;
        racers[2] = boat;

        //This works but there is an easier way
        car.go();
        bike.go();
        boat.go();

        System.out.println();

        //Use enhanced for loop
        for (Vehicle x: racers) {
            x.go();
            //for each(X) vehicle in racers
        }

    }
}
