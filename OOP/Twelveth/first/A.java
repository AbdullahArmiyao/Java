package OOP.Twelveth.first;
import OOP.Twelveth.second.*;

public class A{

  //  protected String defMess3 = "This is the protected modifier";        //Protected


    public static void main(String[] args) {
        //Access modifiers
        /*
         * public = can be accessed by all classes and packages in the project folder
         * private = only visible to the class it contains itself
         * protected = can be accessed by different classes in different packages as long as that class is a subclass of that class
         * no modifier = can be accessed by only files in the same package
         */

        C c = new C();
        //B b = new B();

       // System.out.println(c.defMess);    //Reason why it didn't work is because the access modifier for defMess was none, and also they are in different packages
       System.out.println(c.defMess2);    //Reason why it works is because it has been made public and so all classes outside its package but in the project folder can access it
       //System.out.println(b.defMess4);    //Reason why it works not is because it has been made private and so no other package or class can access it


    }
}
