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
public class Hrungnir extends GeantDeGivre{
    private DemeureDesElfes dde;
    public Hrungnir(DemeureDesElfes dde) {
        super("Hrungnir", "Sigel");
        super.setCheminImage("/yggdrasil/vue/hrungnir.png");
        this.dde=dde;
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        dde.setActif(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        dde.setActif(false);
    }

   
    
    
}
