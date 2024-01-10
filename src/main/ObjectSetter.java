package main;

import objects.ObjectCarton;
import objects.ObjectPaper;
import objects.ObjectBottleP;
import objects.ObjectBottleP2;
import objects.ObjectBottleG;
import objects.ObjectJar;
import objects.ObjectPizza;
import objects.ObjectCup;
import objects.ObjectCan;
import objects.ObjectCan2;
public class ObjectSetter {

    Panel gp;
    public ObjectSetter(Panel gp){

        this.gp = gp;
    }
//ustawienie obiektów - śmieci na mapie
    public void setObject(){

        gp.obj[0] = new ObjectCarton();
        gp.obj[0].worldX = 8 * gp.wielkoscBox;
        gp.obj[0].worldY = 5 * gp.wielkoscBox;

        gp.obj[1] = new ObjectCarton();
        gp.obj[1].worldX = 33 * gp.wielkoscBox;
        gp.obj[1].worldY = 6 * gp.wielkoscBox;

        gp.obj[2] = new ObjectCarton();
        gp.obj[2].worldX = 92 * gp.wielkoscBox;
        gp.obj[2].worldY = 7 * gp.wielkoscBox;

        gp.obj[3] = new ObjectPaper();
        gp.obj[3].worldX = 26 * gp.wielkoscBox;
        gp.obj[3].worldY = 9 * gp.wielkoscBox;

        gp.obj[4] = new ObjectPaper();
        gp.obj[4].worldX = 56 * gp.wielkoscBox;
        gp.obj[4].worldY = 3 * gp.wielkoscBox;

        gp.obj[5] = new ObjectPaper();
        gp.obj[5].worldX = 125 * gp.wielkoscBox;
        gp.obj[5].worldY = 7 * gp.wielkoscBox;

        gp.obj[6] = new ObjectBottleP();
        gp.obj[6].worldX = 14 * gp.wielkoscBox;
        gp.obj[6].worldY = 3 * gp.wielkoscBox;

        gp.obj[7] = new ObjectBottleP();
        gp.obj[7].worldX = 53 * gp.wielkoscBox;
        gp.obj[7].worldY = 10 * gp.wielkoscBox;

        gp.obj[8] = new ObjectBottleP();
        gp.obj[8].worldX = 82 * gp.wielkoscBox;
        gp.obj[8].worldY = 2 * gp.wielkoscBox;

        gp.obj[9] = new ObjectBottleP2();
        gp.obj[9].worldX = 38 * gp.wielkoscBox;
        gp.obj[9].worldY = 3 * gp.wielkoscBox;

        gp.obj[10] = new ObjectBottleP2();
        gp.obj[10].worldX = 78 * gp.wielkoscBox;
        gp.obj[10].worldY = 7 * gp.wielkoscBox;

        gp.obj[11] = new ObjectBottleP2();
        gp.obj[11].worldX = 123 * gp.wielkoscBox;
        gp.obj[11].worldY = 4 * gp.wielkoscBox;

        gp.obj[12] = new ObjectBottleG();
        gp.obj[12].worldX = 24 * gp.wielkoscBox;
        gp.obj[12].worldY = 5 * gp.wielkoscBox;

        gp.obj[13] = new ObjectBottleG();
        gp.obj[13].worldX = 43 * gp.wielkoscBox;
        gp.obj[13].worldY = 6 * gp.wielkoscBox;

        gp.obj[14] = new ObjectBottleG();
        gp.obj[14].worldX = 72 * gp.wielkoscBox;
        gp.obj[14].worldY = 9 * gp.wielkoscBox;

        gp.obj[15] = new ObjectJar();
        gp.obj[15].worldX = 29 * gp.wielkoscBox;
        gp.obj[15].worldY = 7 * gp.wielkoscBox;

        gp.obj[16] = new ObjectJar();
        gp.obj[16].worldX = 47 * gp.wielkoscBox;
        gp.obj[16].worldY = 2 * gp.wielkoscBox;

        gp.obj[17] = new ObjectJar();
        gp.obj[17].worldX = 114 * gp.wielkoscBox;
        gp.obj[17].worldY = 10 * gp.wielkoscBox;

        gp.obj[18] = new ObjectPizza();
        gp.obj[18].worldX = 35 * gp.wielkoscBox;
        gp.obj[18].worldY = 2 * gp.wielkoscBox;

        gp.obj[19] = new ObjectPizza();
        gp.obj[19].worldX = 100 * gp.wielkoscBox;
        gp.obj[19].worldY = 6 * gp.wielkoscBox;

        gp.obj[20] = new ObjectPizza();
        gp.obj[20].worldX = 126 * gp.wielkoscBox;
        gp.obj[20].worldY = 6 * gp.wielkoscBox;

        gp.obj[21] = new ObjectCup();
        gp.obj[21].worldX = 19 * gp.wielkoscBox;
        gp.obj[21].worldY = 4 * gp.wielkoscBox;

        gp.obj[22] = new ObjectCup();
        gp.obj[22].worldX = 42 * gp.wielkoscBox;
        gp.obj[22].worldY = 10 * gp.wielkoscBox;

        gp.obj[23] = new ObjectCup();
        gp.obj[23].worldX = 115 * gp.wielkoscBox;
        gp.obj[23].worldY = 1 * gp.wielkoscBox;

        gp.obj[24] = new ObjectCan();
        gp.obj[24].worldX = 39 * gp.wielkoscBox;
        gp.obj[24].worldY = 9 * gp.wielkoscBox;

        gp.obj[25] = new ObjectCan();
        gp.obj[25].worldX = 108 * gp.wielkoscBox;
        gp.obj[25].worldY = 4 * gp.wielkoscBox;

        gp.obj[26] = new ObjectCan2();
        gp.obj[26].worldX = 29 * gp.wielkoscBox;
        gp.obj[26].worldY = 3 * gp.wielkoscBox;

        gp.obj[27] = new ObjectCan2();
        gp.obj[27].worldX = 93 * gp.wielkoscBox;
        gp.obj[27].worldY = 1 * gp.wielkoscBox;

    }
}
