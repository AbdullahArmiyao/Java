package OOP.Fourteenth;

public class Main {
    public static void main(String[] args) {
        //Copying Objects

        Car car1 = new Car("Ford","Mustang",1990);
        Car car2 = new Car("Chevrolet","Camaro", 2000);
        Car car3 = new Car(car2);       //another way to copy objects
        
        //car2 = car1;      //never do this to copy objects
        //to copy
        car2.copy(car1);
        
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());


    }
}
