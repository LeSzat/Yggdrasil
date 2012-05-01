/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import yggdrasil.Artefact;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.Ennemis;

/**
 *
 * @author mathias
 */
public class Asgard extends Monde {

    private Ennemis ennemis;
    private int forceDieu;
    private int forceEnnemi;

    public void commencerCombat(Dieu deus, Ennemis ennemis) {
        this.ennemis = ennemis;
        this.forceDieu = deus.getFORCEINITIALE();
        this.forceEnnemi = setForceEnnemi();
    }

    public void ajoutViking(int NbVikingSac) {
        this.forceDieu += NbVikingSac;
    }

    public void ajoutValDe(int val) {
        this.forceDieu += val;
    }

    private int setForceEnnemi() {
        int pos = ennemis.getPosition();
        if (!ennemis.isGeantActif()) {
            if (pos < 3) {
                return 5;
            } else if (pos < 5) {
                return 6;
            } else if (pos < 8) {
                return 7;
            } else {
                return 8;
            }
        }
        else{
            if (pos < 3) {
                return 6;
            } else if (pos < 5) {
                return 7;
            } else if (pos < 8) {
                return 8;
            } else {
                return 9;
            }
        }
            
    }

    public void ajoutArtefact(Artefact ar) {
        this.forceDieu += ar.getNiveau();
    }

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
