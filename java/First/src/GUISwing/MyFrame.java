package GUISwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("Jframe title goes here."); //sets this title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// EXIT OUT OF APPLICATION
        this.setResizable(false);//prevents this from being resized
        this.setSize(420, 420); //sets x and y dimens
        this.setVisible(true); //makes this visible

        ImageIcon Image = new ImageIcon("C:/Users/kuroa/Desktop/practice/java/First/src/GUISwing/nito.jpg"); //creates image icon
        this.setIconImage(Image.getImage()); //sets image icon
        this.getContentPane().setBackground(new Color(0x123444)); //change color background
    }
    
}
