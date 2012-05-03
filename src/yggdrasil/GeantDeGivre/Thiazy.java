/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.De;

/**
 *
 * @author mathias
 */
public class Thiazy extends GeantDeGivre{

    private De de;
    public Thiazy(De de, boolean morceauRune) {
        super("Thiazy", morceauRune);
        this.de=de;
        super.setCheminImage("/yggdrasil/vue/thiazy.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        de.setActif(true);
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        de.setActif(false);
    }
    
    
}
