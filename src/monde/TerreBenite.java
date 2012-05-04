/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import pion.Vane;

/**
 *Modélise le monde Terre bénite
 */
public class TerreBenite extends Monde{
    /**
     * Le vane
     */
    private Vane vane;
    /**
     * Initialise le monde Terre bénite
     */
    public TerreBenite()
    {
        vane = new Vane();
    }
    /**
     * Avancer Vane dans terre bénite
     */
    public void avancerVane()
    {
        if(vane.getPosition()<5)
            vane.setPosition(vane.getPosition()+1);
        else
        {
            System.out.println("Vane est à sa position maximum");
        }
    }
    /**
     * Mettre Vane à sa position initiale
     */
    public void reset()
    {
        vane.setPosition(0);
    }
    public int getVanePostion()
    {
        return vane.getPosition();
    }
    
}
