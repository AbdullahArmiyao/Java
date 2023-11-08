package Practice.OOPs.Third.Q5;

public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSalary: " + salary;
    }
}
