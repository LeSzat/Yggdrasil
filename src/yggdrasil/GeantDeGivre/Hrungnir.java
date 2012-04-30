/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Hrungnir extends GeantDeGivre{
    private boolean actif;
    public Hrungnir() {
        super("Hrungnir", "Sigel");
        actif=false;
        
        super.setCheminImage("/yggdrasil/vue/hrungnir.png");
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
