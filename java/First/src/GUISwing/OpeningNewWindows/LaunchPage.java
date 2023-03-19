package GUISwing.OpeningNewWindows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Open");

    LaunchPage(){

        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            frame.dispose(); // <-- replaces the window instead of creating new ones when opening new windows
            NewWindow myWindow = new NewWindow();
        }

    }

}
