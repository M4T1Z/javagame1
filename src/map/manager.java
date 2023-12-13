package map;

import main.Panel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class manager {
    Panel gp;
    public tile[] tile;
    public int mapNr[][];

    public manager(Panel gp){
        this.gp = gp;
        tile = new tile[10];

        mapNr = new int[gp.MaxWorldCol][gp.MaxWorldRow];

        loadMap("/maps/map1.txt");



    }
//inicjalizacja kafelków mapy
    public void getTileImage(){
        try {
            tile[0] = new tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/background/ulica.png"));

            tile[1] = new tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/background/tło.png"));
            tile[1].collision = true;

            tile[2] = new tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/background/tło1.png"));
            tile[2].collision = true;



        }catch (IOException e){
            e.printStackTrace();
        }
    }
//załadowanie mapy z pliku txt
    public void loadMap(String mapa){
        try {
            InputStream inS = getClass().getResourceAsStream(mapa);
            BufferedReader br = new BufferedReader(new InputStreamReader(inS));

            int column = 0;
            int row = 0;

            while (column < gp.MaxWorldCol && row < gp.MaxWorldRow){
                String line = br.readLine();

                while (column < gp.MaxWorldCol){
                    String nums[] = line.split(" ");

                    int num = Integer.parseInt(nums[column]);

                    mapNr[column][row] = num;
                    column++;
                }
                if(column == gp.MaxWorldCol){
                    column = 0;
                    row++;
                }
            }
            br.close();

        }catch (Exception e){
         }
    }
//rysowanie mapy
    public void drawMap(Graphics2D g2){

        int worldColumn = 0;
        int worldRow = 0;

        while (worldColumn < gp.MaxWorldCol && worldRow < gp.MaxWys){

            int worldX = worldColumn * gp.wielkoscBox;
            int worldY = worldRow * gp.wielkoscBox;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            g2.drawImage(tile[mapNr[worldColumn][worldRow]].image, screenX, worldY, gp.wielkoscBox, gp.wielkoscBox, null);
            worldColumn++;

            if(worldColumn == gp.MaxWorldCol){
                worldColumn = 0;
                worldRow++;
            }
        }

    }


}
