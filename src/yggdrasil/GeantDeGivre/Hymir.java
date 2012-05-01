/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Hymir extends GeantDeGivre{
    public Hymir() {
        super("Hymir", "Sigel");
        super.setCheminImage("/yggdrasil/vue/hymir.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
    }

    @Override
    public void activer() {
        super.setActif(true);
    }
}