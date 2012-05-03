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
    public Bergelmir(boolean morceauRune) {
        super("Bergelmir", morceauRune);
        super.setCheminImage("/yggdrasil/vue/bergelmir.png");
    }

    @Override
    public void desactiver() {
        super.setActif(false);
        geantActif=true;
        super.setMorceauRune(true);
    }

    @Override
    public void activer() {
        super.setActif(true);
        geantActif=false;
    }

    
    
}
