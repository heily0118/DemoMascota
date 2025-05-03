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
*  @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250503
 * @version 1.0.0
 */
public class Mascota extends Sprite {
    
    private String nombre;
    private Image imagen;

    public Mascota(String nombre, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.imagen = new ImageIcon(getClass().getResource("/autonoma/demomascota/images/gato.png")).getImage();
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }

    @Override
    public Rectangle getBoundaries() {
        return new Rectangle(x, y, width, height);
    }

   
    
    
    
}
