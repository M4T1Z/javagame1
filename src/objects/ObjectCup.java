package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectCup extends Sobject{
    public ObjectCup(){
        name = "Mixed";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("kubek_zmieszane2.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
