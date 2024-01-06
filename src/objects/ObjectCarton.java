package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectCarton extends Sobject{
    public ObjectCarton(){
        name = "Paper";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("karton.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
