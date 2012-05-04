/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geantdegivre;

import monde.TerreBenite;

/**
 * Modélise le géant de givre Gymir
 */
public class Gymir extends GeantDeGivre {

    /**
     * Le monde Terre bénite
     */
    private TerreBenite tb;

    /**
     * Initialise Gymir
     *
     * @param tb Le monde Terre bénite
     * @param morceauRune Le morceau de rune
     */
    public Gymir(TerreBenite tb, boolean morceauRune) {
        super("Gymir", morceauRune);
        this.tb = tb;
        super.setCheminImage("/images/gymir.png");
    }

    /**
     * Désactive Gymir
     */
    @Override
    public void desactiver() {
        tb.setActif(false);
        super.setActif(false);
        super.setMorceauRune(true);
    }

    /**
     * Active Gymir
     */
    @Override
    public void activer() {
        super.setActif(true);
        tb.setActif(false);
    }
}
