/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import java.util.ArrayList;
import java.util.LinkedList;
import pion.GeantDeFeu;

/**
 * Modélise le monde Royaume du feu
 */
public class RoyaumeDuFeu extends Monde {

    /**
     * Liste des géant de feu contenu dans le royaume du feu
     */
    private LinkedList<GeantDeFeu> lGeantDeFeu;

    /**
     * Initialise le monde Royaume du feu
     */
    public RoyaumeDuFeu() {
        this.lGeantDeFeu = new LinkedList<>();
        for (int i = 0; i < 12; i++) {
            lGeantDeFeu.add(new GeantDeFeu());
        }

    }

    /**
     * Mettre des Géant de feu dans le royaume
     *
     * @param i nombre de géants à ajouter
     */
    public void deposer(int i) {
        for (int j = 0; j < i; j++) {
            lGeantDeFeu.add(new GeantDeFeu());
        }
    }

    public LinkedList<GeantDeFeu> getlGeantDeFeu() {
        return lGeantDeFeu;
    }
}
