/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public abstract class GeantDeGivre {
    private String nom;
    private String nomRune;
    private boolean actif;
    private String cheminImage;
    private int force;

    public GeantDeGivre(String nom, String nomRune) {
        this.nom = nom;
        this.nomRune = nomRune;
        force=3;
    }

    public abstract void desactiver();
    public abstract void activer();

    public boolean isActif() {
        return actif;
    }

   

    public String getNom() {
        return nom;
    }

    public String getNomRune() {
        return nomRune;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

   
    public String getCheminImage() {
        return cheminImage;
    }

    public void setCheminImage(String cheminImage) {
        this.cheminImage = cheminImage;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
    
    @Override
    public String toString()
    {
        return nom+" "+nomRune;
    }
}
