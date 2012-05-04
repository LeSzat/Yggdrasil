/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.MondeDesTenebres;

/**
 * Modélise le géant de givre Fafner
 */
public class Fafner extends GeantDeGivre {

    /**
     * Le monde des ténébres
     */
    private MondeDesTenebres mdt;

    /**
     * Initialise Fafner
     * @param mdt Le monde Monde des ténébres
     * @param morceauRune Le boolean correspondant à son morceau de rune
     */
    public Fafner(MondeDesTenebres mdt, boolean morceauRune) {
        super("Fafner", morceauRune);
        this.mdt = mdt;
        super.setCheminImage("/images/fafner.png");
    }

    /**
     * Désactive Fafner
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        mdt.setActif(true);
        super.setMorceauRune(true);

    }

    /**
     * Active Fafner
     */
    @Override
    public void activer() {
        super.setActif(true);
        mdt.setActif(false);
    }
}
