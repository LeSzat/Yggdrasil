/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Dieu.Dieu;

/**
 *Modélise le géant de givre Utgardloki
 */
public class Utgardloki extends GeantDeGivre{
    /**
     * Initialise Utgardloki
     * @param morceauRune Le morceau de rune
     */
    public Utgardloki(boolean morceauRune) {
        super("Utgardloki", morceauRune);
        super.setCheminImage("/images/utgardloki.png");
    }

    @Override
    /**
     * Désactive Utgardloki
     */
    public void desactiver() {
        super.setActif(false);
        Dieu.pouvoirDieu=true;
        super.setMorceauRune(true);
    }

    /**
     * Active Utgardloki
     */
    @Override
    public void activer() {
        super.setActif(true);
         Dieu.pouvoirDieu=false;
    }

   
    
}
