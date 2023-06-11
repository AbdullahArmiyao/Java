package OOP.Nineth;


public class inheritance {
    public static void main(String[] args) {
        //Inheritance = is the process where one class acquires the attributes and methods of another
        //we are going to make the ride(car) and bicycle inherit everything from the vehicle class

        Ride ride = new Ride();
        Bicycle bike = new  Bicycle();

        ride.stop();
        bike.go();
        System.out.println(ride.pedals +"\t"+ ride.doors +"\t"+ ride.wheels);
        System.out.println(bike.pedals +"\t"+ bike.doors +"\t"+ bike.wheels);







    }
}
