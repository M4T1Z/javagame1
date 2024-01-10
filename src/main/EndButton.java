package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndButton extends JButton {

    public EndButton(String text){
        setText(text);
        setBounds(350,400,300,100);
        setPreferredSize(new Dimension(300,50));
        setBackground(Color.white);
        this.setFocusable(false);
        addActionListener (new B1());
        setVisible(true);
    }

    //koniec gry po wciśnięciu
    private class B1 implements ActionListener{
        public void actionPerformed (ActionEvent a) {
            System.exit(0);
        }
    }


}