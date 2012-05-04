/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Modélise l'ennemis Nidhogg
 */
public class Nidhogg extends Ennemis {

    public Nidhogg() {
        super.setNom("Nidhogg");
    }

    /**
     * Effet de Nidhogg
     *
     * @param lEnnemis Tableau des ennemis
     * @param page JFrame principale
     */
    public void action(Ennemis[] lEnnemis, JFrame page) {
        this.avancer(1);
        int pos = 100;
        int ind = 100;
        for (int i = 0; i < lEnnemis.length; i++) {
            if (lEnnemis[i].getPosition() < pos) {
                pos = lEnnemis[i].getPosition();
                ind = i;
            }
        }
        lEnnemis[ind].avancer(1);
        JOptionPane.showMessageDialog(page, "Nidögg vient de faire avancer " + lEnnemis[ind].getNom(), "Effet de Nidhögg", JOptionPane.INFORMATION_MESSAGE);
    }
}
