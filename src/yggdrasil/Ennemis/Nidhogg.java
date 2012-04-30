/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mathias
 */
public class Nidhogg extends Ennemis {

    public Nidhogg() {
        super.setNom("Nidhogg");
    }

    public void action(Ennemis[] lEnnemis,JFrame page) {
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
        JOptionPane.showMessageDialog(page, "Nidögg vient de faire avancer "+lEnnemis[ind].getNom(), "Effet de Nidhögg", JOptionPane.INFORMATION_MESSAGE);
    }
}
