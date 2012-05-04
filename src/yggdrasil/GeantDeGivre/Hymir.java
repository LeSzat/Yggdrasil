/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *Modélise le géant de givre Hymir
 */
public class Hymir extends GeantDeGivre{
    /**
     * Initialise Hymir
     * @param morceauRune Le morceau de rune
     */
    public Hymir(boolean morceauRune) {
        super("Hymir", morceauRune);
        super.setCheminImage("/images/hymir.png");
    }

    /**
     * Désactive Hymir
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        super.setMorceauRune(true);
    }

    /**
     * Active Hymir
     */
    @Override
    public void activer() {
        super.setActif(true);
    }
}