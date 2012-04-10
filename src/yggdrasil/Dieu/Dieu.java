/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

import java.util.ArrayList;
import java.util.Scanner;
import yggdrasil.Artefact;
import yggdrasil.De;
import yggdrasil.Elfes;
import yggdrasil.Ennemis.Ennemis;
import yggdrasil.Monde.Asgard;
import yggdrasil.Pion.Vikings;

/**
 *
 * @author mathias
 */
public abstract class Dieu {

    private ArrayList<Vikings> lVikings;
    private ArrayList<Elfes> lElfes;
    private ArrayList<Artefact> lArtefact;

    protected Dieu() {
        lVikings = new ArrayList<>();
        lElfes = new ArrayList<>();
        lArtefact = new ArrayList<>();
    }

    public void jouerEnAsgard(Ennemis en, De de) {
        System.out.println(en.getClass());
        Asgard as = new Asgard(this, en);
        if (lVikings.size() > 0) {
            int nbVikaSac;
            System.out.println("Combien de vic a sacr val entre 0 et " + lVikings.size());
            Scanner sc = new Scanner(System.in);
            nbVikaSac = sc.nextInt();
            as.ajoutViking(nbVikaSac);
            for (int i = 0; i < nbVikaSac; i++) {
                lVikings.remove(i);
            }
        } else {
            System.out.println("Vous n'avez pas de vikings à sacrifier");
        }

        int det = de.getValeur();
        as.ajoutValDe(det);
        System.out.println(det);
        System.out.println("vous avez une force de " + as.getForceDieu() + " votre ennemi a une forece de " + as.getForceEnnemi());
        System.out.println();

        if (lElfes.size() > 0) {
            int nbElfes;
            System.out.println("Combien de elfs a sacr val entre 0 et " + lElfes.size());
            Scanner sc = new Scanner(System.in);
            nbElfes = sc.nextInt();
            as.ajouterElfes(nbElfes);
            for (int i = 0; i < nbElfes; i++) {
                lElfes.remove(i);
            }
        }
        
        if (as.getForceDieu() >= as.getForceEnnemi()) {
            System.out.println("Vous avez gagné!!");
            if (en.getPosition() > 1) {
                en.reculer(1);
            } else {
                System.out.println("Votre ennemi était sur la case départ il ne peux pas reculer");
            }
        } else {
            System.out.println("Vous avez perdu!");
        }

    }

    public void jouerEnMidgard() {
    }

    public void jouerEnForgeDesNains() {
    }

    public void jouerEnDemeureDesElfes() {
    }

    public void jouerMondeDesTenebres() {
    }

    public void jouerEnDomaineDesMorts() {
    }

    public void jouerEnRoyaumeDuFeu() {
    }

    public void jouerEnForteresseDeGlace() {
    }

    public void jouerEnTerreBenite() {
    }

    public ArrayList<Artefact> getlArtefact() {
        return lArtefact;
    }

    public ArrayList<Elfes> getlElfes() {
        return lElfes;
    }
}
