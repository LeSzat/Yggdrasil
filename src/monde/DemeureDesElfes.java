/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import dieu.Dieu;
import java.util.LinkedList;
import pion.Elfes;

/**
 * Modélise le monde Demeures des elfes
 */
public class DemeureDesElfes extends Monde {

    /**
     * Liste des elfes
     */
    private LinkedList lElfes;

    /**
     * Initialise le monde Demeure des Elfes
     */
    public DemeureDesElfes() {
        lElfes = new LinkedList();
        lElfes.add(new Elfes());
    }

    /**
     * Pour remettre un elfes en Demeure des elfes
     *
     * @param deus Dieu qui sacrifie l'elfes
     */
    public void remettreElfes(Dieu deus) {
        this.lElfes.add(new Elfes());
        deus.getlElfes().remove(0);
    }

    /**
     * Remettre plusieurs elfes dans la Demeure des elfes
     *
     * @param deus le dieu qui s'accrifie l'elfes
     * @param i nombre d'elfes à sacrifier
     */
    public void remettreElfes(Dieu deus, int i) {
        for (int j = 0; j < i; j++) {
            this.lElfes.add(new Elfes());
            deus.getlElfes().remove(0);
        }
    }

    /**
     * Prendre un elfe dans la deumeure des Elfes et le donner à un dieu
     *
     * @param deus le Dieu a qui donner l'elfe
     */
    public void prendreElfes(Dieu deus) {
        if (lElfes.size() > 0) {
            this.lElfes.remove(0);
            deus.getlElfes().add(new Elfes());
        }
    }

    public LinkedList getlElfes() {
        return lElfes;
    }
}
