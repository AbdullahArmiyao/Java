package OOP.Tenth;

public abstract class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return name + "\n" + age + "\n";
    }

}
