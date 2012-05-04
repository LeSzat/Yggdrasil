/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artefact;

/**
 * Classe qui modéliste les artefacts
 */
public class Artefact {

    /**
     * Nom de l'artefact
     */
    private String nom;
    /**
     * Nom de l'ennemi qu'elle affaiblie
     */
    private String ennemi;
    /**
     * Puissance
     */
    private int niveau;

    public Artefact(String nom, String ennemi, int niveau) {
        this.nom = nom;
        this.ennemi = ennemi;
        this.niveau = niveau;
    }

    /**
     * Permet d'afficher :
     *
     * @return nom+" "+ennemi+" "+niveau
     */
    @Override
    public String toString() {
        return nom + " " + ennemi + " " + niveau;
    }

    /**
     *
     * @return Ennemi
     */
    public String getEnnemi() {
        return ennemi;
    }

    /**
     *
     * @return Niveau
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     *
     * @return Nom
     */
    public String getNom() {
        return nom;
    }
}
