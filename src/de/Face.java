/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de;

/**
 * Modélise une face du dé d'Yggdrasil
 */
public class Face {

    /**
     * Couleur de la face
     */
    private String couleur;
    /**
     *
     * valeur de la face
     */
    private int val;

    /**
     *
     * @param couleur couleur de la face
     * @param val valeur de la face
     */
    public Face(String couleur, int val) {
        this.couleur = couleur;
        this.val = val;
    }

    /**
     *
     * @return la couleur de la face
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     *
     * @return la valeur de la face
     */
    public int getVal() {
        return val;
    }
}
