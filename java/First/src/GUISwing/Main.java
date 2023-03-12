package GUISwing;

import java.awt.Color;
import java.awt.Font;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon(Main.class.getResource("../GUISwing/images/black.jpg"));
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 3);

        JLabel text = new JLabel();
        text.setText("This cat is black :D");
        text.setIcon(image);
        text.setHorizontalTextPosition(JLabel.CENTER); //Set text, left, center, right of imageicon
        text.setVerticalTextPosition(JLabel.TOP); //set text to top or bottom of imageicon
        // text.setForeground(Color.ORANGE);
        text.setForeground(new Color(83, 118, 176));
        text.setFont(new Font("Century Gothic", Font.BOLD, 50)); // SET FONT TEXT, COLOR, SIZE
        text.setIconTextGap(-25);//set gap to text image
        text.setBackground(Color.BLACK);
        text.setOpaque(true);// display background color
        text.setBorder(border);
        text.setVerticalAlignment(JLabel.CENTER);//sets vertical positioning of the icon+text within label
        text.setHorizontalAlignment(JLabel.CENTER); //sets horizontal position of icon + text within label
        // text.setBounds(0, 0, 500, 250); //sets x and y position within frame as well as its dimensions

        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.add(text);

        frame.pack(); //add all the necessary components first before adding .pack method. comment out setsize + setlayout + setbounds to see its purpose.


    }
}
