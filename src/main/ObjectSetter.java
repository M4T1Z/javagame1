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
        gp.obj[0].worldX = 19 * gp.wielkoscBox;
        gp.obj[0].worldY = 5 * gp.wielkoscBox;

        gp.obj[1] = new ObjectPaper();
        gp.obj[1].worldX = 25 * gp.wielkoscBox;
        gp.obj[1].worldY = 4 * gp.wielkoscBox;

        gp.obj[2] = new ObjectBottleP();
        gp.obj[2].worldX = 8 * gp.wielkoscBox;
        gp.obj[2].worldY = 8 * gp.wielkoscBox;

        gp.obj[3] = new ObjectBottleP2();
        gp.obj[3].worldX = 20 * gp.wielkoscBox;
        gp.obj[3].worldY = 3 * gp.wielkoscBox;

        gp.obj[4] = new ObjectBottleG();
        gp.obj[4].worldX = 13 * gp.wielkoscBox;
        gp.obj[4].worldY = 3 * gp.wielkoscBox;

        gp.obj[5] = new ObjectJar();
        gp.obj[5].worldX = 20 * gp.wielkoscBox;
        gp.obj[5].worldY = 4 * gp.wielkoscBox;

        gp.obj[6] = new ObjectPizza();
        gp.obj[6].worldX = 18 * gp.wielkoscBox;
        gp.obj[6].worldY = 5 * gp.wielkoscBox;

        gp.obj[7] = new ObjectCup();
        gp.obj[7].worldX = 17 * gp.wielkoscBox;
        gp.obj[7].worldY = 5 * gp.wielkoscBox;

        gp.obj[8] = new ObjectCan();
        gp.obj[8].worldX = 21 * gp.wielkoscBox;
        gp.obj[8].worldY = 6 * gp.wielkoscBox;

        gp.obj[9] = new ObjectCan2();
        gp.obj[9].worldX = 22 * gp.wielkoscBox;
        gp.obj[9].worldY = 3 * gp.wielkoscBox;

    }
}
