/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Loki;

/**
 *
 * @author mathias
 */
public class Suttung extends GeantDeGivre{
    private Loki loki;
    public Suttung(Loki loki, boolean morceauRune) {
        super("Suttung", morceauRune);
        super.setCheminImage("/yggdrasil/vue/suttung.png");
        this.loki=loki;
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        loki.setGeantActif(false);
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        loki.setGeantActif(true);
    }
}