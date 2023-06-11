package Basics;

import javax.swing.JOptionPane;     //Import this for your GUI

public class third {
    public static void main(String[] args) {
        //Creating A Simple GUI
        
        String name = JOptionPane.showInputDialog("Enter Your Name");       //shows a dialogue box accepting input
        JOptionPane.showMessageDialog(null, "Hello " + name);       //..... .  ....... ... giving a message
        /*
         * For Integers it is different because, the input dialogue accepts strings so we have to convert
         * it into an integer with the code below
         */
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " feet tall");
        
        
            //Calculating the hypothenus of a triangle   
        
        double Length = Double.parseDouble(JOptionPane.showInputDialog("Enter Length"));
        double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
        double hypothenuse = Math.sqrt((Length*Length) + (Height*Height));
        JOptionPane.showMessageDialog(null, "Your hypothenuse is " + hypothenuse);
    }
}
