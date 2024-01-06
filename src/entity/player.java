package entity;

import main.KeyHandler;
import main.Panel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class player extends entity{
    Panel gp;
    KeyHandler keyH;

    public final int screenX;
    public int points = 0;

    public player (Panel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.szerokosc - 900 - (gp.wielkoscBox/2);

        SolidBox = new Rectangle(0, 0, gp.wielkoscBox, gp.wielkoscBox);
        SolidAreaDefX = SolidBox.x;
        SolidAreaDefY = SolidBox.y;



        setDefaultValues();
        getPlayerImage();

    }

    public void setDefaultValues(){
        worldX = 100;
        worldY = 480;
        playerSpeed = 3;
        direction = "right";

    }

    public void getPlayerImage(){
        try {
            up = ImageIO.read(getClass().getResourceAsStream("/Truck/trashmaster_UP.png"));
            down = ImageIO.read(getClass().getResourceAsStream("/Truck/trashmaster_Down.png"));
            left = ImageIO.read(getClass().getResourceAsStream("/Truck/trashmaster_Left.png"));
            right = ImageIO.read(getClass().getResourceAsStream("/Truck/trashmaster_Right.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void update(){
        if(keyH.UP){
            direction = "up";
        }
        else if(keyH.DOWN){
            direction = "down";
        }
        else if(keyH.LEFT){
            direction = "left";
        }
        else if(keyH.RIGHT){
            direction = "right";
        }
    //sprawdzanie kolizji
        collisionOn = false;
        gp.checker.checker(this);

    //kolizja obiektow
        int objIndex = gp.checker.checkObject(this,true);
        pickUp(objIndex);


        if(collisionOn == false){
            switch (direction){
            case "up":
                worldY -= playerSpeed;
                break;

            case "down":
                worldY += playerSpeed;
                break;

            case "left":
                worldX -= playerSpeed;
                break;

            case "right":
                worldX += playerSpeed;
                break;
            }
        }


    }

    public void pickUp(int i){
        if(i != 9999){

            String objectName = gp.obj[i].name;

            switch (objectName){
                case "Paper":
                    //funkcja z wyborem właściwym papierem - zwrotka w postaci odp czy dobrze wybrano,
                    //jesli tak to -2 sek z czasu i +1 pkt
                    gp.obj[i] = null;
                    break;

                case "Plastic":
                    //funkcja z wyborem właściwym plastikiem


                    gp.obj[i] = null;
                    break;

                case "Glass":
                    //funkcja z wyborem właściwym szklem
                    gp.obj[i] = null;
                    break;

                case "Mixed":
                    //funkcja z wyborem właściwym mieszanym
                    gp.obj[i] = null;
                    break;
            }


        }
    }

    public void draw(Graphics2D g2){
        BufferedImage image = null;

        switch (direction){
            case "up":
                image = up;
                break;
            case "down":
                image = down;
                break;
            case "left":
                image = left;
                break;
            case "right":
                image = right;
                break;
        }
        g2.drawImage(image, screenX, worldY, gp.wielkoscBox, gp.wielkoscBox, null);
    }

}
