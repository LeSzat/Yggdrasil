/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.MondeDesTenebres;

/**
 *
 * @author mathias
 */
public class Fafner extends GeantDeGivre{

    private MondeDesTenebres mdt;
    public Fafner(MondeDesTenebres mdt, boolean morceauRune) {
        super("Fafner", morceauRune);
        this.mdt=mdt;
        super.setCheminImage("/yggdrasil/vue/fafner.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        mdt.setActif(true);
        super.setMorceauRune(true);
        
    }

    @Override
    public void activer() {
        super.setActif(true);
        mdt.setActif(false);
    }

    
}
