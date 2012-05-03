/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Nidhogg;

/**
 *
 * @author mathias
 */
public class Thokk extends GeantDeGivre{
    private Nidhogg nidhogg;
    public Thokk(Nidhogg nidhogg, boolean morceauRune) {
        super("Thokk", morceauRune);
        this.nidhogg=nidhogg;
        super.setCheminImage("/yggdrasil/vue/thokk.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        nidhogg.setGeantActif(false);
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
       nidhogg.setGeantActif(true);
    }

  
    
}
