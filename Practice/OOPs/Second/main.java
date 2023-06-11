package Practice.OOPs.Second;
import java.util.*;


public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Dolla's Library");
        lib();
        String resp;
        System.out.println("Would you like to repeat the process?(Y/N) ");
        resp = sc.next().toLowerCase().trim();
        if (resp.equals("y")){
            int bok;
            System.out.println("How many books will you be altering now?");
            bok = sc.nextInt();
            System.out.println("Well then, application will automatically close after repeating " + bok + " times.");
            for (int i = 0; i < bok; i++) {
                lib();
            }
            System.out.println("Thanks for visiting.....have a nice day!");
        } else if (resp.equals("n")) {
            System.out.println("Thanks for visiting...have a nice day!");
        }
        else {
            System.out.println("Invalid response...exiting...");
        }


    }
    public static void lib(){
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            String author;
            int year;
            String response;


            System.out.println("Enter book name: ");
            name = sc.nextLine();
            System.out.println("Enter book author: ");
            author = sc.nextLine();
            System.out.println("Enter year of publication: ");
            year = sc.nextInt();

            Book book = new Book(name, author, year);

            System.out.print("Would you like to add a book or remove this book to your library? (A/R) ");
            response = sc.next().toLowerCase().trim();
            if (response.equals("a")){
                Shelf.add(book);
            } else if (response.equals("r")) {
                Shelf.remove(book);
                
            }
            else{
                System.out.println("Invalid Response");
            }
        }
    }

}
