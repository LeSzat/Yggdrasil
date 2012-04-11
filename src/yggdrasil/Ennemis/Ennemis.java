/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

/**
 *
 * @author mathias
 */
public abstract class Ennemis {
    private int position;
    private String nom;
    public Ennemis()
    {
        this.position=1;
    }

    public int getPosition() {
        return position;
    }
    public void reculer(int i){
        position -= i;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
    
}
