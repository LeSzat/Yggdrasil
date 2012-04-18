/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.TerreBenite;

/**
 *
 * @author mathias
 */
public class Gymir extends GeantDeGivre{
    private TerreBenite tb;

    public Gymir(TerreBenite tb) {
        super("Gymir", "Tiwaz");
        this.tb=tb;
    }

    @Override
    public void desactiver() {
        tb.setActif(true);
    }

    @Override
    public void activer() {
        tb.setActif(false);
    }

   
    
    
}