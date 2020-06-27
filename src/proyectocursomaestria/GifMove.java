/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocursomaestria;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author pablo
 */
public class GifMove extends JLabel {

    private boolean bajar = false;
    private final Icon iconComer;
    private final Icon iconNoComer;
    private final CambiaImagen ciThread;

    public GifMove() {
        iconComer = new ImageIcon(getClass().getResource("/gifs/frame-2b.gif"));
        iconNoComer = new ImageIcon(getClass().getResource("/gifs/frame-2.gif"));
        this.setText("");
        ciThread = new CambiaImagen();
        this.setIcon(ciThread.getIcon());
    }

    void caminar(boolean iniciar) {
        if (iniciar) {
            if (!ciThread.isCaminando()) {
                ciThread.frenar(false);
                //new Thread(ciThread).start();
                this.setIcon(ciThread.getIcon());
                bajar = false;
            } else {
                this.setIcon(ciThread.getIcon());
                //this.getParent().repaint();
            }
        } else {
            ciThread.frenar(true);
        }
    }

    void comer(boolean iniciar) {
        if (iniciar) {
            bajar = true;
            ciThread.frenar(true);
            this.setIcon(iconComer);
        } else {
            bajar = false;
            if (!isCaminando()) {
                this.setIcon(iconNoComer);
            }
        }
    }

    boolean isComiendo() {
        return bajar;
    }

    boolean isCaminando() {
        return ciThread.isCaminando();
    }

    void getImagenSiguiente() {
        this.setIcon(ciThread.getIcon());
    }

}
