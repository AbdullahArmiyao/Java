package GUI.Second;

import javax.swing.*;
import java.awt.*;


public class secondGui {
    public static void main(String[] args) {

        //JFrame = a GUI window to add components to....it is just a window frame
        // this is one way of creating a window
        //th other method is creating another class and making it inherit JFrame



        JFrame frame = new JFrame();        //to create the frame
        /*
        frame.setTitle("My Window");         //Setting the title for the window
        frame.setSize(600,600);       //sets width and height
        frame.setVisible(true);     //to make the frame visible

        //When you click the exit button, it doesn't really close so use the code below to actually close the window
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    //this is the default which is why it hides and not exits
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //to exit

        //to prevent the window from being resized
        //frame.setResizable(false);

        //to create an image icon
        ImageIcon image = new ImageIcon("C:\\Users\\dell\\Pictures\\Anime Wallpapers\\540c3945a5a164246a59f32251c5d166.jpg");
        frame.setIconImage(image.getImage());       //to change window icon

        //to change the background color
        frame.getContentPane().setBackground(Color.black);
        //frame.getContentPane().setBackground(new Color(0,0,0));      //to set a custom color in rgb
        //frame.getContentPane().setBackground(new Color(0x123456));      //to set a custom color in hex
        */
        myFrame mine = new myFrame();
        //new myFrame();        //if you have no need to make changes to the frame use this line
    }
}
