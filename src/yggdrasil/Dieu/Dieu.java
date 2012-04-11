/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import yggdrasil.Artefact;
import yggdrasil.De;
import yggdrasil.Elfes;
import yggdrasil.Ennemis.Ennemis;
import yggdrasil.Monde.Asgard;
import yggdrasil.Monde.ForgeDesNains;
import yggdrasil.Pion.Vikings;

/**
 *
 * @author mathias
 */
public abstract class Dieu {
    
    private ArrayList<Vikings> lVikings;
    private ArrayList<Elfes> lElfes;
    private HashMap<String, Artefact> lArtefact;
    private Scanner sc;
    
    protected Dieu() {
        lVikings = new ArrayList<>();
        lElfes = new ArrayList<>();
        lArtefact = new HashMap<>();
        sc = new Scanner(System.in);
    }
    
    public void jouerEnAsgard(Ennemis en, De de) {
        System.out.println(en.getClass());
        Asgard as = new Asgard(this, en);
        if (lVikings.size() > 0) {
            int nbVikaSac;
            System.out.println("Combien de vikings voulez vous sacrifier 0 et " + lVikings.size());
            
            nbVikaSac = sc.nextInt();
            as.ajoutViking(nbVikaSac);
            for (int i = 0; i < nbVikaSac; i++) {
                lVikings.remove(0);
            }
        } else {
            System.out.println("Vous n'avez pas de vikings à sacrifier");
        }
        if (!lArtefact.containsKey(en.getNom())) {
            System.out.println("Vous n'avais pas d'artefact pour ce dieu!");
        } else {
            System.out.println("Voulez vous utiliser l'artefact" + lArtefact.get(en.getNom()).getNom());
            String choix = sc.nextLine();
            if (choix.compareTo("o") == 0) {
                as.ajoutArtefact(lArtefact.get(en.getNom()));
                lArtefact.remove(en.getNom());
            }
        }
        int det = de.getValeur();
        as.ajoutValDe(det);
        System.out.println("La valeur du dé est de " + det);
        System.out.println("vous avez une force de " + as.getForceDieu() + " votre ennemi a une forece de " + as.getForceEnnemi());
        System.out.println();
        
        if (lElfes.size() > 0) {
            int nbElfes;
            System.out.println("Combien d'elfes voulez vous sacrifier entre 0 et " + lElfes.size());
            Scanner sc = new Scanner(System.in);
            nbElfes = sc.nextInt();
            as.ajouterElfes(nbElfes);
            for (int i = 0; i < nbElfes; i++) {
                lElfes.remove(0);
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
    
    public void jouerEnForgeDesNains(ForgeDesNains fdn) {
        System.out.println("Liste des artefact disponible");
        int i = 0;
        Artefact a = null;
        HashMap<Integer, Artefact> liste = new HashMap<>();
        Iterator it = fdn.getlArtefact().values().iterator();
        while (it.hasNext()) {
            a = (Artefact) it.next();
            if (a.getNiveau() == 1) {
                System.out.println(i + " - " + a);
                liste.put(i, a);
                i++;
            } else if (lArtefact.containsKey(a.getEnnemi()+1)) {
                System.out.println(i + " - " + a);
                liste.put(i, a);
                i++;
            }
            
        } 
        System.out.println(liste.toString());
        System.out.println("Quel artefact voulez vous?");
        int choix = sc.nextInt();
        System.out.println("Artefact choisi : " +liste.get(choix));
        if (liste.get(choix).getNiveau() == 1) {
            fdn.prendre(this, liste.get(choix));
        } else if (liste.get(choix).getNiveau() == 2) {
            fdn.prendre(this, liste.get(choix));
            System.out.println(lArtefact.get(liste.get(choix).getEnnemi()+1).toString());
            fdn.remettre(this, lArtefact.get(liste.get(choix).getEnnemi()+1));
        }
    }
    
    public void jouerEnDemeureDesElfes() {
    }
    
    public void jouerMondeDesTenebres() {
    }
    
    public void jouerEnRoyaumeDuFeu() {
    }
    
    public void jouerEnForteresseDeGlace() {
    }
    
    public void jouerEnTerreBenite() {
    }
    
    public HashMap<String, Artefact> getlArtefact() {
        return lArtefact;
    }
    
    public ArrayList<Elfes> getlElfes() {
        return lElfes;
    }
    
    public ArrayList<Vikings> getlVikings() {
        return lVikings;
    }
}
