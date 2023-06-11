package GUI.Third;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class labels {
    public static void main(String[] args) {

        //labels = a GUI area for a string of text, image or both
        ImageIcon img = new ImageIcon("C:\\\\Users\\\\dell\\\\Pictures\\\\Anime Wallpapers\\\\540c3945a5a164246a59f32251c5d166.jpg");
        Border border = BorderFactory.createLineBorder(new Color(218, 165, 32));

        //To create the label
        JLabel label = new JLabel();

        //setting a text
        label.setText("What's good my man? ");
        //setting an image
        label.setIcon(img);
        // Note that the java swing library automatically moves labels to the center left,
        // and it moves the text to the right side of the image
        // well the text can be moved relative to the image
        label.setHorizontalTextPosition(JLabel.CENTER);     //you can set it left, center or right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);      //top, center, bottom of image icon
        label.setForeground(new Color(218, 165, 32));        //set font color
        label.setFont(new Font("Mv Boli", Font.ITALIC,20));     //set font style and size
        label.setIconTextGap(20);   //setting the gap between the text and image
        label.setBackground(new Color(0, 0, 0));
        label.setOpaque(true);      //Display Background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);      //set vertical position of icon + text to center
        label.setHorizontalAlignment(JLabel.CENTER);      //set horizontal position of icon + text to center
        //to set the bounds of the label so it can appear after setting layout to null
       // label.setBounds(40,60,600,600);





        //myFrame mine = new myFrame();
        JFrame mine = new JFrame();
        mine.setVisible(true);
        mine.setSize(1000,1000);
        mine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mine.setTitle("Window 2");
        mine.setIconImage(img.getImage());
        mine.getContentPane().setBackground(new Color(0x123456));
        //mine.setLayout(null);       //setting the layout manager to null so the label does not take all the space

        //to add the label to the frame
        mine.add(label);
        //mine.pack();        //resizes the size of frame to accommodate components













    }
}
