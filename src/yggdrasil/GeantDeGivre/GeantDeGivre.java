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
    private boolean battu;

    public GeantDeGivre(String nom, String nomRune) {
        this.nom = nom;
        this.nomRune = nomRune;
    }

    public abstract void desactiver();
    public abstract void activer();

    public boolean isActif() {
        return actif;
    }

    public boolean isBattu() {
        return battu;
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

    public void setBattu(boolean battu) {
        this.battu = battu;
    }
}
