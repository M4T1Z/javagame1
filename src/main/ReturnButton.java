package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReturnButton extends JButton {

    public ReturnButton(String text){
        setText(text);
        setBounds(350,250,300,100);
        setPreferredSize(new Dimension(300,50));
        setBackground(Color.white);
        this.setFocusable(false);
        addActionListener (new B1());
        setVisible(true);
    }

    //kończy grę po zatwierdzeniu
    private class B1 implements ActionListener{
        public void actionPerformed (ActionEvent a) {
            GameState.state = GameState.PLAY;
        }
    }


}
