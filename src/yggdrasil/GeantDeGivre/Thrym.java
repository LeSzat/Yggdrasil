/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Ennemis.Jormungand;

/**
 *
 * @author mathias
 */
public class Thrym extends GeantDeGivre{
    private Jormungand jormungand;
    public Thrym(Jormungand jormungand) {
        super("Thrym", "Sigel");
        super.setCheminImage("/yggdrasil/vue/thrym.png");
        this.jormungand=jormungand;
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        jormungand.setGeantActif(false);
    }

    @Override
    public void activer() {
        super.setActif(true);
        jormungand.setGeantActif(true);
    }
}