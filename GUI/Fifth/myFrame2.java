package GUI.Fifth;

import GUI.Second.myFrame;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame2 extends myFrame implements ActionListener {

    JButton button = new JButton();     //Make this a global variable
    ImageIcon ic = new ImageIcon("C:\\Users\\dell\\Pictures\\Comic Wallpapers\\93cd16e5dcc6b6786dec922b82363cf4.jpg");
    Border bd = BorderFactory.createEtchedBorder();

    JLabel lb;


    myFrame2(){
        this.setLayout(null);
        this.setSize(500, 500);

        lb = new JLabel();
        lb.setIcon(ic);
        lb.setBounds(120, 120, 130, 130);
        lb.setVisible(false);

        button.setBounds(150, 200, 100, 50);
        button.setText("Click Me!");
        button.setFocusable(false);     //to get rid of the text border
     //   button.setIcon(ic);
       // button.setEnabled(false);       //to disable a button
        button.addActionListener(this);     //to include the event or button function
        button.setBorder(bd);
        this.add(button);
        this.add(lb);
    }

    //This is basically made to give the button a function
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Heyy!");
            // button.setEnabled(false);       //to disable a button once, place it in this method
            lb.setVisible(true);            //to make a label visible on click
        }
    }
}
