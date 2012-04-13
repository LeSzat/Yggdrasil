/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.Random;

/**
 *
 * @author mathias
 */
public class De {

    private Face[] face;
    private boolean actif;

    public De() {
        face = new Face[6];
        face[0] = new Face("Blanc", 0);
        face[1] = new Face("Blanc", 0);
        face[2] = new Face("Bleu", 1);
        face[3] = new Face("Bleu", 1);
        face[4] = new Face("Vert", 2);
        face[5] = new Face("Noir", 3);
        actif = true;
    }

    public int getValeur() {
        Random r = new Random();
        int t1 = -1;
        do {
             t1 = r.nextInt(6) - 1;
        }
        while(t1<0 && t1>5);
        return face[t1].getVal();
    }

    public String getCouleur() {
        Random r = new Random();
        int t1 = r.nextInt(6) - 1;
        return face[t1].getCouleur();
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
    
    
    
}
