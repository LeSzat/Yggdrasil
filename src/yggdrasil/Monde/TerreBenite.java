/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import yggdrasil.Vane;

/**
 *
 * @author mathias
 */
public class TerreBenite {
    private Vane vane;
    public TerreBenite()
    {
        vane = new Vane();
    }
    public void avancerVane()
    {
        if(vane.getPosition()<5)
            vane.setPosition(vane.getPosition()+1);
        else
        {
            System.out.println("Vane est à sa position maximum");
        }
    }
    public void reset()
    {
        vane.setPosition(0);
    }
    public int getVanePostion()
    {
        return vane.getPosition();
    }
    
}
