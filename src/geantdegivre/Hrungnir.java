/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geantdegivre;

import monde.DemeureDesElfes;

/**
 * Modélise le géant de givre Hrungnir
 */
public class Hrungnir extends GeantDeGivre {

    /**
     * Le monde Demeure des elfes
     */
    private DemeureDesElfes dde;

    /**
     * Initialise Hrungnir
     *
     * @param dde Le monde Demeure des elfes
     * @param morceauRune Le morceau de rune
     */
    public Hrungnir(DemeureDesElfes dde, boolean morceauRune) {
        super("Hrungnir", morceauRune);
        super.setCheminImage("/images/hrungnir.png");
        this.dde = dde;
    }

    /**
     * Désactive Hrungnir
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        dde.setActif(true);
        super.setMorceauRune(true);
    }

    /**
     * Active Hrungnir
     */
    @Override
    public void activer() {
        super.setActif(true);
        dde.setActif(false);
    }
}
