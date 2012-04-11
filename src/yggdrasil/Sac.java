/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import yggdrasil.Pion.GeantDeFeu;
import yggdrasil.Pion.Vikings;
import yggdrasil.Pion.Pion;
import java.util.ArrayList;

/**
 *
 * @author mathias
 */
public class Sac {

    private String couleur;
    private ArrayList<Pion> lPion;

    public Sac(String couleur, int nbViking, int nbGeantDeFeu) {
        this.couleur = couleur;
        this.lPion = new ArrayList<>();
        for (int i = 0; i < nbViking; i++) {
            this.lPion.add(new Vikings());
        }
        for (int i = 0; i < nbGeantDeFeu; i++) {
            this.lPion.add(new GeantDeFeu());
        }

    }

    public String getCouleur() {
        return couleur;
    }

    public ArrayList<Pion> getlPion() {
        return lPion;
    }
}
