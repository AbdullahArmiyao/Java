package Practice.OOPs.Third.Q4;

public class Instructor extends Person{
    public double Salary;
    public Instructor(String name, int year, double Salary){
        super(name, year);
        this.Salary = Salary;
    }

    public double getSalary() {
        return Salary;
    }
}
