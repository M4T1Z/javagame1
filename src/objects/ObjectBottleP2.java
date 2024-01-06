package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectBottleP2 extends Sobject{
    public ObjectBottleP2(){
        name = "Plastic";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("butelka_plastik2.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}