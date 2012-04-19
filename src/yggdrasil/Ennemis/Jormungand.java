/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import yggdrasil.De;
import yggdrasil.Monde.Ile;
import yggdrasil.Monde.Midgard;

/**
 *
 * @author mathias
 */
public class Jormungand extends Ennemis {

    private De de;

    public Jormungand(De de) {
        super.setNom("Jormungand");
        this.de = de;
    }

    public void action(Midgard mg) {
        this.avancer(1);
        int k = 0;
        int coul = de.getCouleur();
        Ile[] tabIle = mg.getTabIle();
        Ile ile = tabIle[coul+1];
        ile.setSubmergee(true);
        mg.getValkyrie().setPosition(0);
        
    }
}
