package GUISwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {

        // JFrame frame = new JFrame(); //creates frame
        // frame.setTitle("Jframe title goes here."); //sets frame title
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// EXIT OUT OF APPLICATION
        // frame.setResizable(false);//prevents frame from being resized
        // frame.setSize(420, 420); //sets x and y dimens
        // frame.setVisible(true); //makes frame visible

        // ImageIcon Image = new ImageIcon("nito.jpg"); //creates image icon
        // frame.setIconImage(Image.getImage()); //sets image icon
        // frame.getContentPane().setBackground(new Color(0x123444)); //change color background

        ImageIcon image = new ImageIcon("favicon.ico");

        JLabel label = new JLabel();
        label.setText("this is the lable.settext");

        label.setIcon(image);

        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);


    }
}
