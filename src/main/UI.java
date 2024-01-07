package main;

import java.awt.*;
import java.text.DecimalFormat;

public class UI {

    Panel gp;
    Font arial_45, arial_80;

    public boolean messageOn = false;
    public String message = "";
    public int messageCounter = 0;
    public boolean gameFinish = false;

    double playtime;
    DecimalFormat format = new DecimalFormat("#0.00");

    public UI(Panel gp){
        this.gp = gp;
        arial_45 = new Font("Arial", Font.PLAIN, 45);
        arial_80 = new Font("Arial", Font.BOLD, 80);

    }

    public void showMessage(String text){
        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2){

        if (gameFinish == true){

            g2.setFont(arial_80);
            g2.setColor(Color.WHITE);

            String text;
            int textlength;

            text = "Gra ukończona";
            textlength = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();

            int x = gp.szerokosc/2 - textlength/2;
            int y = gp.wysokosc/2 + (gp.wielkoscBox * 5);
            g2.drawString(text,x,y);

            g2.setFont(arial_45);
            g2.setColor(Color.WHITE);
            text = "Twój czas: " + format.format(playtime);
            textlength = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();

            x = gp.szerokosc/2 - textlength/2;
            y = gp.wysokosc/2 - (gp.wielkoscBox * 5);
            g2.drawString(text,x,y);

            gp.gameThread = null;

        }
        else{
            g2.setFont(arial_45);
            g2.setColor(Color.WHITE);
            g2.drawString("Punkty: "+ gp.player.points, 30, 50);

            //time
            playtime += (double)1/60;
            g2.drawString("Czas:"+ format.format(playtime),30 ,100);


        }


    }
}
