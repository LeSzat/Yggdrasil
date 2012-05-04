/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import artefact.Artefact;
import dieu.Dieu;
import ennemis.Ennemis;

/**
 * Modélise le monde Asgard
 */
public class Asgard extends Monde {

    /**
     * L'ennemi du combat
     */
    private Ennemis ennemis;
    /**
     * La force du dieu
     */
    private int forceDieu;
    /**
     * La force de l'ennemi
     */
    private int forceEnnemi;

    /**
     * Fonction à appeler lors du jeu en Asgard
     *
     * @param deus Le dieu qui combat
     * @param ennemis L'ennemi à combattre
     */
    public void commencerCombat(Dieu deus, Ennemis ennemis) {
        this.ennemis = ennemis;
        this.forceDieu = deus.getFORCEINITIALE();
        this.forceEnnemi = setForceEnnemi();
    }

    /**
     * Ajoute le nombre de vikings sacrifiés à la force du dieu
     *
     * @param NbVikingSac Nombre de vikings à sacrifier
     */
    public void ajoutViking(int NbVikingSac) {
        this.forceDieu += NbVikingSac;
    }

    /**
     * Ajoute la valeur du dé à la force du dieu
     *
     * @param val Valeur de la face du dé
     */
    public void ajoutValDe(int val) {
        this.forceDieu += val;
    }

    /**
     *
     * @return la force de l'ennemi
     */
    private int setForceEnnemi() {
        return ennemis.getForce();

    }

    /**
     * Ajoute la force de l'artefact utilisé
     *
     * @param ar L'artefact utilisé
     */
    public void ajoutArtefact(Artefact ar) {
        this.forceDieu += ar.getNiveau();
    }

    /**
     * Ajoute le nombre d'elfes sacrifier
     *
     * @param i le nombre d'elfes sacrifiés
     */
    public void ajouterElfes(int i) {
        this.forceDieu += i;
    }

    public int getForceDieu() {
        return forceDieu;
    }

    public int getForceEnnemi() {
        return forceEnnemi;
    }
}
