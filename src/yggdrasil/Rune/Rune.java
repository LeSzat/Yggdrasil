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
    
    public Rune(String nom)
    {
        this.nom = nom;;
    }
    @Override
    public String toString()
    {
        return nom;
    }

    public String getNom() {
        return nom;
    }

}
