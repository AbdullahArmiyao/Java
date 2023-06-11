package Basics;

public class seventh {
    public static void main(String[] args) {
        //Logical Operators

        int temp = 25;
        if(temp>30){
            System.out.println("It is hot!");
        } 
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm");
        }
        else{
            System.out.println("It is cold");
        }
        
        String color = "black";
        if(color=="red"){
            System.out.println("It is hers!");
        } 
        else if(color=="black" || color=="blue"){
            System.out.println("It is Mine");
        }
        else{
            System.out.println("It is his");
        }
        
        int tem = 25;
        if(tem!=30){
            System.out.println("It is an anomality");
        } 
        else{
            System.out.println("It is normal");
        }
    }    
}
