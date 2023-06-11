package OOP.Eighth;

public class friend{

    String name;
    //Applying to variable
    static int number_of_friends;
    friend(String name){
        this.name = name;
        number_of_friends++;
    }

    static void display_friends(){
        System.out.println("You have " + number_of_friends + " friends");
    }



}
