/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geantdegivre;

import monde.ForgeDesNains;

/**
 * Modélise le géant de givre Geirroed
 */
public class Geirroed extends GeantDeGivre {

    /**
     * Le monde forge des nains
     */
    private ForgeDesNains fdn;

    /**
     * Intialise Geirroed
     *
     * @param fdn Le monde Forge des nains
     * @param morceauRune Le morceau de rune
     */
    public Geirroed(ForgeDesNains fdn, boolean morceauRune) {
        super("Geirroed", morceauRune);
        this.fdn = fdn;
        super.setCheminImage("/images/geirroed.png");
    }

    /**
     * Désactive Geirroed
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        fdn.setActif(true);
        super.setMorceauRune(true);
    }

    /**
     * aActive Geirroed
     */
    @Override
    public void activer() {
        super.setActif(true);
        fdn.setActif(false);
    }
}
