package GUI.Second;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    public myFrame(){
        this.setTitle("My Window");         //Setting the title for the window
        this.setSize(600,600);       //sets width and height
        this.setVisible(true);     //to make the frame visible

        //When you click the exit button, it doesn't really close so use the code below to actually close the window
        //this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    //this is the default which is why it hides and not exits
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //to exit

        //to prevent the window from being resized
        //this.setResizable(false);

        //to create an image icon
        ImageIcon image = new ImageIcon("C:\\Users\\dell\\Pictures\\Anime Wallpapers\\540c3945a5a164246a59f32251c5d166.jpg");
        this.setIconImage(image.getImage());       //to change window icon

        //to change the background color
        this.getContentPane().setBackground(Color.black);
        //this.getContentPane().setBackground(new Color(0,0,0));      //to set a custom color in rgb
        //this.getContentPane().setBackground(new Color(0x123456));      //to set a custom color in hex
    }
}
