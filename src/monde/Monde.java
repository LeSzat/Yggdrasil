/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

/**
 * Classe abstraite, mère de tous les mondes du jeu
 */
public abstract class Monde {

    /**
     * Vrai si le Dieu peut accéder à ce monde, faux sinon
     */
    private boolean actif;

    protected Monde() {
        actif = true;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
}
