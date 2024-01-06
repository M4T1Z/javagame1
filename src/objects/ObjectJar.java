package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectJar extends Sobject{
    public ObjectJar(){
        name = "Glass";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("sloik_szklo.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
