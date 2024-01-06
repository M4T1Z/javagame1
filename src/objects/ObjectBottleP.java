package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectBottleP extends Sobject{
    public ObjectBottleP(){
        name = "Plastic";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("butelka_plastik.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
