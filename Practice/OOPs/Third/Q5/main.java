package Practice.OOPs.Third.Q5;

public class main {
    public static void main(String[] args) {
        Employee a = new Employee("Sanji", 1781.78);
        Manager b = new Manager("Franky", 723.37, "Engineering");
        Executive c = new Executive("Usopp", 1723.37, "Security");

        System.out.println(a.toString());
        System.out.println();
        System.out.println(b.toString());
        System.out.println();
        System.out.println(c.toString());
        System.out.println();
    }
}
