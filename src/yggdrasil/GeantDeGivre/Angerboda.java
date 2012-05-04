/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Hel;

/**
 * Modélise le géant de givre Angerboda
 */
public class Angerboda extends GeantDeGivre {

    private Hel hel;

    /**
     * Initiale Angerboda
     *
     * @param hel L'ennemi Hel
     * @param morceauRune boolean correspond à son morceau de rune
     */
    public Angerboda(Hel hel, boolean morceauRune) {
        super("Angerboda", morceauRune);
        super.setCheminImage("/images/angerboda.png");
        this.hel = hel;
    }

    /**
     * Désactive Angerboda
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        hel.setGeantActif(false);
        super.setMorceauRune(true);
    }

    /**
     * Active Angerboda
     */
    @Override
    public void activer() {
        super.setActif(true);
        hel.setGeantActif(true);
    }
}
