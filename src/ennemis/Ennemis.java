/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ennemis;

/**
 * Modélise les ennemis
 */
public abstract class Ennemis {

    /**
     * Position en Midgard
     */
    private int position;
    /**
     * Nom
     */
    private String nom;
    /**
     * Si le géant de givre pour ce dieu est activé(ça donne +1 lors des
     * combats)
     */
    private boolean geantActif;

    /**
     * Initialise un ennemi
     */
    public Ennemis() {
        this.position = 0;
        geantActif = false;
    }

    public int getPosition() {
        return position;
    }

    /**
     *
     * @return la force pour les combats selon la position de l'ennemi sur
     * Midgard
     */
    public int getForce() {
        if (position < 3) {
            return 5;
        } else if (position < 5) {
            return 6;
        } else if (position < 8) {
            return 7;
        } else {
            return 8;
        }
    }

    /**
     *
     * @return la puissance lors de leurs effets
     */
    public int getPuissance() {
        if (position < 3) {
            return 1;
        } else if (position < 5) {
            return 2;
        } else {
            return 3;
        }
    }

    public void reculer(int i) {
        if (position > 0) {
            position -= i;
        }
    }

    public void avancer(int i) {
        if (i < 7) {
            position += i;
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public boolean isGeantActif() {
        return geantActif;
    }

    public void setGeantActif(boolean geantActif) {
        this.geantActif = geantActif;
    }
}
