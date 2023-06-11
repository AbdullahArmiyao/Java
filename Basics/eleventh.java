package Basics;

public class eleventh {
    public static void main(String[] args) {
        //Arrays

        String[] cars = {"Camaro", "Corvette", "Tesla"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        cars[0] = "Cheverolet";
        System.out.println(cars[0]);

        String[] bikes = new String[3];
        bikes[0] = "Duccati";
        bikes[1] = "Yamaha";
        bikes[2] = "Kawasaki";
        System.out.println(bikes[0]);
        System.out.println(bikes[1]);
        System.out.println(bikes[2]);


        int[] numbers = {1, 3, 2, 4, 5, 6};
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);
        
        int[] number = new int[3];
        number[0] = 12;
        number[1] = 14;
        number[2] = 13;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
     
        /*
        *Using Nested Loops To Print out Arrays
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            System.out.println();
            for (int j = 0; j < bikes.length; j++) {
                System.out.println(bikes[j]);
                System.out.println();
                for (int j2 = 0; j2 < numbers.length; j2++) {
                    System.out.println(numbers[j2]);
                    System.out.println();
                    for (int k = 0; k < number.length; k++) {
                        System.out.println(number[k]);
                        System.out.println();
                    }
                }
            }
        }

        */

        //2D Arrays

        String[][] brands = new String[3][3];       //This creates 3 rows and 3 columns respectively

        brands[0][0] = "Apple" ;    //Row 0 Column 0
        brands[0][1] = "Samsung";   //Row 0 Column 1
        brands[0][2] = "Huawei";    //Row 0 Column 2

        brands[1][0] = "LG" ;    //Row 1 Column 0
        brands[1][1] = "Infinix";   //Row 1 Column 1
        brands[1][2] = "Tesla";    //Row 1 Column 2

        brands[2][0] = "Oppo" ;    //Row 2 Column 0
        brands[2][1] = "Amazon";   //Row 2 Column 1
        brands[2][2] = "Google";    //Row 2 Column 2

        //Accessing each row and column
        for (int i = 0; i < brands.length; i++) {
            System.out.println();       //so that each row is displayed on the next line
            for (int j = 0; j < brands[i].length; j++) {        //this will take the length of the first row and will continue until the last row
                System.out.print(brands[i][j] + "  ");
            }
        }





    }
}
