package Practice.OOPs.Third.Q5;

public class Manager extends Employee{
    private String department;
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}
