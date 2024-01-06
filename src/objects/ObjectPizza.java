package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectPizza extends Sobject{
    public ObjectPizza(){
        name = "Mixed";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("pizza_zmieszane.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
