package OOP.Fifteenth;

public class Fish implements Prey, Predator{
    @Override
    public void chase(){
        System.out.println("The bigger fish is hunting the smaller one");
    }

    @Override
    public void flee() {
        System.out.println("The smaller fish is evading the bigger one");
    }
}
