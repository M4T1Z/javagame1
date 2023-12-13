package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame okno = new JFrame();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setResizable(false);
        okno.setTitle("Śmieciarka");

        okno.setLocationRelativeTo(null);


        Panel panel = new Panel();
        okno.add(panel);
        okno.pack();

        panel.startgameThread();


        okno.setVisible(true);

    }
}