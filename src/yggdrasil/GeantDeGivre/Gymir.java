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
        super.setCheminImage("/yggdrasil/vue/gymir.png");
    }

    @Override
    public void desactiver() {
        tb.setActif(false);
        super.setActif(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        tb.setActif(false);
    }

   
    
    
}
