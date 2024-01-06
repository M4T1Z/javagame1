package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectBottleG extends Sobject{
    public ObjectBottleG(){
        name = "Glass";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("butelka_szklo2.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
