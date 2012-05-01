/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.RoyaumeDuFeu;

/**
 *
 * @author mathias
 */
public class Gialp extends GeantDeGivre {

    private RoyaumeDuFeu rdf;

    public Gialp(RoyaumeDuFeu rdf) {
        super("Gialp", "Daeg");
        this.rdf = rdf;
        
        super.setCheminImage("/yggdrasil/vue/gialp.png");
    }
    
    @Override
    public void desactiver() {
        super.setActif(false);
        rdf.setActif(true);
    }
    
    @Override
    public void activer() {
        super.setActif(true);
        rdf.setActif(false);
    }
}
