/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geantdegivre;

import ennemis.Nidhogg;

/**
 * Modélise le géant de givre Thokk
 */
public class Thokk extends GeantDeGivre {

    private Nidhogg nidhogg;

    public Thokk(Nidhogg nidhogg, boolean morceauRune) {
        super("Thokk", morceauRune);
        this.nidhogg = nidhogg;
        super.setCheminImage("/images/thokk.png");
    }

    /**
     * Désactive Thokk
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        nidhogg.setGeantActif(false);
        super.setMorceauRune(true);
    }

    /**
     * Active Thokk
     */
    @Override
    public void activer() {
        super.setActif(true);
        nidhogg.setGeantActif(true);
    }
}
