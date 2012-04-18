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
    private boolean actif;
    public Hymir() {
        super("Hymir", "Sigel");
        actif=false;
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