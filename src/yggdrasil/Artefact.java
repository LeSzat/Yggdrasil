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
    private String deus;
    private int niveau;

    public Artefact(String nom, String deus, int niveau) {
        this.nom = nom;
        this.deus = deus;
        this.niveau = niveau;
    }

    public String getDeus() {
        return deus;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getNom() {
        return nom;
    }
    
}
