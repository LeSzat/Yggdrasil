/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import yggdrasil.Dieu.Dieu;

/**
 *
 * @author mathias
 */
public class Artefact {
    private String nom;
    private String ennemi;
    private int niveau;

    public Artefact(String nom, String ennemi, int niveau) {
        this.nom = nom;
        this.ennemi = ennemi;
        this.niveau = niveau;
    }

    @Override
    public String toString()
    {
       return nom+" "+ennemi+" "+niveau; 
    }
    public String getEnnemi() {
        return ennemi;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getNom() {
        return nom;
    }
    
}
