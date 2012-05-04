/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.De;

/**
 * Modélise le géant de givre Thiazy
 */
public class Thiazy extends GeantDeGivre {

    /**
     * Le dé
     */
    private De de;

    /**
     * Initialise Thiazy
     *
     * @param de Le dé
     * @param morceauRune Le morceau de rune
     */
    public Thiazy(De de, boolean morceauRune) {
        super("Thiazy", morceauRune);
        this.de = de;
        super.setCheminImage("/images/thiazy.png");
    }

    /**
     * Désactive Thiazy
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        de.setActif(true);
        super.setMorceauRune(true);
    }

    /**
     * Active Thiazy
     */
    @Override
    public void activer() {
        super.setActif(true);
        de.setActif(false);
    }
}
