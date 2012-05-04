/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pion;

/**
 *Modélise le Vane
 */
public class Vane {
    private int position;
    
    /**
     * Initialise le Vane
     */
    public Vane()
    {
        this.position=0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
}
