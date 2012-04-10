/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import yggdrasil.Artefact;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.Ennemis;
import yggdrasil.GeantDeGivre;

/**
 *
 * @author mathias
 */
public class Asgard extends Monde {

    private Dieu deus;
    private Ennemis ennemis;
    private GeantDeGivre gd;
    private int forceDieu;
    private int forceEnnemi;

    public Asgard(Dieu deus, Ennemis ennemis) {
        this.deus = deus;
        this.ennemis = ennemis;
        this.forceDieu = 0;
        this.forceEnnemi = setForceEnnemi();
    }

    public Asgard(Dieu deus, GeantDeGivre gd) {
        this.deus = deus;
        this.gd = gd;
    }

    public void ajoutViking(int NbVikingSac) {
        this.forceDieu += NbVikingSac;
    }
    
    public void ajoutValDe(int val) {
        this.forceDieu += val;
    }

    private int setForceEnnemi() {
        if (gd != null) {
            int pos = ennemis.getPosition();
            if (pos < 3) {
                return 5;
            } else if (pos < 5) {
                return 6;
            } else if (pos < 8) {
                return 7;
            } else {
                return 8;
            }
        } else {
            return 3;
        }
    }

    public void ajoutArtefact(Artefact ar) {
        this.forceEnnemi += ar.getNiveau();
    }

    public void ajouterElfes(int i) {
        this.forceEnnemi += i;
    }

    public int getForceDieu() {
        return forceDieu;
    }

    public int getForceEnnemi() {
        return forceEnnemi;
    }
}
