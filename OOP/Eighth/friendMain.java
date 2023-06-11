package OOP.Eighth;

public class friendMain{
    public static void main(String[] args) {
        //Static = modifier that can be applied to a variable, method or even classes
        // with this, anything in the class is owned by that class and everything in the class is shared by all instances of that class

        System.out.println(friend.number_of_friends);

        friend fr = new friend("John");
        friend fr2 = new friend("Patrick");
        System.out.println(friend.number_of_friends);
        //System.out.println(friend1.number_of_friends);

        friend.display_friends();
    }
}
