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
    }
    
    @Override
    public void desactiver() {
        rdf.setActif(true);
    }
    
    @Override
    public void activer() {
        rdf.setActif(false);
    }
}
