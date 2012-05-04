/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

import yggdrasil.Monde.RoyaumeDuFeu;

/**
 *Modélise le géant de givre Gialp
 */
public class Gialp extends GeantDeGivre {
    /**
     * Le monde Royaume du feu
     */
    private RoyaumeDuFeu rdf;

    /**
     * Intialise le géant de givre Gialp
     * @param rdf Le Monde Royaume du feu
     * @param morceauRune Le morceau de la rune
     */
    public Gialp(RoyaumeDuFeu rdf, boolean morceauRune) {
        super("Gialp", morceauRune);
        this.rdf = rdf;
        super.setCheminImage("/images/gialp.png");
    }
    /**
     * Désactive Gialp
     */
    @Override
    public void desactiver() {
        super.setActif(false);
        rdf.setActif(true);
        super.setMorceauRune(true);
        
    }
    /**
     * Active Gialp
     */
    @Override
    public void activer() {
        super.setActif(true);
        rdf.setActif(false);
    }
}
