package main;

import entity.player;

import javax.swing.*;
import java.awt.*;

public class TaskManager extends JPanel {
    public int errors = 0;
    public int error_time = 0;
    public Panel panel;
    public player player;
    public JButton bin1, bin2, bin3, bin4;
    public TaskButtonHandler taskButtonHandler;
    public  JLabel background;

    public TaskManager(Panel panel, player player) {
        super();
        this.panel = panel;
        this.player = player;
        setLayout(null);
        setBackground(Color.cyan);

        taskButtonHandler = new TaskButtonHandler(this.panel, this.player);


        initButtons();
        background = new JLabel();
        background.setBounds(0,0,1024,768);
        background.setIcon(new ImageIcon("src/objects/panel4.png"));
        add(background);
    }
//ustawienia panelu z pojemnikami
    public void initButtons(){
        bin1 = new JButton("Paper");
        bin1.setFont(new Font("Arial", Font.BOLD, 10));
        bin1.setBounds(483,213,212,287);
        bin1.setMargin(new Insets(0, 17, 0, 0));
        bin1.setIcon(new ImageIcon("src/objects/niebieski.png"));

        bin2 = new JButton("Plastic");
        bin2.setFont(new Font("Arial", Font.BOLD, 10));
        bin2.setBounds(50, 213, 211, 287);
        bin2.setMargin(new Insets(0, 17, 0, 0));
        bin2.setIcon(new ImageIcon("src/objects/zółty.png"));

        bin3 = new JButton("Glass");
        bin3.setFont(new Font("Arial", Font.BOLD, 10));
        bin3.setBounds(695, 213, 216, 287);
        bin3.setMargin(new Insets(0, 17, 0, 0));
        bin3.setIcon(new ImageIcon("src/objects/zielony.png"));

        bin4 = new JButton("Mixed");
        bin4.setFont(new Font("Arial", Font.BOLD, 10));
        bin4.setBounds(261, 213, 222, 287);
        bin4.setMargin(new Insets(0, 17, 0, 0));
        bin4.setIcon(new ImageIcon("src/objects/brazowy.png"));

        bin1.addActionListener(taskButtonHandler);
        bin2.addActionListener(taskButtonHandler);
        bin3.addActionListener(taskButtonHandler);
        bin4.addActionListener(taskButtonHandler);

        add(bin1);
        add(bin2);
        add(bin3);
        add(bin4);

    }
}