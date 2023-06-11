package OOP.Nineth;

public class Ride extends Vehicle{
    int wheels = 4;
    boolean doors = true;
    boolean pedals = false;

    @Override
    void stop(){
        System.out.println("The car has stopped");
    }

}
