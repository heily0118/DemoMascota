/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomascota.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250503
 * @version 1.0.0
 */

public class Jardin  extends SpriteContainer{
    
    protected Mascota mascota;

    public Jardin(Mascota mascota, ArrayList<Sprite> sprites, int x, int y, int height, int width) {
        super(sprites, x, y, height, width);
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    
        @Override
    public void paint(Graphics g) {
        g.setColor(new Color(144, 238, 144)); 
        g.fillRect(x, y, width, height);

        for (Sprite sprite : sprites) {
            sprite.paint(g);
        }

        if (mascota != null) {
            mascota.paint(g);
        }
    
    }

    @Override
    public void refresh() {
        if(gameContainer != null)
            gameContainer.refresh();
    }

     @Override
    public Rectangle getBoundaries() {
        return new Rectangle(x, y, width, height);
    }
    
}
