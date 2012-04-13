/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.ForgeDesNains;

/**
 *
 * @author mathias
 */
public class Geirroed extends GeantDeGivre{
    private ForgeDesNains fdn;
    public Geirroed(ForgeDesNains fdn) {
        super("Geirroed", "Daeg");
        this.fdn=fdn;
    }

    @Override
    public void desactiver() {
        fdn.setActif(true);
    }

    @Override
    public void activer() {
        fdn.setActif(false);
    }

   
    
    
}
