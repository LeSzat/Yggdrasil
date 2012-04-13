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
    public Fafner(MondeDesTenebres mdt) {
        super("Fafner", "Tiwaz");
        this.mdt=mdt;
    }

    @Override
    public void desactiver() {
        mdt.setActif(true);
    }

    @Override
    public void activer() {
        mdt.setActif(false);
    }

    
}
