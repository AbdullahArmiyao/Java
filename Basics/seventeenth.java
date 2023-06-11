package Basics;

public class seventeenth{
    public static void main(String[] args) {
        //methods....are like functions
        /*
         * you can not make a static reference to a non-static method
         * therefore precede the method with static
         *
         * In order to pass arguments into the method, declare the matching data type as a parameter in the method
         * when you call the method, enter your desired argument
         *
         * Overloaded Methods share the same name but different parameters
         * they are accepted
         *
         */
        bello();
        String name = "Bro";
        hello(name);
        int age = 21;
        yello(name, age);


        //Return Types
        int x = 24;
        int y = 23;
        int z = sum(x, y);
        System.out.println(z);

        //Overloaded Method
        int f = 20;
        System.out.println(sum(x, y, f));
    }

    static void bello(){
        System.out.println("Bello");
    }
    static void hello(String name){
        System.out.println("Hello " + name);
    }
    static void yello(String name, int age){
        System.out.println("Yello " + name + ", " + age);
    }
    static int sum(int x, int y){
        //normally we use void if you are not returning anything
        //but if you are returning a value, make sure to use the data type
        int z;
        z = x + y;
        return z;
    }

    static int sum(int x, int y, int f){
        //Overloaded Method
        int w;
        w = x + y +f;
        return w;
    }

}