package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame okno = new JFrame();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setResizable(false);
        okno.setTitle("Śmieciarka");

        okno.setLocationRelativeTo(null);


        Panel panel = new Panel();
        okno.add(panel);
        okno.setLocation((screenSize.width - panel.szerokosc)/2,(screenSize.height - panel.wysokosc)/2);
        okno.pack();

        panel.setupObject();
        panel.startgameThread();


        okno.setVisible(true);

    }
}