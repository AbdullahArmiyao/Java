package Practice.OOPs.Second;
import java.util.ArrayList;

public class Shelf {

   

    static void add(Book book){

        ArrayList<String> history = new ArrayList<>();
        ArrayList<String> Modern = new ArrayList<>();

        System.out.println(book.name + " published by " + book.author + " has been added to the shelf");
        if (book.year > 1900){
            System.out.println(book.name + " is in the Modern category");
            Modern.add(book.name);
            System.out.println(Modern);
        }
        else if(book.year <= 1899){
            System.out.println(book.name + " is in the Classic History category");
            history.add(book.name);
            System.out.println(history);
        }
    }
    static void remove(Book book){
        System.out.println(book.name + " published by " + book.author + " has been removed from the shelf");
        if (book.year > 1900){
            System.out.println(book.name + "was removed from the Modern category");
        }
        else if(book.year <= 1899){
            System.out.println(book.name + " was removed from the Classic History category");
        }
    }
}
