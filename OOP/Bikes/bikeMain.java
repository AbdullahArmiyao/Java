package OOP.Bikes;


public class bikeMain{
    public static void main(String[] args) {

        // Constructors = special methods that are called when an object is created
        bike a = new bike("Kawasaki", "Ninja", "Blue", 2029, 5000.00);
        bike b = new bike("Duccatti", "D077", "Black", 2039, 5000.00);

        System.out.println(a.name);
        System.out.println(b.model);

        a.ride();
        b.style();

    }
}