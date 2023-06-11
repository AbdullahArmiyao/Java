package Basics;

public class first {        //class name has to be the same as file name
    public static void main(String[] args) {
        //When you use print, everything is printed on the same line
        System.out.print("\nHello World!");
        System.out.print("My First Java Code..Feels Great!!\n");
        
        //When you use println, they are printed on individual lines
        System.out.println("\nHello World!");
        System.out.println("My First Java Code..Feels Great!!\n");
        
        //Using Escape Sequences
        /*
         * Just like C++, go review your note on how to use them
         * \t = tab
         * \n = new line
         * \"  \" = quote
         * \\ = back slash 
         */        
        
        
        
        //Variables
        
         //Int
        int y;               //declaration 
        y = 20;              //assignment
        int x = 30;          //initialization
        
        System.out.println("The value of int X is: " + x);
        System.out.println("Y is " + y);
        System.out.println( );
        
        //Long
        long w = 427463876736498378L;
        //note that the value of long ends with an L
        System.out.println("The value of long W is: " + w);
        System.out.println( );
        
        //float
        float a = 4.13f;
        //note that the value of float ends with an f
        System.out.println("The value of float A is: " + a);
        System.out.println( );
    
        //double
        double b = 4.13222222;
        //note that the value of double ends with nothing
        System.out.println("The value of double B is: " + b);
        System.out.println( );
        
        //boolean
        boolean t = true;
        boolean z = false;
        System.out.println("The value of boolean T is: " + t);
        System.out.println("The value of boolean Z is: " + z);
        System.out.println( );
        
        //char
        char symbol = '@';
        System.out.println("The value of char Symbol is: " + symbol);
        System.out.println( );
        
        //string
        String name = "Abdullah";
        System.out.println("My Name is " + name);
        System.out.println();

        //Var
        var namee = "Joe";
        var age = 15;
        var height = 15.88;
        var what = true;
        var cha = '$';
        // Var can hold any data type
        System.out.println("The Name is " + namee + "\nThe age is " + age );
        System.out.println("The height is " + height + "\nThe character is " + cha );
        System.out.println("The fact is " + what);
        System.out.println( );




        //Swapping Varables
        int e = 15;
        int u = 20;
        int temp;
        System.out.println("E = " + e);
        System.out.println("U = " +u);
        temp = e;
        e = u;
        u = temp;
        System.out.println("E = " +e);
        System.out.println("U = " +u);
        System.out.println( );
        
    }   
//Note that System.out.print is the same as std::cout or cout when using namespace std
//also the same as printf("") in C and print("") in Python
//Just like C and C++, don't forget ;
}