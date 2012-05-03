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
    public Geirroed(ForgeDesNains fdn,boolean morceauRune) {
        super("Geirroed", morceauRune);
        this.fdn=fdn;
        super.setCheminImage("/yggdrasil/vue/geirroed.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        fdn.setActif(true);
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        fdn.setActif(false);
    }

   
    
    
}
