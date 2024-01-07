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

        gp.obj[3] = new ObjectCarton();
        gp.obj[3].worldX = 129 * gp.wielkoscBox;
        gp.obj[3].worldY = 5 * gp.wielkoscBox;

        gp.obj[4] = new ObjectPaper();
        gp.obj[4].worldX = 26 * gp.wielkoscBox;
        gp.obj[4].worldY = 9 * gp.wielkoscBox;

        gp.obj[5] = new ObjectPaper();
        gp.obj[5].worldX = 56 * gp.wielkoscBox;
        gp.obj[5].worldY = 3 * gp.wielkoscBox;

        gp.obj[6] = new ObjectPaper();
        gp.obj[6].worldX = 83 * gp.wielkoscBox;
        gp.obj[6].worldY = 8 * gp.wielkoscBox;

        gp.obj[7] = new ObjectPaper();
        gp.obj[7].worldX = 125 * gp.wielkoscBox;
        gp.obj[7].worldY = 7 * gp.wielkoscBox;

        gp.obj[8] = new ObjectBottleP();
        gp.obj[8].worldX = 14 * gp.wielkoscBox;
        gp.obj[8].worldY = 3 * gp.wielkoscBox;

        gp.obj[9] = new ObjectBottleP();
        gp.obj[9].worldX = 53 * gp.wielkoscBox;
        gp.obj[9].worldY = 10 * gp.wielkoscBox;

        gp.obj[10] = new ObjectBottleP();
        gp.obj[10].worldX = 82 * gp.wielkoscBox;
        gp.obj[10].worldY = 2 * gp.wielkoscBox;

        gp.obj[11] = new ObjectBottleP2();
        gp.obj[11].worldX = 9 * gp.wielkoscBox;
        gp.obj[11].worldY = 2 * gp.wielkoscBox;

        gp.obj[12] = new ObjectBottleP2();
        gp.obj[12].worldX = 38 * gp.wielkoscBox;
        gp.obj[12].worldY = 3 * gp.wielkoscBox;

        gp.obj[13] = new ObjectBottleP2();
        gp.obj[13].worldX = 78 * gp.wielkoscBox;
        gp.obj[13].worldY = 7 * gp.wielkoscBox;

        gp.obj[14] = new ObjectBottleP2();
        gp.obj[14].worldX = 123 * gp.wielkoscBox;
        gp.obj[14].worldY = 4 * gp.wielkoscBox;

        gp.obj[15] = new ObjectBottleG();
        gp.obj[15].worldX = 24 * gp.wielkoscBox;
        gp.obj[15].worldY = 5 * gp.wielkoscBox;

        gp.obj[16] = new ObjectBottleG();
        gp.obj[16].worldX = 43 * gp.wielkoscBox;
        gp.obj[16].worldY = 6 * gp.wielkoscBox;

        gp.obj[17] = new ObjectBottleG();
        gp.obj[17].worldX = 72 * gp.wielkoscBox;
        gp.obj[17].worldY = 9 * gp.wielkoscBox;

        gp.obj[18] = new ObjectJar();
        gp.obj[18].worldX = 29 * gp.wielkoscBox;
        gp.obj[18].worldY = 7 * gp.wielkoscBox;

        gp.obj[19] = new ObjectJar();
        gp.obj[19].worldX = 47 * gp.wielkoscBox;
        gp.obj[19].worldY = 2 * gp.wielkoscBox;

        gp.obj[20] = new ObjectJar();
        gp.obj[20].worldX = 72 * gp.wielkoscBox;
        gp.obj[20].worldY = 3 * gp.wielkoscBox;

        gp.obj[21] = new ObjectJar();
        gp.obj[21].worldX = 114 * gp.wielkoscBox;
        gp.obj[21].worldY = 10 * gp.wielkoscBox;

        gp.obj[22] = new ObjectPizza();
        gp.obj[22].worldX = 35 * gp.wielkoscBox;
        gp.obj[22].worldY = 2 * gp.wielkoscBox;

        gp.obj[23] = new ObjectPizza();
        gp.obj[23].worldX = 51 * gp.wielkoscBox;
        gp.obj[23].worldY = 5 * gp.wielkoscBox;

        gp.obj[24] = new ObjectPizza();
        gp.obj[24].worldX = 100 * gp.wielkoscBox;
        gp.obj[24].worldY = 6 * gp.wielkoscBox;

        gp.obj[25] = new ObjectPizza();
        gp.obj[25].worldX = 126 * gp.wielkoscBox;
        gp.obj[25].worldY = 6 * gp.wielkoscBox;

        gp.obj[26] = new ObjectCup();
        gp.obj[26].worldX = 19 * gp.wielkoscBox;
        gp.obj[26].worldY = 4 * gp.wielkoscBox;

        gp.obj[27] = new ObjectCup();
        gp.obj[27].worldX = 42 * gp.wielkoscBox;
        gp.obj[27].worldY = 10 * gp.wielkoscBox;

        gp.obj[28] = new ObjectCup();
        gp.obj[28].worldX = 115 * gp.wielkoscBox;
        gp.obj[28].worldY = 1 * gp.wielkoscBox;

        gp.obj[29] = new ObjectCan();
        gp.obj[29].worldX = 39 * gp.wielkoscBox;
        gp.obj[29].worldY = 9 * gp.wielkoscBox;

        gp.obj[30] = new ObjectCan();
        gp.obj[30].worldX = 53 * gp.wielkoscBox;
        gp.obj[30].worldY = 7 * gp.wielkoscBox;

        gp.obj[31] = new ObjectCan();
        gp.obj[31].worldX = 108 * gp.wielkoscBox;
        gp.obj[31].worldY = 4 * gp.wielkoscBox;

        gp.obj[32] = new ObjectCan2();
        gp.obj[32].worldX = 29 * gp.wielkoscBox;
        gp.obj[32].worldY = 3 * gp.wielkoscBox;

        gp.obj[33] = new ObjectCan2();
        gp.obj[33].worldX = 68 * gp.wielkoscBox;
        gp.obj[33].worldY = 5 * gp.wielkoscBox;

        gp.obj[34] = new ObjectCan2();
        gp.obj[34].worldX = 93 * gp.wielkoscBox;
        gp.obj[34].worldY = 1 * gp.wielkoscBox;

    }
}
