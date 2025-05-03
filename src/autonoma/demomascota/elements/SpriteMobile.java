/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomascota.elements;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250503
 * @version 1.0.0
 */

public  abstract class SpriteMobile  extends Sprite{
    
    protected int step;

    public SpriteMobile(int step, int x, int y, int height, int width) {
        super(x, y, height, width);
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
    
    
    
}
