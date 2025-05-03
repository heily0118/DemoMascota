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

    public Jardin(int x, int y, int height, int width) {
        super( x, y, height, width);
       
        
      
        addMascota();
        
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    
     private void addMascota(){
        Mascota miMascota = new Mascota("Luna", 100, 100, 64, 64); 
        miMascota.setGraphicContainer(this);
        this.mascota = miMascota; 
        sprites.add(miMascota);
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
    
    
    public void moverMascotaHacia(int objetivoX, int objetivoY) {
        if (mascota != null) {
            int dx = objetivoX - mascota.getX();
            int dy = objetivoY - mascota.getY();

           
            int velocidad = 5;
            if (Math.abs(dx) > velocidad) dx = velocidad * Integer.signum(dx);
            if (Math.abs(dy) > velocidad) dy = velocidad * Integer.signum(dy);

            mascota.setX(mascota.getX() + dx);
            mascota.setY(mascota.getY() + dy);
        }
    }
    
}
