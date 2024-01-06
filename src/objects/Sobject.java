package objects;

import main.Panel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Sobject {

    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    public Rectangle SolidArea = new Rectangle(0,0,64,64);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;

    public void draw(Graphics2D g2, Panel gp){
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        g2.drawImage(image, screenX, worldY, gp.wielkoscBox, gp.wielkoscBox, null);

    }
}
