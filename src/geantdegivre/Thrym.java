/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geantdegivre;

import ennemis.Jormungand;

/**
 * Modélise le géant de givre Thrym
 */
public class Thrym extends GeantDeGivre {

    /**
     * L'ennemi Jormungand
     */
    private Jormungand jormungand;

    /**
     * Initialise Thrym
     *
     * @param jormungand L'ennemi Jormungand
     * @param morceauRune le morceau de rune
     */
    public Thrym(Jormungand jormungand, boolean morceauRune) {
        super("Thrym", morceauRune);
        super.setCheminImage("/images/thrym.png");
        this.jormungand = jormungand;
    }

    /**
     * Désactive Thrym
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        jormungand.setGeantActif(false);
        super.setMorceauRune(true);
    }

    /**
     * Active Thrym
     */
    @Override
    public void activer() {
        super.setActif(true);
        jormungand.setGeantActif(true);
    }
}