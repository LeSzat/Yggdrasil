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

    protected boolean geantActif;
    private String nom;
    private boolean actif;
    private String cheminImage;
    private boolean morceauRune;

    public GeantDeGivre(String nom, boolean morceauRune) {
        geantActif = true;
        this.nom = nom;
        this.morceauRune = morceauRune;
    }

    public abstract void desactiver();

    public abstract void activer();

    public boolean isActif() {
        return actif;
    }

    

    public String getNom() {
        return nom;
    }

    public boolean isMorceauRune() {
        return morceauRune;
    }

    public void setMorceauRune(boolean morceauRune) {
        this.morceauRune = morceauRune;
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
        if (geantActif) {
            return 3;
        } else {
            return 4;
        }
    }
    
    @Override
    public String toString() {
        return nom;
    }
}
