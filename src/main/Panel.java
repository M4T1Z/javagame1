package main;

import javax.swing.JPanel;
import java.awt.*;
import entity.player;
import map.manager;
import objects.Sobject;

public class Panel extends JPanel implements Runnable{

    //ustawienia ekranu
    final int wymiarBox = 16;
    final int skala = 4;
    public final int wielkoscBox = wymiarBox * skala;           //64x64
    public final int MaxSzer = 16;
    public final int MaxWys = 12;
    public final int szerokosc = wielkoscBox * MaxSzer;        //1024 px
    public final int wysokosc = wielkoscBox * MaxWys;          //768 px

    //ustawienia mapy świata
    public final int MaxWorldCol = 302/2;
    public final int MaxWorldRow = MaxWys;
    public final int worldSzer = MaxWorldCol * wielkoscBox;     //6400 px
    public final int worldWys = MaxWorldRow * wielkoscBox;      //768 px



    manager manager = new manager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;

    public colission checker = new colission(this);
    public ObjectSetter oSetter = new ObjectSetter(this);
    public UI ui = new UI(this);
    public player player = new player(this,keyH);
    public Sobject obj[] = new Sobject[35];


    int fps = 60;



    public Panel(){

        this.setPreferredSize(new Dimension(szerokosc,wysokosc));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        manager.getTileImage();
    }

    public void setupObject(){
        oSetter.setObject();
    }

    public void startgameThread(){
        gameThread = new Thread(this);
        gameThread.start();

    }
    @Override
    public void run() {

        double drawInterval = 1000000000/fps; //0,0166 sec
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null){

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1){
                update();
                repaint();
                delta--;
                drawCount++;
            }
            if(timer >= 1000000000){
                System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }

    public void update(){
        player.update();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        //tile
        manager.drawMap(g2);
        //object
        for (int i = 0; i < obj.length; i++){
            if (obj[i] != null){
                obj[i].draw(g2, this);
            }
        }
        //player
        player.draw(g2);

        //UI
        ui.draw(g2);
        g2.dispose();

    }

}
