package Practice;

public class SubArray{
    public static void main(String[] args) {
        

         //Creating a sub array of an array A

         int[] numbers = new int[6];
         numbers[0] = 1;
         numbers[1] = 2;
         numbers[2] = 3;
         numbers[3] = 4;
         numbers[4] = 5;
         numbers[5] = 6;
         for(int i = 0; i < numbers.length; i+=2){
            System.out.println("[" + numbers[i] + ", " + numbers[i+1] + "]");
         }




    }
}
