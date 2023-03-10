package GUISwing;
import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelPrac {

    public static void main(String[] args) {

        // JPANEL = GUI COMPONENT THAT FUNCTIOS AS A CONTAINER TO HOLD OTHER COMPONENTS

        ImageIcon icon = new ImageIcon(Main.class.getResource("../GUISwing/images/idk.png"));

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(icon);
        // label.setVerticalAlignment(JLabel.BOTTOM); not used when using null layoutmngr
        // label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 50, 250 , 250); //if layout is null set bounds

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.cyan);
        cyanPanel.setBounds(0, 250, 500, 250);
        cyanPanel.setLayout(null);

        JFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setVisible(true);

        // redPanel.add(label);
        // bluePanel.add(label);
        cyanPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(cyanPanel);

    }
    
}
