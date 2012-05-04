/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import yggdrasil.Pion.GeantDeFeu;
import yggdrasil.Pion.Pion;
import yggdrasil.Pion.Vikings;

/**
 *Modélise les sacs
 */
public class Sac {
    /**
     * Couleur du sac
     */
    private String couleur;
    /**
     * Liste des pions
     */
    private ArrayList<Pion> lPion;
/**
 * Constructeur d'un sac
 * @param couleur la couleur du sac
 * @param nbViking le nombre de vikings à mettre dans le sac
 * @param nbGeantDeFeu le nombre de géant de feu à mettre dans le sac
 */
    public Sac(String couleur, int nbViking, int nbGeantDeFeu) {
        this.couleur = couleur;
        this.lPion = new ArrayList<>();
        for (int i = 0; i < nbViking; i++) {
            this.lPion.add(new Vikings());
        }
        for (int i = 0; i < nbGeantDeFeu; i++) {
            this.lPion.add(new GeantDeFeu());
        }
        Collections.shuffle(lPion);

    }
/**
 * 
 * @return la couleur du sac
 */
    public String getCouleur() {
        return couleur;
    }
/**
 * 
 * @return la liste des pions
 */
    public ArrayList<Pion> getlPion() {
        return lPion;
    }
    /**
     * 
     * @return le nombre de vikings contenu dans le sac
     */
    public int getNbVikings()
    {
        Iterator it = lPion.iterator();
        Pion p;
        int nb=0;
        while (it.hasNext()) {
            p = (Pion) it.next();
            if(p.toString().compareTo("Vikings")==0)
                nb++;
        }
        return nb;
    }
    
}
