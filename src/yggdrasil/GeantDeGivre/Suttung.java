/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Suttung extends GeantDeGivre{
    private boolean actif;
    public Suttung() {
        super("Suttung", "Sigel");
        actif=false;
        super.setCheminImage("/yggdrasil/vue/suttung.png");
    }

    @Override
    public void desactiver() {
        actif=false;
    }

    @Override
    public void activer() {
        actif=true;
    }
}