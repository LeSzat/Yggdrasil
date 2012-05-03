/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Fenrir;

/**
 *
 * @author mathias
 */
public class Skyrmir extends GeantDeGivre{
    private Fenrir fenrir;
    public Skyrmir(Fenrir fenrir, boolean morceauRune) {
        super("Skyrmir", morceauRune);
        this.fenrir=fenrir;
        super.setCheminImage("/yggdrasil/vue/skymir.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        fenrir.setGeantActif(false);
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        fenrir.setGeantActif(true);
    }
}