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
import yggdrasil.Monde.DemeureDesElfes;
import yggdrasil.Monde.DomaineDesMorts;
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
    private String nom;

    protected Dieu() {
        lVikings = new ArrayList<>();
        lElfes = new ArrayList<>();
        lArtefact = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public void jouerEnAsgard(Ennemis en, De de, DemeureDesElfes dde, DomaineDesMorts ddm, ForgeDesNains fdn) {
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
            ddm.ajouterVikings(nbVikaSac);
        } else {
            System.out.println("Vous n'avez pas de vikings à sacrifier");
        }

        if (!lArtefact.containsKey(en.getNom() + 1) && !lArtefact.containsKey(en.getNom() + 2)) {
            System.out.println("Vous n'avais pas d'artefact pour ce dieu!");
        } else {
            Iterator it = lArtefact.values().iterator();
            Artefact a = null;
            while (it.hasNext()) {
                a = (Artefact) it.next();
                if (a.getEnnemi().compareTo(en.getNom()) == 0) {
                    System.out.println("Voulez vous utiliser l'artefact " + a.getNom());
                }
            }
            int choix = sc.nextInt();
            if (choix == 0) {
                as.ajoutArtefact(a);
                lArtefact.remove(a.getEnnemi() + a.getNiveau());
                fdn.remettre(this, a);
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
            nbElfes = sc.nextInt();
            as.ajouterElfes(nbElfes);
            for (int i = 0; i < nbElfes; i++) {
                lElfes.remove(0);
            }
            dde.remettreElfes(this, nbElfes);
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
        Artefact a;
        HashMap<Integer, Artefact> liste = new HashMap<>();
        Iterator it = fdn.getlArtefact().values().iterator();
        while (it.hasNext()) {
            a = (Artefact) it.next();
            if (a.getNiveau() == 1) {
                System.out.println(i + " - " + a);
                liste.put(i, a);
                i++;
            } else if (lArtefact.containsKey(a.getEnnemi() + 1)) {
                System.out.println(i + " - " + a);
                liste.put(i, a);
                i++;
            }

        }
        System.out.println(liste.toString());
        System.out.println("Quel artefact voulez vous?");
        int choix = sc.nextInt();
        System.out.println("Artefact choisi : " + liste.get(choix));
        if (liste.get(choix).getNiveau() == 1) {
            fdn.prendre(this, liste.get(choix));
        } else if (liste.get(choix).getNiveau() == 2) {
            fdn.prendre(this, liste.get(choix));
            System.out.println(lArtefact.get(liste.get(choix).getEnnemi() + 1).toString());
            fdn.remettre(this, lArtefact.get(liste.get(choix).getEnnemi() + 1));
        }
    }

    public void jouerEnDemeureDesElfes(ArrayList<Elfes> lelfes) {
        if (lelfes.size() > 0) {
            lelfes.remove(0);
            this.lElfes.add(new Elfes());
        } else {
            System.out.println("Il n'y a plus d'elfe dans la demeuredes elfes");
        }
    }

    public void jouerMondeDesTenebres(Dieu deus) {
        boolean fin = false;
        while (!fin) {
            System.out.println("1 - Donner");
            System.out.println("2 - Prendre");
            int choix = sc.nextInt();
            if (choix == 1) {
                System.out.println("1 - Elfe");
                System.out.println("2 - Viking");
                int choix1 = sc.nextInt();
                if (choix1 == 1) {
                    System.out.println("Vous avez " + lElfes.size() + " Elfes");
                    System.out.println("Combien voulez vous en donner?");
                    int nbElfes = sc.nextInt();
                    for (int i = 0; i < nbElfes; i++) {
                        lElfes.remove(0);
                        deus.getlElfes().add(new Elfes());
                    }
                }
                if (choix1 == 2) {
                    System.out.println("Vous avez " + lVikings.size() + " Vikings");
                    System.out.println("Combien voulez vous en donner?");
                    int nbVikings = sc.nextInt();
                    for (int i = 0; i < nbVikings; i++) {
                        lVikings.remove(0);
                        deus.getlVikings().add(new Vikings());
                    }
                }
            } else if (choix == 2) {
                System.out.println("1 - Elfe");
                System.out.println("2 - Viking");
                int choix1 = sc.nextInt();
                if (choix1 == 1) {
                    System.out.println("Il a " + deus.getlElfes().size() + " Elfes");
                    System.out.println("Combien voulez vous en prendre?");
                    int nbElfes = sc.nextInt();
                    for (int i = 0; i < nbElfes; i++) {
                        lElfes.add(new Elfes());
                        deus.getlElfes().remove(0);
                    }
                }
                if (choix1 == 2) {
                    System.out.println("Il a " + lVikings.size() + " Vikings");
                    System.out.println("Combien voulez vous en prendre?");
                    int nbVikings = sc.nextInt();
                    for (int i = 0; i < nbVikings ; i++) {
                        lVikings.add(new Vikings());
                        deus.getlVikings().remove(0);
                    }
                }
            }
            else
                fin=true;
        }
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
