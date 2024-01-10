package main;
import entity.entity;
public class colission {
    Panel gp;

    public colission(Panel gp){
        this.gp = gp;

    }
    //sprawdzenie kolizji
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

                if (tilenr1 == 9 || tilenr2 == 9){
                    GameState.state = GameState.RESULTS;
                }

                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;

            case "down":
                entityBotRow = (entityBotWorldY + en.playerSpeed)/gp.wielkoscBox;
                tilenr1 = gp.manager.mapNr[entityLCol][entityBotRow];
                tilenr2 = gp.manager.mapNr[entityRCol][entityBotRow];

                if (tilenr1 == 9 || tilenr2 == 9){
                    GameState.state = GameState.RESULTS;
                }

                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;

            case "left":
                entityLCol = (entityLWorldX - en.playerSpeed)/gp.wielkoscBox;
                tilenr1 = gp.manager.mapNr[entityLCol][entityTopRow];
                tilenr2 = gp.manager.mapNr[entityLCol][entityBotRow];
                if (tilenr1 == 9 || tilenr2 == 9){
                    GameState.state = GameState.RESULTS;
                }

                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;

            case "right":
                entityRCol = (entityRWorldX + en.playerSpeed)/gp.wielkoscBox;
                tilenr1 = gp.manager.mapNr[entityRCol][entityTopRow];
                tilenr2 = gp.manager.mapNr[entityRCol][entityBotRow];

                if (tilenr1 == 9 || tilenr2 == 9){
                    GameState.state = GameState.RESULTS;
                }
                if(gp.manager.tile[tilenr1].collision == true || gp.manager.tile[tilenr2].collision == true){
                    en.collisionOn = true;
                }
                break;
        }


    }
    //kolizje z obiektami (śmieciami)
    public int checkObject(entity entity, boolean player){
        int index = 9999;

        for(int i = 0; i < gp.obj.length; i++){

            if(gp.obj[i] != null){

                entity.SolidBox.x = entity.worldX + entity.SolidBox.x;
                entity.SolidBox.y = entity.worldY + entity.SolidBox.y;

                gp.obj[i].SolidArea.x = gp.obj[i].worldX + gp.obj[i].SolidArea.x;
                gp.obj[i].SolidArea.y = gp.obj[i].worldY + gp.obj[i].SolidArea.y;

                switch (entity.direction){
                    case "up":
                        entity.SolidBox.y -= entity.playerSpeed;
                        if(entity.SolidBox.intersects(gp.obj[i].SolidArea)){
                            if (gp.obj[i].collision == true){
                                entity.collisionOn = true;
                            }
                            if (player == true){
                                index = i;
                            }
                        }
                        break;
                    case "down":
                        entity.SolidBox.y += entity.playerSpeed;
                        if(entity.SolidBox.intersects(gp.obj[i].SolidArea)){
                            if (gp.obj[i].collision == true){
                                entity.collisionOn = true;
                            }
                            if (player == true){
                                index = i;
                            }
                        }
                        break;
                    case "left":
                        entity.SolidBox.x -= entity.playerSpeed;
                        if(entity.SolidBox.intersects(gp.obj[i].SolidArea)){
                            if (gp.obj[i].collision == true){
                                entity.collisionOn = true;
                            }
                            if (player == true){
                                index = i;
                            }
                        }
                        break;
                    case "right":
                        entity.SolidBox.x += entity.playerSpeed;
                        if(entity.SolidBox.intersects(gp.obj[i].SolidArea)){
                            if (gp.obj[i].collision == true){
                                entity.collisionOn = true;
                            }
                            if (player == true){
                                index = i;
                            }
                        }
                        break;
                }
                entity.SolidBox.x = entity.SolidAreaDefX;
                entity.SolidBox.y = entity.SolidAreaDefY;
                gp.obj[i].SolidArea.x = gp.obj[i].solidAreaDefaultX;
                gp.obj[i].SolidArea.y = gp.obj[i].solidAreaDefaultY;

            }
        }

        return index;
    }

}
