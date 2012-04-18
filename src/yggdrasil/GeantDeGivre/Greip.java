/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Greip extends GeantDeGivre{
    private boolean actif;
    public Greip() {
        super("Greip", "Daeg");
        actif =false;
    }

      @Override
    public void desactiver() {
        actif=false;
    }

    @Override
    public void activer() {
       actif=false;
    }
    
    
}
