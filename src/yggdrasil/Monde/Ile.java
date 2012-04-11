/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

/**
 *
 * @author mathias
 */
public class Ile {
    private String couleur;
    private boolean submergee;

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
