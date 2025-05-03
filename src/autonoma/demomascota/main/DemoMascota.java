/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.demomascota.main;

import autonoma.demomascota.elements.Jardin;
import autonoma.demomascota.elements.Mascota;
import autonoma.demomascota.elements.Sprite;
import autonoma.demomascota.gui.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250503
 * @version 1.0.0
 */
public class DemoMascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Mascota miMascota = new Mascota("Luna",100, 100, 64, 64); 

        
        ArrayList<Sprite> sprites = new ArrayList<>();
        
        
        Jardin jardin = new Jardin(miMascota, sprites, 0, 0, 800, 600); 
        
        VentanaPrincipal ventana = new VentanaPrincipal (jardin);
        ventana.setVisible(true);
    }
    
}
