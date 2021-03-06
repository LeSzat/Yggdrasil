/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ennemis;

import de.De;
import dieu.Dieu;
import iles.Ile;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import monde.Midgard;

/**
 * Modélise l'ennemi Jormungand
 */
public class Jormungand extends Ennemis {

    /**
     * Le dé
     */
    private De de;

    /**
     * Initialise Jormungand
     *
     * @param de
     */
    public Jormungand(De de) {
        super.setNom("Jormungand");
        this.de = de;
    }

    /**
     * Effet de Jormungand
     *
     * @param mg Le Monde Midgard
     * @param page JFrame principale
     * @param deus Le dieu actuel
     */
    public void action(Midgard mg, JFrame page, Dieu deus) {
        this.avancer(1);
        int k = 0;
        int val;
        Ile[] tabIle = mg.getTabIle();
        for (Ile ile : tabIle) {
            ile.setSubmergee(false);
        }
        if ("Tyr".equals(deus.getNom())) {
            int det1 = de.getCouleur();
            int det2 = de.getCouleur();

            String[] choix1 = {tabIle[det1 + 1].getCouleur(), tabIle[det2 + 1].getCouleur()};
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

        Ile ile = tabIle[val + 1];
        ile.setSubmergee(true);
        mg.getValkyrie().setPosition(0);
        JOptionPane.showMessageDialog(page, "Jormungand vient de submérger l'ile " + ile.getCouleur().toLowerCase(), "Effet de Hel", JOptionPane.INFORMATION_MESSAGE);

    }
}
