package OOP.Eleventh;

public class Main{
    public static void main(String[] args) {
        // Abstract Classes = cannot be instantiated but can have subclasses that can be

        //Vehicle vehicle = new Vehicle();      //When you use the abstract on the vehicle, you cannot use this line
        Car car = new Car();

        //When you use it on methods, you can not define the method in that class unless you override it in its
        //subclass
        car.go();

    }
}
