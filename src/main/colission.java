package main;
import entity.entity;
public class colission {
    Panel gp;

    public colission(Panel gp){
        this.gp = gp;

    }


    public void checker(entity en){

        int entityLWorldX = en.worldX +en.SolidBox.x;
        int entityRWorldX = en.worldX +en.SolidBox.x + en.SolidBox.width;
        int entityTopWorldY = en.worldY +en.SolidBox.y;
        int entityBotWorldY = en.worldY +en.SolidBox.y + en.SolidBox.height;

        int entityLCol = entityLWorldX/gp.wielkoscBox;
        int entityRCol = entityRWorldX/gp.wielkoscBox;
        int entityTopRow = entityTopWorldY/gp.wielkoscBox;
        int entityBotRow = entityBotWorldY/gp.wielkoscBox;

        int tilenr1, tilenr2;

        switch (en.direction){
            case "up":
                entityTopRow = (entityTopWorldY - en.playerSpeed)/gp.wielkoscBox;
                tilenr1 = gp.manager.mapNr[entityLCol][entityTopRow];
                tilenr2 = gp.manager.mapNr[entityRCol][entityTopRow];
                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;

            case "down":
                entityBotRow = (entityBotWorldY + en.playerSpeed)/gp.wielkoscBox;
                tilenr1 = gp.manager.mapNr[entityLCol][entityBotRow];
                tilenr2 = gp.manager.mapNr[entityRCol][entityBotRow];
                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;

            case "left":
                entityLCol = (entityLWorldX - en.playerSpeed)/gp.wielkoscBox;
                tilenr1 = gp.manager.mapNr[entityLCol][entityTopRow];
                tilenr2 = gp.manager.mapNr[entityLCol][entityBotRow];
                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;

            case "right":
                entityRCol = (entityRWorldX + en.playerSpeed)/gp.wielkoscBox;
                tilenr1 = gp.manager.mapNr[entityRCol][entityTopRow];
                tilenr2 = gp.manager.mapNr[entityRCol][entityBotRow];
                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;
        }


    }


}
