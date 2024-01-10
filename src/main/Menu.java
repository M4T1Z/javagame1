package main;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {

    public Panel panel;

//wyswietlanie menu
    public Menu(Panel panel) {
        super();
        this.panel = panel;
        setLayout(null);
        setBackground(Color.black);

        initText();
        initButtons();
    }
//ustawienie menu - przyciski i tekst
    public void initButtons(){
        ReturnButton ret = new ReturnButton("Powrót");
        ret.setFont(new Font("Arial", Font.BOLD, 45));
        add(ret);

        EndButton end = new EndButton("Koniec gry");
        end.setFont(new Font("Arial", Font.BOLD, 45));
        add(end);

    }

    public void initText(){
        JLabel jl = new JLabel("PAUZA");
        jl.setFont(new Font("Arial", Font.BOLD, 80));
        jl.setForeground(Color.white);
        jl.setBounds(370,30,1024,100);

        add(jl);
    }
}
