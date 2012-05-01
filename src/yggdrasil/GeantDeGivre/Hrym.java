/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.DomaineDesMorts;

/**
 *
 * @author mathias
 */
public class Hrym extends GeantDeGivre{
    private DomaineDesMorts ddm;
    public Hrym(DomaineDesMorts ddm) {
        super("Hrym", "Sigel");
        this.ddm=ddm;
        
        super.setCheminImage("/yggdrasil/vue/hrym.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        ddm.setActif(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        ddm.setActif(false);
    }

 
}
