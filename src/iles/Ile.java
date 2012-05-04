/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iles;

/**
 * Modélise une île
 */
public class Ile {

    /**
     * Couleur de l'ile
     */
    private String couleur;
    /**
     * Vrai si l'ile est submergée
     */
    private boolean submergee;

    /**
     * Initialise une île
     *
     * @param couleur la couleur de l'ile
     */
    public Ile(String couleur) {
        this.couleur = couleur;
        this.submergee = false;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isSubmergee() {
        return submergee;
    }

    public void setSubmergee(boolean submergee) {
        this.submergee = submergee;
    }
}
