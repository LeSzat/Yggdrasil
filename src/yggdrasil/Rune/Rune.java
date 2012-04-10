/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Rune;

/**
 *
 * @author mathias
 */
public abstract class Rune {
    private String nom;
    private boolean actif;
    
    public Rune(String nom)
    {
        this.nom = nom;
        this.actif=false;
    }
    @Override
    public String toString()
    {
        return "Rune : "+nom;
    }

    public boolean isActif() {
        return actif;
    }

    public String getNom() {
        return nom;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
    
    
}
