/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.De;
import yggdrasil.Monde.RoyaumeDuFeu;
import yggdrasil.Pion.GeantDeFeu;
import yggdrasil.Pion.Pion;
import yggdrasil.Sac;

/**
 *
 * @author mathias
 */
public class Surt extends Ennemis {

    private De de;

    public Surt(De de) {
        super.setNom("Surt");
        this.de = de;
    }

    public void action(Sac[] tabSacs, RoyaumeDuFeu rdf, JFrame page) {
        this.avancer(1);
        int k = 0;
        int nb = 0;
        Sac s = tabSacs[de.getCouleur()];
        int nbGeantDeFeu = rdf.getlGeantDeFeu().size();
        while (k < this.getPuissance() && k < nbGeantDeFeu) {
            Iterator it = s.getlPion().iterator();
            Pion p;
            p = (Pion) it.next();
            if (p.toString().compareTo("Geant de feu") == 0) {
                rdf.getlGeantDeFeu().remove(0);
                s.getlPion().add(new GeantDeFeu());
                nb++;
            }
            k++;
        }
        JOptionPane.showMessageDialog(page, "Surt a retiré " + nb + " géant de feu du Royaume du feu, il les a mis dans le sac " + s.getCouleur().toLowerCase()+".", "Effet de Surt", JOptionPane.INFORMATION_MESSAGE);
    }
}
