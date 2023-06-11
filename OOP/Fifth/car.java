package OOP.Fifth;

public class car{

    String name;
    String model;
    String color;
    int year;

    car(String name, String model, String color, int year){
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    //overriding the toString method
    //when you run this, you won't get the address but rather the stuff
    public String toString(){
        return name + "\n" + model + "\n" + color + "\n" + year;
    }




}