package Practice.OOPs.Third.Q2;
/**
 * Just like question 1, think of the student class as an actual student
 * The student must have a name, total score and total number of quizzes he or she took
 *
 * We must be able to derive the student name, scores, and average as well as add a new score to his records
 * That is where the respective functions come in
 */
public class Student {
    private String name;    //Student must have a name
    private double totalScore;  //Student must have a total score
    private double totalQuiz;   //Student must have a total number of quizzes taken

    //Create the student constructor to initialize the student object
    public Student(String name, double totalScore, double totalQuiz){
        this.name = name;   //user input at position name sets the name variable to the user name
        this.totalScore = totalScore;   //same thing happens here
        this.totalQuiz = totalQuiz; //and here
    }

    //function to get or obtain the student name
    public String getName() {
        return name;
    }

    //function to add scores of a new quiz
    public void addQuiz(double score){
        totalScore += score;
    }

    //function to acquire the total score of the student
    public double getTotalScore() {
        return totalScore;
    }

    //function to get the average of the student's score
    public double getAverageScore(){
        double average = totalScore / totalQuiz;
        return average;
    }
}
