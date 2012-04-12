/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import yggdrasil.Ennemis.Ennemis;
import yggdrasil.Monde.Monde;
import yggdrasil.Rune.Rune;

/**
 *
 * @author mathias
 */
public class GeantDeGivre {
    private String nom;
    private Ennemis ennemis;
    private Monde monde;
    private Rune rune;
    private int morceauRune;
    private boolean actif;
    private boolean battu;

    public Ennemis getEnnemis() {
        return ennemis;
    }

    public Monde getMonde() {
        return monde;
    }

    public int getMorceauRune() {
        return morceauRune;
    }

    public String getNom() {
        return nom;
    }

    public Rune getRune() {
        return rune;
    }

    public boolean isActif() {
        return actif;
    }

    public boolean isBattu() {
        return battu;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public void setBattu(boolean battu) {
        this.battu = battu;
    }
    
}
