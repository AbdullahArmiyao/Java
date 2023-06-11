package OOP.Third;

import java.util.Random;

public class dice{
    //This declaration makes it a global variable therefore
    //we wouldn't have to enter any values in the roll method parenthesis
    Random rand;
    int number;


    //Constructor for the class
    dice(){

        /*Random*/ rand = new Random();    //with this random is commented out because it is a global variable
        /*int*/ number = 0;     //same for int
        roll(/*rand, number*/);//If you had made them local variables, the brackets would be filled with the commented values
    }

    //Method to role dice
    void roll(/*Random rand, int number*/){
        //If you had made them local variables of the constructor, the brackets would be filled with the commented values
        number = rand.nextInt(6) + 1;
        System.out.println(number);

    }
}