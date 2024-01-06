package entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public class entity {
    public int worldX,worldY;
    public int playerSpeed;

    public BufferedImage up, down, left, right;
    public String direction;
    public Rectangle SolidBox;
    public int SolidAreaDefX, SolidAreaDefY;
    public boolean collisionOn = false;

}
