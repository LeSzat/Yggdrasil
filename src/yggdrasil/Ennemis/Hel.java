/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.De;
import yggdrasil.Dieu.Dieu;
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

    public void action(Sac[] tabSacs, DomaineDesMorts ddm, JFrame page,Dieu deus) {
        this.avancer(1);
        int k = 0;
        int nb = 0;
        int val;
        
         if ("Tyr".equals(deus.getNom())) {
            int det1 = de.getCouleur();
            int det2 = de.getCouleur();

            String[] choix1 = {tabSacs[det1].getCouleur(),tabSacs[det2].getCouleur()};
            JOptionPane jop1 = new JOptionPane();
            int rang1 = JOptionPane.showOptionDialog(page,
                    "Quelle couleur du dé choisissez vous?",
                    "Avantage Tyr",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choix1,
                    choix1[0]);
            if (rang1 == 0) {
                val = det1;
            } else {
                val = det2;
            }
        } else {
            val = de.getValeur();
        }
        
        Sac s = tabSacs[val];
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
