package OOP.First;
import  java.util.*;
import java.io.*;

public class carMain{
    public static void main(String[] args) {
        //Object-Oriented Programming
        /*
        *
        * object = instance of a class that may contain attributes and methods
        * think of attributes as the characteristics of the object
        * and methods as the functions it can perform
        */

        //Using The Car Class
        Car myCar = new Car();

        //displaying an attribute
        System.out.println(myCar.name);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        System.out.println(myCar.color);

        //displaying a method
        myCar.drive();
        myCar.brake();

    }
}

