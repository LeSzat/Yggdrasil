/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.DemeureDesElfes;

/**
 *
 * @author mathias
 */
public class Utgardloki extends GeantDeGivre{
    private DemeureDesElfes dde;
    public Utgardloki(DemeureDesElfes dde) {
        super("Utgardloki", "Sigel");
        this.dde=dde;
        super.setCheminImage("/yggdrasil/vue/utgardloki.png");
    }

    @Override
    public void desactiver() {
        dde.setActif(true);
    }

    @Override
    public void activer() {
        dde.setActif(false);
    }

   
    
}
