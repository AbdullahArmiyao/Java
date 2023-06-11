package GUI.Test;


import GUI.Second.myFrame;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class myTelegram {
    public static void main(String[] args) {

        Border bd = BorderFactory.createLineBorder(Color.BLUE.darker());



        JPanel pan1 = new JPanel();
        pan1.setBackground(new Color(0x222D5A).darker());
        pan1.setBounds(0, 0, 300, 700);
        pan1.setBorder(bd);


        myFrame mine = new myFrame();
        mine.setSize(1000,700);
        mine.setTitle("CONNECT");
        mine.setLayout(null);
        mine.getContentPane().setBackground(new Color(0x222D5A).darker().darker());
        mine.add(pan1);
        mine.setResizable(false);
    }
}
