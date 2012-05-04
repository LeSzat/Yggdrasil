/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *Modélise le géant de givre Bergelmir
 */
public class Bergelmir extends GeantDeGivre{
    /**
     * Initialise Bergelmir
     * @param morceauRune boolean correspond à son morceau de rune
     */
    public Bergelmir(boolean morceauRune) {
        super("Bergelmir", morceauRune);
        super.setCheminImage("/images/bergelmir.png");
    }

    /**
     * Désactive Bergelmir
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        geantActif=true;
        super.setMorceauRune(true);
    }
    /**
     * Active Bergelmir
     */
    @Override
    public void activer() {
        super.setActif(true);
        geantActif=false;
    }

    
    
}
