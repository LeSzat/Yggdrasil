/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Surt;

/**
 *Modélise le géant de givre Greip
 */
public class Greip extends GeantDeGivre {

    /**
     * L'ennemi Surt
     */
    private Surt surt;

    /**
     * Initialise le géant de givre Greip
     * @param surt L'ennemiSurt
     * @param morceauRune Le morceau de rune
     */
    public Greip(Surt surt, boolean morceauRune) {
        super("Greip", morceauRune);
        super.setCheminImage("/images/greip.png");
        this.surt = surt;

    }

    @Override
    public void desactiver() {
        super.setActif(false);
        surt.setGeantActif(false);
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        surt.setGeantActif(true);

    }
}
