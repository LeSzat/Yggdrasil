/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.GeantDeGivre;

/**
 * Modélise les géants de givre
 */
public abstract class GeantDeGivre {

    /**
     * S'ils ont +1 lors des combats
     */
    protected boolean geantActif;
    /**
     * Son nom
     */
    private String nom;
    /**
     * S'il est actif ou pas
     */
    private boolean actif;
    /**
     * Chemin de l'image
     */
    private String cheminImage;
    /**
     * boolean correspondant à leur morceau de rune
     */
    private boolean morceauRune;

    /**
     * Initialise les géants de givre
     * @param nom Nom du géant
     * @param morceauRune Boolean correspondant à leur morceau de rune
     */
    public GeantDeGivre(String nom, boolean morceauRune) {
        geantActif = true;
        this.nom = nom;
        this.morceauRune = morceauRune;
    }

    /**
     * désactive leurs pouvoirs
     */
    public abstract void desactiver();

    /**
     * active leurs pouvoirs
     */
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
