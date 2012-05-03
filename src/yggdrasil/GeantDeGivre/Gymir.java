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

    public Gymir(TerreBenite tb, boolean morceauRune) {
        super("Gymir", morceauRune);
        this.tb=tb;
        super.setCheminImage("/yggdrasil/vue/gymir.png");
    }

    @Override
    public void desactiver() {
        tb.setActif(false);
        super.setActif(true);
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        tb.setActif(false);
    }

   
    
    
}
