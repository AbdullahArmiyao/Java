package Practice.OOPs.Third.Q4;

public class main {
    public static void main(String[] args) {
        Person a = new Person("Aaron", 21);
        Student b = new Student("Jeff", 18, "IT");
        Instructor c = new Instructor("Barry", 32, 100);

        System.out.println(a.getName()+ "\t" + a.getYear());
        System.out.println(b.getName()+ "\t" + b.getYear() + "\t" + b.getMajor());
        System.out.println(c.getName()+ "\t" + b.getYear() + "\t" + c.getSalary());
    }
}
