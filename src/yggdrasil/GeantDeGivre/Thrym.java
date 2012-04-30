/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Thrym extends GeantDeGivre{
    private boolean actif;
    public Thrym() {
        super("Thrym", "Sigel");
        actif=false;
        super.setCheminImage("/yggdrasil/vue/thrym.png");
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