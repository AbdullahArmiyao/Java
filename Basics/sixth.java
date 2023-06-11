package Basics;

public class sixth {
    public static void main(String[] args) {
        //If Statements  And  Switches

        int age = 18;
        if (age<18) {
            System.out.println("You are young");
        } 
        else if(age==18){
            System.out.println("You hit the mark");
        }
        else{
            System.out.println("You are old");
        }

        String day = "Wednesday";
        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tueday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
        
            default:
                System.out.println("Just an unknown day");
                break;
        }
    }
}
