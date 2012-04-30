/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Thokk extends GeantDeGivre{
    private boolean actif;
    public Thokk() {
        super("Thokk", "Mann");
        actif=false;
        
        super.setCheminImage("/yggdrasil/vue/thokk.png");
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
