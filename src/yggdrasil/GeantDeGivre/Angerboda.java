/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Hel;

/**
 *
 * @author mathias
 */
public class Angerboda extends GeantDeGivre {
    
    private Hel hel;
    
    public Angerboda(Hel hel) {
        super("Angerboda", "Sigel");
        super.setCheminImage("/yggdrasil/vue/angerboda.png");
        this.hel = hel;
    }
    
    @Override
    public void desactiver() {
        super.setActif(false);
        hel.setGeantActif(false);
    }
    
    @Override
    public void activer() {
        super.setActif(false);
        hel.setGeantActif(true);
    }
}
