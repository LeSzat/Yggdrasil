/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Dieu.Dieu;

/**
 *
 * @author mathias
 */
public class Utgardloki extends GeantDeGivre{
    public Utgardloki(boolean morceauRune) {
        super("Utgardloki", morceauRune);
        super.setCheminImage("/yggdrasil/vue/utgardloki.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        Dieu.pouvoirDieu=true;
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
         Dieu.pouvoirDieu=false;
    }

   
    
}
