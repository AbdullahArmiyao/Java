package OOP.Seventh;

public class garageMain {
    public static void main(String[] args) {
        //Passing objects as arguments

        garage gar= new garage();

        cars car = new cars("BMW");
        cars car2 = new cars("Vibe");
        cars car3 = new cars("Benz");

        bikes bike = new bikes("Kawasaki");
        bikes bike2 = new bikes("Duccati");
        bikes bike3 = new bikes("Boxer");

        //calling the park method
        gar.park(car);
        gar.park(car2);
        gar.park(car3);
        System.out.println();
        gar.park(bike3);
        gar.park(bike2);
        gar.park(bike);

    }
}
