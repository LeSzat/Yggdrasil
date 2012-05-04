/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dieu;

import iles.Ile;
import iles.Sac;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import monde.Midgard;
import pion.Vikings;

/**
 * Modélise le Dieu Heimdall
 */
public class Heimdall extends Dieu {

    public Heimdall() {
        super.setNom("Heimdall");
        super.setCheminImage("/images/Heimdall.jpg");
    }

    /**
     * Overide de la fonction jouerEnMidgard, car Heimdall a des pouvoirs
     * spéciaux
     *
     * @param page JFrame principale
     * @param mg Le Monde Midgard
     * @param tabSac Le sac dans lequel prendre les vikings
     */
    @Override
    public void jouerEnMidgard(JFrame page, Midgard mg, Sac[] tabSac) {
        if (Dieu.pouvoirDieu) {
            Ile[] tabIle = mg.getTabIle();
            super.setPartieRestanteAjouer(super.getPartieRestanteAjouer() - 1);
            int rep = JOptionPane.showConfirmDialog(page, "La Valkyrie est sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " voulez vous le bouger?", "Midgard",
                    JOptionPane.YES_NO_OPTION);
            if (rep == JOptionPane.YES_OPTION) {
                if (mg.getValkyrie().getPosition() == 0) {
                    mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() + 1);
                    JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                } else if (mg.getValkyrie().getPosition() == 4) {
                    mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() - 1);
                    JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String[] ileChoix = {tabIle[mg.getValkyrie().getPosition() - 1].getCouleur(), tabIle[mg.getValkyrie().getPosition() + 1].getCouleur()};
                    JOptionPane jop = new JOptionPane();
                    int rang = JOptionPane.showOptionDialog(page,
                            "Sur quelle île voulez-vous aller?",
                            "Midgard",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            ileChoix,
                            ileChoix[ileChoix.length - 1]);
                    if (rang == 0) {
                        mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() - 1);
                        JOptionPane.showMessageDialog(page, "La Valkyrie mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                    } else if (rang == 1) {
                        mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() + 1);
                        JOptionPane.showMessageDialog(page, "La Valkyrie mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
            }

            if (mg.getValkyrie().getPosition() == 0) {
                JOptionPane.showMessageDialog(page, "La Valkyrie est  sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " vous ne pouvez pas sauver de vikings sur cette île", "Midgard", JOptionPane.INFORMATION_MESSAGE);
            } else if (tabIle[mg.getValkyrie().getPosition()].isSubmergee()) {
                if (mg.getValkyrie().getPosition() == 0) {
                    JOptionPane.showMessageDialog(page, "L'île" + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " est submérgée, vous ne pouvez pas aller chercher des âmes", "Midgard", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                int NbViking = 0;
                int NbGeant = 0;
                for (int j = 0; j < 4 && !tabSac[mg.getValkyrie().getPosition() - 1].getlPion().isEmpty(); j++) {
                    Random r = new Random();
                    int t1 = r.nextInt(tabSac[mg.getValkyrie().getPosition() - 1].getlPion().size()) - 1;
                    if (t1 < 0) {
                        t1 = 0;
                    }
                    if ((tabSac[mg.getValkyrie().getPosition() - 1].getlPion().get(t1)).toString().compareTo("Vikings") == 0) {
                        this.getlVikings().add(new Vikings());
                        tabSac[mg.getValkyrie().getPosition() - 1].getlPion().remove(t1);
                        NbViking++;
                    } else {
                        NbGeant++;
                    }
                }
                JOptionPane.showMessageDialog(page, "Vous avez tirez " + NbViking + " vikings et " + NbGeant + " géants de feu. Vous avez récupéré les Vikings. Les géants de feu ont été remis dans le sac " + tabSac[mg.getValkyrie().getPosition() - 1].getCouleur().toString().toLowerCase(), "Royaume de feu",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            super.jouerEnMidgard(page, mg, tabSac);
        }
    }
}
