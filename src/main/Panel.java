package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

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
    double playtime;

    public GameWindow gameWindow;


    manager manager = new manager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;

    public colission checker = new colission(this);
    public ObjectSetter oSetter = new ObjectSetter(this);
    public UI ui = new UI(this);
    public player player;
    public TaskManager taskManager;
    public Menu menu;
    public Sobject obj[] = new Sobject[30];


    int fps = 60;



    public Panel(GameWindow gameWindow){
        super();
        this.gameWindow = gameWindow;

        setLayout(null);
        player = new player(this,keyH);
        taskManager = new TaskManager(this, player);
        menu = new Menu(this);
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


    //funkcja odświeżająca
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
        switch (GameState.state){
            case PLAY:
                if(!isAdded(gameWindow.okno, gameWindow.panel )){
                    gameWindow.okno.remove(taskManager);
                    gameWindow.okno.remove(menu);
                    gameWindow.okno.add(gameWindow.panel);
                    gameWindow.panel.revalidate();
                    gameWindow.panel.requestFocus();
                }
                player.update();
                break;
            case QUEST:
                break;

        }
    }

    public boolean isAdded(Container container, Component component){
        return SwingUtilities.isDescendingFrom(component, container);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        render(g);

    }

    private void render(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        switch (GameState.state){
            case PLAY:
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
                break;
            case QUEST:
                gameWindow.okno.remove(gameWindow.panel);
                gameWindow.okno.add(taskManager);
                taskManager.setFocusable(true);
                taskManager.requestFocus();
                taskManager.revalidate();
                taskManager.repaint();
                break;
            case PAUSE:
                gameWindow.okno.remove(gameWindow.panel);
                gameWindow.okno.add(menu);
                menu.setFocusable(true);
                menu.requestFocus();
                menu.revalidate();
                menu.repaint();
                break;
            case RESULTS:
                ui.draw(g2);
                break;
        }
    }


}
