/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomascota.elements;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250503
 * @version 1.0.0
 */
public class Mascota extends SpriteMobile implements Runnable {

    private String nombre;
    private Image imagen;
    private int destinoX, destinoY;

    public Mascota(String nombre, int step, int x, int y, int height, int width) {
        super(step, x, y, height, width);
        this.nombre = nombre;
        this.imagen = new ImageIcon(getClass().getResource("/autonoma/demomascota/images/gato.png")).getImage();
        this.destinoX = x;
        this.destinoY = y;
    }

    public void setDestino(int x, int y) {
        this.destinoX = x;
        this.destinoY = y;
    }

    @Override
    public void mover() {
        if (x < destinoX) x += Math.min(step, destinoX - x);
        if (x > destinoX) x -= Math.min(step, x - destinoX);
        if (y < destinoY) y += Math.min(step, destinoY - y);
        if (y > destinoY) y -= Math.min(step, y - destinoY);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }

    @Override
    public Rectangle getBoundaries() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public void run() {
        while (true) {
            mover();
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}