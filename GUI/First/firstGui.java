package GUI.First;

//Package for Gui
import javax.swing.*;


public class firstGui {
    public static void main(String[] args) {
        //Using the JOptionPane
        //Using input dialog box
        String name = JOptionPane.showInputDialog("Enter your name: ");
        //To Show a message
        JOptionPane.showMessageDialog(null, "Hello " + name);

        //The pane returns String Values so to store and return int values, use th code below
        var age =  Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        var height =  Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
}
