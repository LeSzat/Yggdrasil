/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Fenrir;

/**
 *Modélise le géant de givre Skyrmir
 */
public class Skyrmir extends GeantDeGivre{
    /**
     * L'ennemi Fenrir
     */
    private Fenrir fenrir;
    /**
     * Initialise Skyrmir
     * @param fenrir L'ennemi Fenrir
     * @param morceauRune Le morceau de rune
     */
    public Skyrmir(Fenrir fenrir, boolean morceauRune) {
        super("Skyrmir", morceauRune);
        this.fenrir=fenrir;
        super.setCheminImage("/images/skymir.png");
    }

    /**
     * Désactive Skyrmir
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        fenrir.setGeantActif(false);
        super.setMorceauRune(true);
    }

    /**
     * Active Skyrmir
     */
    @Override
    public void activer() {
        super.setActif(true);
        fenrir.setGeantActif(true);
    }
}