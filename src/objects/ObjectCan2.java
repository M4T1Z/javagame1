package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectCan2 extends Sobject{
    public ObjectCan2(){
        name = "Plastic";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("puszka_metal3.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
