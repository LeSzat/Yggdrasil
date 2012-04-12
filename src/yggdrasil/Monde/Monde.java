/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

/**
 *
 * @author mathias
 */
public abstract class Monde {

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
