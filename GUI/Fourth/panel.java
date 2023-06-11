package GUI.Fourth;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class panel {
    public static void main(String[] args) {
        //Panels = function as a container to hold other components
        ImageIcon img = new ImageIcon("C:\\Users\\dell\\Pictures\\Army Wallpapers\\b082fae22306f725396f6395b47bbe6b.jpg");
        Border border = BorderFactory.createLineBorder(new Color(0x123456));

        JLabel rlabel = new JLabel();
        rlabel.setText("Thus is red!");
        rlabel.setBorder(border);
        JLabel blabel = new JLabel();
        blabel.setText("Thus is red!");
        blabel.setBorder(border);
        JLabel glabel = new JLabel();
        glabel.setText("Thus is red!");
        glabel.setBorder(border);

        JPanel red_panel = new JPanel();
        red_panel.setBackground(Color.red);
        red_panel.setBounds(0, 0, 150, 150);
        red_panel.add(rlabel);
        JPanel blue_panel = new JPanel();
        blue_panel.setBackground(Color.blue);
        blue_panel.setBounds(150, 0, 150, 150);
        blue_panel.add(blabel);
        JPanel green_panel = new JPanel();
        green_panel.setBackground(Color.green);
        green_panel.setBounds(0, 150, 300, 150);
        green_panel.add(glabel);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Window 3");
        frame.setIconImage(img.getImage());
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.add(red_panel);
        frame.add(blue_panel);
        frame.add(green_panel);



    }
}
