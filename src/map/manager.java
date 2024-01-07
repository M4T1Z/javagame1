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
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/background/drzewo.png"));
            tile[1].collision = true;

            tile[2] = new tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/background/domek.png"));
            tile[2].collision = true;

            tile[3] = new tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/background/blok1.png"));
            tile[3].collision = true;

            tile[4] = new tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/background/domek2.png"));
            tile[4].collision = true;

            tile[5] = new tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/background/domek3.png"));
            tile[5].collision = true;

            tile[6] = new tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/background/drzewo2.png"));
            tile[6].collision = true;



            tile[9] = new tile();
            tile[9].image = ImageIO.read(getClass().getResourceAsStream("/background/meta.png"));



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
