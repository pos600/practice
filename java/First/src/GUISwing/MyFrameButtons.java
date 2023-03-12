package GUISwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameButtons extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrameButtons(){

        ImageIcon icon = new ImageIcon(Main.class.getResource("../GUISwing/images/smol.png"));
        ImageIcon icon2 = new ImageIcon(Main.class.getResource("../GUISwing/images/flower.png"));

        button = new JButton();
        button.setBounds(125, 125, 250, 100);
        button.addActionListener(this); //try lambda expression e ->
        button.setText("Button 1");
        button.setFocusable(false); //removes letter borders
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-10);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false); //disables a button

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false); //TOGGLE AT ONCLICK TO SHOW (SET TO TRUE)

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){

            // System.out.println("poo");
            // button.setEnabled(false); //enables the button to only be clicked once

            label.setVisible(true);

        }

    }
    
}
