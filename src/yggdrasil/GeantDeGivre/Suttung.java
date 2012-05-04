/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Loki;

/**
 *Modélise le géant de givre Suttung
 */
public class Suttung extends GeantDeGivre{
    /**
     * L'ennemi Loki
     */
    private Loki loki;
    public Suttung(Loki loki, boolean morceauRune) {
        super("Suttung", morceauRune);
        super.setCheminImage("/images/suttung.png");
        this.loki=loki;
    }

    /**
     * Désactive l'ennemi Loki
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        loki.setGeantActif(false);
        super.setMorceauRune(true);
    }

    /**
     * Active l'ennemi Loki
     */
    @Override
    public void activer() {
        super.setActif(true);
        loki.setGeantActif(true);
    }
}