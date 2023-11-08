package Practice.OOPs.Third.Q4;

public class Student extends Person{
    public String Major;
    public Student(String name, int year, String Major) {
        super(name, year);
        this.Major = Major;
    }

    public String getMajor() {
        return Major;
    }
}
