/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Skyrmir extends GeantDeGivre{
    private boolean actif;
    public Skyrmir() {
        super("Skyrmir", "Sigel");
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