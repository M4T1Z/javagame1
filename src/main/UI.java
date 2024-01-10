package main;

import java.awt.*;
import java.text.DecimalFormat;

public class UI {

    Panel gp;
    Font arial_45, arial_80;

    DecimalFormat format = new DecimalFormat("#0.00");

    public UI(Panel gp){
        this.gp = gp;
        arial_45 = new Font("Arial", Font.PLAIN, 45);
        arial_80 = new Font("Arial", Font.BOLD, 80);

    }
//plansza kończąca rozgrywke, timer oraz licznik pkt
    public void draw(Graphics2D g2){

        if (GameState.state == GameState.RESULTS){

            g2.setFont(arial_80);
            g2.setColor(Color.WHITE);
            g2.drawString("Gra ukończona",gp.szerokosc/4-25,gp.wysokosc/4);

            g2.setFont(arial_45);
            g2.drawString("Twój czas: "+format.format(gp.playtime),gp.szerokosc/4-25,gp.wysokosc/2);
            g2.drawString("Punkty: "+ gp.player.points + "/28", gp.szerokosc/4-25, gp.wysokosc/2+50);
            g2.drawString("Błędy: "+ gp.taskManager.errors, gp.szerokosc/4-25, gp.wysokosc/2+100);
            g2.drawString("Czas doliczony za błędy: +"+ gp.taskManager.error_time + "s", gp.szerokosc/4+-25, gp.wysokosc/2+150);

            EndButton end = new EndButton("Koniec gry");
            end.setFont(new Font("Arial", Font.BOLD, 45));
            end.setBounds(350,gp.wysokosc/2+250,300,100);
            gp.add(end);
        }
        else{
            g2.setFont(arial_45);
            g2.setColor(Color.WHITE);
            g2.drawString("Punkty: "+ gp.player.points, 10, 50);

            //time
            gp.playtime += (double)1/60;
            g2.drawString("Czas:"+ format.format(gp.playtime),250 ,50);


        }


    }
}
