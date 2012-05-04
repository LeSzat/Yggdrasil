/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.De;
import yggdrasil.Dieu.Dieu;

/**
 * Modélise l'ennemi Fenrir
 */
public class Fenrir extends Ennemis {

    private boolean calmer;
    private De de;

    public Fenrir(De de) {
        super.setNom("Fenrir");
        calmer = true;
        this.de = de;

    }

    /**
     * Initialise l'effet de Fenrir
     *
     * @param page JFrame principale
     */
    public void action(JFrame page) {
        calmer = false;
        JOptionPane.showMessageDialog(page, "Pour calmer fenrir vous devez faire 0 si sa puissance est de 3, 0 ou 1 si sa puissance est de 2 ou 0,1 ou 2 si sa puissance est de 3", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Cette fonction sert à calmer Fenrir
     *
     * @param page
     * @param deus
     */
    public void essayerDeCalmer(JFrame page, Dieu deus) {
        int val;
        if ("Tyr".equals(deus.getNom())) {
            int det1 = de.getValeur();
            int det2 = de.getValeur();

            String[] choix1 = {String.valueOf(det1), String.valueOf(det2)};
            JOptionPane jop1 = new JOptionPane();
            int rang1 = JOptionPane.showOptionDialog(page,
                    "Quelle valeur du dé choisissez vous?",
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

        if (super.getPuissance() == 1 && val < 3) {
            calmer = true;
            JOptionPane.showMessageDialog(page, "Vous avez fait " + val + " Fenrir est calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        } else if (super.getPuissance() == 2 && val < 2) {
            calmer = true;
            JOptionPane.showMessageDialog(page, "Vous avez fait " + val + " Fenrir est calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        } else if (super.getPuissance() == 3 && val < 1) {
            calmer = true;
            JOptionPane.showMessageDialog(page, "Vous avez fait " + val + " Fenrir est calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(page, "Vous avez fait " + val + " Fenrir n'est pas calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean isCalmer() {
        return calmer;
    }
}
