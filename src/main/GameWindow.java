package main;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public JFrame okno;
    public Panel panel;

//wyświetlanie okna aplikacji
    public GameWindow() {
        okno = new JFrame();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.setResizable(false);
        okno.setTitle("Śmieciarka");

        okno.setLocationRelativeTo(null);

        panel = new Panel(this);
        okno.add(panel);

        okno.setUndecorated(true);
        okno.setLocation((screenSize.width- panel.szerokosc)/2, (screenSize.height- panel.wysokosc)/2);
        okno.pack();

        panel.setupObject();
        panel.startgameThread();


        okno.setVisible(true);
    }
}

