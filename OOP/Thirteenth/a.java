package OOP.Thirteenth;

public class a{
    public static void main(String[] args) {
        //Encapsulation = attributes of a class will be hidden or private
        //                can be accessed only through methods (getters and starters)
        //                You should make attributes private if you have no reason to make them public or protected


        b car = new b("Lambo", "Skrr", 2099);

        System.out.println(car.toString());
        //System.out.println(car.make);       //won't work because make is private

        //To access the individual members, we can use getters....check the b class
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        //we can also use setter....check the b class
        car.setYear(2049);
        System.out.println(car.toString());




    }
}
