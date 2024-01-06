package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectCan extends Sobject{
    public ObjectCan(){
        name = "Plastic";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("puszka_metal2.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
