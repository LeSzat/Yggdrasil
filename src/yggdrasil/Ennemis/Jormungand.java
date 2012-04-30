/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

    public void action(Midgard mg,JFrame page) {
        this.avancer(1);
        int k = 0;
        int coul = de.getCouleur();
        Ile[] tabIle = mg.getTabIle();
        Ile ile = tabIle[coul+1];
        ile.setSubmergee(true);
        mg.getValkyrie().setPosition(0);
         JOptionPane.showMessageDialog(page, "Jormungand vient de submérger l'ile "+ile.getCouleur().toLowerCase(), "Effet de Hel", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
