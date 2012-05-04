/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geantdegivre;

import monde.DomaineDesMorts;

/**
 * Modélise le géant de givre Hrym
 */
public class Hrym extends GeantDeGivre {

    /**
     * Le monde Domaine des morts
     */
    private DomaineDesMorts ddm;

    /**
     * Initialise Hrym
     *
     * @param ddm Le monde Domaine des morts
     * @param morceauRune Le morceau de rune
     */
    public Hrym(DomaineDesMorts ddm, boolean morceauRune) {
        super("Hrym", morceauRune);
        this.ddm = ddm;
        super.setCheminImage("/images/hrym.png");
    }

    /**
     * Désactive Hrym
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        ddm.setActif(true);
        super.setMorceauRune(true);
    }

    /**
     * Active Hrym
     */
    @Override
    public void activer() {
        super.setActif(true);
        ddm.setActif(false);
    }
}
