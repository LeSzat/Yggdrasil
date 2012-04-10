/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

/**
 *
 * @author mathias
 */
public class Face {

   
    private String couleur;
    private int val;
    
     public Face(String couleur, int val) {
        this.couleur = couleur;
        this.val = val;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
     
    
    
    
}
