/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomascota.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250503
 * @version 1.0.0
 */


public class Jardin {

    private Mascota mascota;
    private Image jardinImage;

    public Jardin(Mascota mascota) {
        this.mascota = mascota;
        this.jardinImage = new ImageIcon(getClass().getResource("/autonoma/demomascota/images/Jardin.jpg")).getImage();
        new Thread(mascota).start();
    }

    public void moverMascotaHacia(int x, int y) {
        mascota.setDestino(x, y);
    }

    public void paint(Graphics g, int ancho, int alto) {
        
        g.drawImage(jardinImage, 0, 0, ancho, alto, null);
        mascota.paint(g);
    }
}