/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Angerboda extends GeantDeGivre{
    private boolean actif;

    public Angerboda() {
        super("Angerboda", "Sigel");
        actif=false;
        super.setCheminImage("/yggdrasil/vue/angerboda.png");
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
