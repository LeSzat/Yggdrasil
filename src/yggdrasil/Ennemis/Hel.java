/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.De;
import yggdrasil.Monde.DomaineDesMorts;
import yggdrasil.Pion.Pion;
import yggdrasil.Pion.Vikings;
import yggdrasil.Sac;

/**
 *
 * @author mathias
 */
public class Hel extends Ennemis {

    private De de;

    public Hel(De de) {
        super.setNom("Hel");
        this.de = de;
    }

    public void action(Sac[] tabSacs, DomaineDesMorts ddm, JFrame page) {
        this.avancer(1);
        int k = 0;
        int nb = 0;
        Sac s = tabSacs[de.getCouleur()];
        int nbViking = s.getNbVikings();
        while (k < this.getPuissance() && k < nbViking) {
            Iterator it = s.getlPion().iterator();
            Pion p;
            p = (Pion) it.next();
            if (p.toString().compareTo("Vikings") == 0) {
                ddm.getlViking().add((Vikings) p);
                s.getlPion().remove(p);
                nb++;
            }

            k++;
        }
        JOptionPane.showMessageDialog(page, "Hel a retiré " + nb + " Vikings du sac " + s.getCouleur().toLowerCase() + ", il les a envoyés dans le domaine des morts.", "Effet de Hel", JOptionPane.INFORMATION_MESSAGE);
    }
}
