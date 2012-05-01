/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Utgardloki extends GeantDeGivre{
    public Utgardloki() {
        super("Utgardloki", "Sigel");
        super.setCheminImage("/yggdrasil/vue/utgardloki.png");
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
