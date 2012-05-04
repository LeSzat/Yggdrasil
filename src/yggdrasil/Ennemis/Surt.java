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
import yggdrasil.Monde.RoyaumeDuFeu;
import yggdrasil.Pion.GeantDeFeu;
import yggdrasil.Pion.Pion;
import yggdrasil.Sac;

/**
 * Modélise l'ennemi Surt
 */
public class Surt extends Ennemis {

    private De de;

    public Surt(De de) {
        super.setNom("Surt");
        this.de = de;
    }

    /**
     * Effet de Surt
     *
     * @param tabSacs la tableau des sacs
     * @param rdf Le Monde Royaume du feu
     * @param page JFrame principale
     * @param deus Le dieu actuel
     */
    public void action(Sac[] tabSacs, RoyaumeDuFeu rdf, JFrame page, Dieu deus) {
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
        JOptionPane.showMessageDialog(page, "Surt a retiré " + nb + " géant de feu du Royaume du feu, il les a mis dans le sac " + s.getCouleur().toLowerCase() + ".", "Effet de Surt", JOptionPane.INFORMATION_MESSAGE);
    }
}
