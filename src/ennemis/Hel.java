/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ennemis;

import de.De;
import dieu.Dieu;
import iles.Sac;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import monde.DomaineDesMorts;
import pion.Pion;
import pion.Vikings;

/**
 * Modléise l'ennemi Hel
 */
public class Hel extends Ennemis {

    /**
     * Le dé
     */
    private De de;

    public Hel(De de) {
        super.setNom("Hel");
        this.de = de;
    }

    /**
     * Effet de Hel
     *
     * @param tabSacs le tableau contenant les sacs
     * @param ddm Le monde Domaine des morts
     * @param page JFrame principale
     * @param deus Le dieu actuel
     */
    public void action(Sac[] tabSacs, DomaineDesMorts ddm, JFrame page, Dieu deus) {
        this.avancer(1);
        int k = 0;
        int nb = 0;
        int val;

        if ("Tyr".equals(deus.getNom())) {
            int det1 = de.getCouleur();
            int det2 = de.getCouleur();

            String[] choix1 = {tabSacs[det1].getCouleur(), tabSacs[det2].getCouleur()};
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
