package Practice;
import java.util.*;

public class arrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Items? ");
        int a = sc.nextInt();
        int[] numbers = new int[a];

        for (int i = 0; i<numbers.length; i++) {
            int b = sc.nextInt();
            numbers[i] = b;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.print("How many names? ");
        int c = sc.nextInt();
        String[] names = new String[c];

        for (int j = 0; j<names.length; j++) {
            String d = sc.next();
            names[j] = d;
        }
        System.out.println(Arrays.toString(names));
    }
}