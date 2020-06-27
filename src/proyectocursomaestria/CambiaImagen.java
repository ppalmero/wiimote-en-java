/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocursomaestria;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author pablo
 */
public class CambiaImagen /*implements Runnable*/{

    int contGifCaminando = 1;
    private final ArrayList<ImageIcon> gifs = new ArrayList<>();
    private boolean frenar = true;
    private boolean otroIcono = true;
    
    public CambiaImagen() {
        for (int i = 1; i < 9; i++) {
            gifs.add(new ImageIcon(getClass().getResource("/gifs/frame-" + i + ".gif")));
        }
    }

    /*@Override
    public void run() {
        /*while (!frenar) {
            long now = System.currentTimeMillis();
            long expectedElapsedTime = now + 300;
            while (now < expectedElapsedTime && !otroIcono) {
                now = System.currentTimeMillis();
            }
            contGifCaminando++;
            if (contGifCaminando >= 8) {
                contGifCaminando = 0;
            }
            otroIcono = false;
        }
    }*/

    Icon getIcon() {
        otroIcono = true;
        return gifs.get(contGifCaminando++ % 8);
    }
    
    boolean isCaminando() {
        return !frenar;
    }

    void frenar(boolean frenar) {
        this.frenar = frenar;
    }
    
}
