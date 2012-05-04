/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de;

import java.util.Random;

/**
 * Modélise le dé d'Yggdrasil
 */
public class De {

    /**
     * Tableau des 6 faces du dé
     */
    private Face[] face;
    /**
     * Définit si le dé a été bloqué par un géant de givre
     */
    private boolean actif;

    public De() {
        face = new Face[6];
        face[0] = new Face("Blanc", 0);
        face[1] = new Face("Blanc", 0);
        face[2] = new Face("Bleu", 1);
        face[3] = new Face("Bleu", 1);
        face[4] = new Face("Vert", 2);
        face[5] = new Face("Noir", 3);
        actif = true;
    }

    /**
     * Donne une face aléatoirement
     *
     * @return la valeur correspondant à la face
     */
    public int getValeur() {

        Random r = new Random();
        int t1 = 0;

        do {
            t1 = r.nextInt(6);
        } while (t1 < 0 || t1 > 5);
        System.out.println(t1);

        return face[t1].getVal();
    }

    /**
     * Donne une face aléatoirement
     *
     * @return l'index de la couleur correspondant à la face
     */
    public int getCouleur() {
        Random r = new Random();
        int t1 = r.nextInt(6);
        switch (t1) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            default:
                return getCouleur();
        }
    }

    /**
     *
     * @return la valeur de actif
     */
    public boolean isActif() {
        return actif;
    }

    /**
     * change la valeur de actif
     *
     * @param actif
     */
    public void setActif(boolean actif) {
        this.actif = actif;
    }
}
