/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.De;

/**
 *
 * @author mathias
 */
public class Fenrir extends Ennemis {

    private boolean calmer;
    private De de;

    public Fenrir(De de) {
        super.setNom("Fenrir");
        calmer = true;
        this.de = de;

    }

    public void action(JFrame page) {
        calmer = false;
        JOptionPane.showMessageDialog(page, "Pour calmer fenrir vous devez faire 0 si sa puissance est de 3, 0 ou 1 si sa puissance est de 2 ou 0,1 ou 2 si sa puissance est de 3", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
    }

    public void essayerDeCalmer(JFrame page) {
        int val = de.getValeur();
        if (super.getPuissance() == 1 && val < 3) {
            calmer = true;
            JOptionPane.showMessageDialog(page, "Vous avez fait "+val+" Fenrir est calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (super.getPuissance() == 2 && val < 2) {
            calmer = true;
            JOptionPane.showMessageDialog(page, "Vous avez fait "+val+" Fenrir est calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (super.getPuissance() == 3 && val < 1) {
            calmer = true;
            JOptionPane.showMessageDialog(page, "Vous avez fait "+val+" Fenrir est calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(page, "Vous avez fait "+val+" Fenrir n'est pas calmé", "Fenrir", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean isCalmer() {
        return calmer;
    }
}
