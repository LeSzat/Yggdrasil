/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Bergelmir extends GeantDeGivre{
    private boolean actif;
    public Bergelmir() {
        super("Bergelmir", "Mann");
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
