package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectPaper extends Sobject{
    public ObjectPaper(){
        name = "Paper";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("gazety_papier.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
