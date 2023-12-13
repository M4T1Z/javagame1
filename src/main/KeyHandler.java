package main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// wczytywanie klawiatury
public class KeyHandler implements KeyListener {
    public boolean UP, DOWN, LEFT, RIGHT;
    public void keyTyped(KeyEvent e){

    }
// wczytywanie klawiszy
    @Override
    public void keyPressed(KeyEvent e) {
        int kod = e.getKeyCode();

        if(kod == KeyEvent.VK_W){
            UP = true;
        }
        if(kod == KeyEvent.VK_S){
            DOWN = true;
        }
        if(kod == KeyEvent.VK_A){
            LEFT = true;
        }
        if(kod == KeyEvent.VK_D){
            RIGHT = true;
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {
        int kod = e.getKeyCode();

        if(kod == KeyEvent.VK_W){
            UP = false;
        }
        if(kod == KeyEvent.VK_S){
            DOWN = false;
        }
        if(kod == KeyEvent.VK_A){
            LEFT = false;
        }
        if(kod == KeyEvent.VK_D){
            RIGHT = false;
        }

    }

}
