/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import java.util.LinkedList;
import pion.Vikings;

/**
 * Modélise le monde Domaine des morts
 */
public class DomaineDesMorts extends Monde {

    /**
     * Liste contenant les Vikings
     */
    private LinkedList lViking;

    /**
     * Initialise le monde Domaine des morts
     */
    public DomaineDesMorts() {
        lViking = new LinkedList();
        for (int i = 0; i < 5; i++) {
            lViking.add(new Vikings());
        }
    }

    /**
     * Ajouter un nombre de Vikings à la liste
     *
     * @param i Nombre de vikings à ajouter
     */
    public void ajouterVikings(int i) {
        for (int j = 0; j < i; j++) {
            lViking.add(new Vikings());
        }
    }

    /**
     * Retirer 1 viking
     */
    public void retirerViking() {
        lViking.remove(0);
    }

    public LinkedList getlViking() {
        return lViking;
    }
}
