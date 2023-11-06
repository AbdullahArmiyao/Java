package Practice.OOPs.Third.Q2;
import  java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //import the scanner class to take input...this applies to  test case 3 only
        Scanner sc = new Scanner(System.in);

        //use the "new" keyword to instantiate the Student class and enter the respective details
        Student newGuy = new Student("John", 100, 10);

        //Below are different test cases

        System.out.println(newGuy.getName());
        System.out.println();

        System.out.println(newGuy.getTotalScore());
        System.out.println(newGuy.getAverageScore());

        System.out.println();

        newGuy.addQuiz(20);
        System.out.println(newGuy.getTotalScore());
        System.out.println(newGuy.getAverageScore());
        System.out.println();

        Student newGuy2 = new Student("Mike", 790.65, 5);


        System.out.println(newGuy2.getName());
        System.out.println();

        System.out.println(newGuy2.getTotalScore());
        System.out.println(newGuy2.getAverageScore());

        System.out.println();

        newGuy2.addQuiz(-69);
        System.out.println(newGuy2.getTotalScore());
        System.out.println(newGuy2.getAverageScore());

        //Taking user input to test the cases

        System.out.print("Enter Student name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student score: ");
        double score = sc.nextDouble();
        System.out.print("Enter Student total quizzes: ");
        double quizzes = sc.nextDouble();
        double newScore;

        Student newGuy3 = new Student(name, score, quizzes);


        System.out.println(newGuy3.getName());
        System.out.println();

        System.out.println(newGuy3.getTotalScore());
        System.out.println(newGuy3.getAverageScore());

        System.out.println();

        System.out.println("Do you wish to add a new quiz score?\nYes-1\tNo-2");
        int response = sc.nextInt();
        if (response == 1) {
            System.out.print("Enter new score: ");
            newScore = sc.nextDouble();
            newGuy3.addQuiz(newScore);
            System.out.println(newGuy3.getTotalScore());
            System.out.println(newGuy3.getAverageScore());
        }else{
            System.out.println("Alright, have a wonderful day!");
        }
    }
}
