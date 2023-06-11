package OOP.Seventh;

public class garage {
    //We will be parking some cars in this garage

    //In this case the data type is string but since we want to pass in our car to the garage, the
    //parameter will be car,  just like String...Strings are also objects
    void park(cars car){
        System.out.println("The " + car.name + " is packed in the garage");
    }
    void park(bikes bikes){
        System.out.println("The " + bikes.name + " is packed in the garage");
    }
}
