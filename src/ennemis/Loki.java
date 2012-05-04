/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ennemis;

import monde.ForteresseDeGlace;

/**
 * Modélise l'ennemi Loki
 */
public class Loki extends Ennemis {

    public Loki() {
        super.setNom("Loki");
    }

    /**
     * Effet de Loki
     *
     * @param fdg Le monde Forteresse de glace
     */
    public void action(ForteresseDeGlace fdg) {
        this.avancer(1);
        int i = 0;
        while (this.getPuissance() > i && !fdg.getPileGeantDeGivre().isEmpty()) {
            fdg.piocherCarte();
            i++;
        }
    }
}
