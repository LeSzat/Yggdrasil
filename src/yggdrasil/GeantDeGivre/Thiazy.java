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
    public Thiazy(De de) {
        super("Thiazy", "Tiwaz");
        this.de=de;
        
        super.setCheminImage("/yggdrasil/vue/thiazy.png");
    }

    @Override
    public void desactiver() {
        de.setActif(true);
    }

    @Override
    public void activer() {
        de.setActif(false);
    }
    
    
}
