/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Surt;

/**
 *
 * @author mathias
 */
public class Greip extends GeantDeGivre {

    private Surt surt;

    public Greip(Surt surt, boolean morceauRune) {
        super("Greip", morceauRune);
        super.setCheminImage("/yggdrasil/vue/greip.png");
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
