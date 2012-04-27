/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.Artefact;
import yggdrasil.De;
import yggdrasil.Elfes;
import yggdrasil.Ennemis.Ennemis;
import yggdrasil.Monde.*;
import yggdrasil.Pion.Vikings;
import yggdrasil.Sac;
import yggdrasil.vue.ChoixArtefact;

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
    private String cheminImage;
    private int partieRestanteAjouer;

    protected Dieu() {
        lVikings = new ArrayList<>();
        lElfes = new ArrayList<>();
        lArtefact = new HashMap<>();
        sc = new Scanner(System.in);
        partieRestanteAjouer = 3;
    }

    public void jouerEnAsgard(Ennemis en, De de, DemeureDesElfes dde, DomaineDesMorts ddm, ForgeDesNains fdn, JFrame page) {
        Asgard as = new Asgard(this, en);
        partieRestanteAjouer--;
        if (!lVikings.isEmpty()) {

            int taille = lVikings.size();
            String[] choixNbVikings = new String[taille + 1];
            for (int i = 0; i <= taille; i++) {
                choixNbVikings[i] = Integer.toString(i);
            }
            JOptionPane jop = new JOptionPane();
            String nbVikaSa = (String) JOptionPane.showInputDialog(page,
                    "Combien de vikings voulez vous sacrifier",
                    "Asgard",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choixNbVikings,
                    choixNbVikings[0]);
            int nbVikaSac = Integer.parseInt(nbVikaSa);
            as.ajoutViking(nbVikaSac);
            for (int i = 0; i < nbVikaSac; i++) {
                lVikings.remove(0);
            }
            ddm.ajouterVikings(nbVikaSac);
        } else {
            JOptionPane.showMessageDialog(page, "Vous n'avez pas de Viking à sacrifier", "Asgard",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        if (!lArtefact.containsKey(en.getNom() + 1) && !lArtefact.containsKey(en.getNom() + 2) && !lArtefact.containsKey(en.getNom() + 3)) {
            JOptionPane.showMessageDialog(page, "Vous n'avez pas d'artefact pour cet ennemi", "Asgard",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            Iterator it = lArtefact.values().iterator();
            Artefact a = null;
            int rep = -1;
            while (it.hasNext()) {
                a = (Artefact) it.next();
                if (a.getEnnemi().compareTo(en.getNom()) == 0) {
                    rep = JOptionPane.showConfirmDialog(page, "Voulez vous utiliser l'artefact " + a.getNom() + " de niveau " + a.getNiveau(), "Asgard",
                            JOptionPane.YES_NO_OPTION);
                    if (rep == JOptionPane.YES_OPTION) {
                        as.ajoutArtefact(a);
                        fdn.remettre(this, a);
                    }
                }
            }
        }
        int det = de.getValeur();

        as.ajoutValDe(det);

        JOptionPane.showMessageDialog(page, "La valeur du dé est de " + det, "Asgard", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(page, "vous avez une force de " + as.getForceDieu() + " votre ennemi a une force de " + as.getForceEnnemi(), "Asgard", JOptionPane.INFORMATION_MESSAGE);

        if (!lElfes.isEmpty()) {
            int nbElfes;
            int taille = lElfes.size();
            String[] choixNbElfes = new String[taille + 1];
            for (int i = 0; i <= taille; i++) {
                choixNbElfes[i] = Integer.toString(i);
            }
            JOptionPane jop = new JOptionPane();
            String nbVikaSa = (String) JOptionPane.showInputDialog(page,
                    "Combien de vikings voulez vous sacrifier",
                    "Asgard",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choixNbElfes,
                    choixNbElfes[0]);
            nbElfes = Integer.parseInt(nbVikaSa);
            as.ajouterElfes(nbElfes);
            dde.remettreElfes(this, nbElfes);
        }

        if (as.getForceDieu() >= as.getForceEnnemi()) {
            JOptionPane.showMessageDialog(page, "Vous avez gagné votre ennemi recule d'une case", "Asgard", JOptionPane.INFORMATION_MESSAGE);
            if (en.getPosition() > 1) {
                en.reculer(1);
            } else {
                JOptionPane.showMessageDialog(page, "Votre ennemi était sur la case départ il ne peux pas reculer", "Asgard", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(page, "Vous avez perdu!", "Asgard", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void jouerEnForgeDesNains(ForgeDesNains fdn, JFrame page) {
        int i = 0;
        Artefact a;
        HashMap<Integer, Artefact> liste = new HashMap<>();
        Iterator it = fdn.getlArtefact().values().iterator();
        while (it.hasNext()) {
            a = (Artefact) it.next();
            if (a.getNiveau() == 1 && !lArtefact.containsKey(a.getEnnemi() + (a.getNiveau() + 1)) && !lArtefact.containsKey(a.getEnnemi() + (a.getNiveau() + 2))) {
                liste.put(i, a);
                i++;
            } else if (lArtefact.containsKey(a.getEnnemi() + 1) && a.getNiveau() == 2) {
                liste.put(i, a);
                i++;
            } else if (lArtefact.containsKey(a.getEnnemi() + 2) && a.getNiveau() == 3) {
                liste.put(i, a);
                i++;
            }
        }
        ChoixArtefact ca = new ChoixArtefact(page, true, liste);
        ca.setLocationRelativeTo(page);
        ca.setVisible(true);

        int choix = ca.getChoix();
        if (choix > -1) {
            partieRestanteAjouer--;
            if (liste.get(choix).getNiveau() == 1) {
                fdn.prendre(this, liste.get(choix));
            } else {
                fdn.prendre(this, liste.get(choix));
                fdn.remettre(this, lArtefact.get(liste.get(choix).getEnnemi() + (liste.get(choix).getNiveau() - 1)));
            }
        }
    }

    public void jouerEnDemeureDesElfes(ArrayList<Elfes> lelfes, JFrame page) {
        if (!lelfes.isEmpty()) {
            int reponse = JOptionPane.showConfirmDialog(page,
                    "Il reste " + Integer.toString(lelfes.size()) + " elfe(s). Voulez-vous en prendre 1?",
                    "Demeure des elfes",
                    JOptionPane.YES_NO_OPTION);
            if (reponse == JOptionPane.YES_OPTION) {
                partieRestanteAjouer--;
                lelfes.remove(0);
                lElfes.add(new Elfes());
            }
        } else {
            JOptionPane.showMessageDialog(page, "IL n'y a plus d'elfes, vous ne pouvez pas jouer la demaure des elfes", "Dommage", JOptionPane.WARNING_MESSAGE);
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
                    for (int i = 0; i < nbVikings; i++) {
                        lVikings.add(new Vikings());
                        deus.getlVikings().remove(0);
                    }
                }
            } else {
                fin = true;
            }
        }
    }

    public void jouerEnRoyaumeDuFeu(JFrame page, Sac sac, RoyaumeDuFeu rdf) {
        partieRestanteAjouer--;
        String message = "";
        int nbVik = 0;
        int nbGean = 0;
        for (int j = 0; j < 5 && sac.getlPion().size() > 0; j++) {
            Random r = new Random();
            int t1 = r.nextInt(sac.getlPion().size()) - 1;
            if (t1 < 0) {
                t1 = 0;
            }
            if ((sac.getlPion().get(t1)).toString().compareTo("Geant de feu") == 0) {
                nbGean++;
                rdf.deposer(1);
                sac.getlPion().remove(t1);
            } else {
                nbVik++;
            }
        }
        JOptionPane.showMessageDialog(page, "Vous avez tirez " + nbVik + " Vikings et " + nbGean + " géants de feu. Les géant ont été placés dans le royaume du feu. Les vikings ont été remis dans le sac " + sac.getCouleur().toString().toLowerCase(), "Royaume de feu",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void jouerEnForteresseDeGlace() {
    }

    public void jouerEnMidgard(JFrame page, Midgard mg, Sac[] tabSac) {
        Ile[] tabIle = mg.getTabIle();
        partieRestanteAjouer--;
        int rep = JOptionPane.showConfirmDialog(page, "La Valkyrie est sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " voulez vous le bouger?", "Midgard",
                JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (mg.getValkyrie().getPosition() == 0) {
                mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() + 1);
                JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                page.validate();
            } else if (mg.getValkyrie().getPosition() == 4) {
                mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() - 1);
                JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                page.validate();
            } else {
                String[] ileChoix = {tabIle[mg.getValkyrie().getPosition() - 1].getCouleur(), tabIle[mg.getValkyrie().getPosition() + 1].getCouleur()};
                JOptionPane jop = new JOptionPane();
                int rang = JOptionPane.showOptionDialog(page,
                        "Sur quelle île voulez-vous aller?",
                        "Midgard",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        ileChoix,
                        ileChoix[ileChoix.length - 1]);
                if (rang == 0) {
                    mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() - 1);
                    JOptionPane.showMessageDialog(page, "La Valkyrie mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                } else if (rang == 1) {
                    mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() + 1);
                    JOptionPane.showMessageDialog(page, "La Valkyrie mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                }
                page.validate();

            }
        }

        if (mg.getValkyrie().getPosition() == 0) {
            JOptionPane.showMessageDialog(page, "La Valkyrie est  sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " vous ne pouvez pas sauver de vikings sur cette île", "Midgard", JOptionPane.INFORMATION_MESSAGE);
        } else if (tabIle[mg.getValkyrie().getPosition()].isSubmergee()) {
            if (mg.getValkyrie().getPosition() == 0) {
                JOptionPane.showMessageDialog(page, "L'île" + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " est submérgée, vous ne pouvez pas aller chercher des âmes", "Midgard", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            int NbViking = 0;
            int NbGeant = 0;
            for (int j = 0; j < 3 && !tabSac[mg.getValkyrie().getPosition() - 1].getlPion().isEmpty(); j++) {
                Random r = new Random();
                int t1 = r.nextInt(tabSac[mg.getValkyrie().getPosition() - 1].getlPion().size()) - 1;
                if (t1 < 0) {
                    t1 = 0;
                }
                if ((tabSac[mg.getValkyrie().getPosition() - 1].getlPion().get(t1)).toString().compareTo("Vikings") == 0) {
                    this.getlVikings().add(new Vikings());
                    tabSac[mg.getValkyrie().getPosition() - 1].getlPion().remove(t1);
                    NbViking++;
                } else {
                    NbGeant++;
                }
            }
            JOptionPane.showMessageDialog(page, "Vous avez tirez " + NbViking + " vikings et " + NbGeant + " géants de feu. Vous avez récupéré les Vikings. Les géants de feu ont été remis dans le sac " + tabSac[mg.getValkyrie().getPosition() - 1].getCouleur().toString().toLowerCase(), "Royaume de feu",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void jouerEnDomaineDesMort(JFrame page, Sac sac, DomaineDesMorts dm) {
        partieRestanteAjouer--;
        int nbViking = dm.getlViking().size();
        int nbVikRet = 0;
        for (int j = 0; j < nbViking && j < 5; j++) {
            sac.getlPion().add(new Vikings());
            dm.retirerViking();
            nbVikRet++;
        }
        JOptionPane.showMessageDialog(page, "Vous venez d'ajouter " + nbVikRet + " vikings dans le sac " + sac.getCouleur().toString().toLowerCase(), "Domaine des morts",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void jouerEnTerreBenite(TerreBenite tb, Midgard mg, DomaineDesMorts ddm, ArrayList<String> pileCarteEnnemis, Ennemis[] tabEnnemis, ForteresseDeGlace fdg) {
        System.out.println("Voulez-vous avancer ou utiliser Vane? 1 ou 2");
        int choix = sc.nextInt();
        if (choix == 1) {
            tb.avancerVane();
        } else if (choix == 2) {
            int position = tb.getVanePostion();
            System.out.println(position);

            switch (position) {
                case 1:
                    Ile[] tabIle = mg.getTabIle();
                    System.out.println("Vane est sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur() + " voulez vous le bouger? o/n");
                    System.out.println("1 - avancer");
                    System.out.println("2 - reculer");
                    int choix1 = sc.nextInt();
                    if (choix1 == 1) {
                        mg.bougerValkyrie(1);
                    } else {
                        mg.bougerValkyrie(-1);
                    }
                    System.out.println("Vane est maintenant sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur());
                    tb.reset();
                    break;
                case 2:
                    if (ddm.getlViking().size() > 0) {
                        ddm.retirerViking();
                        lVikings.add(new Vikings());
                    }
                    if (ddm.getlViking().size() > 0) {
                        ddm.retirerViking();
                        lVikings.add(new Vikings());
                    }
                    tb.reset();
                    break;
                case 3:
                    System.out.println("1 - " + pileCarteEnnemis.get(0));
                    System.out.println("2 - " + pileCarteEnnemis.get(1));
                    System.out.println("3 - " + pileCarteEnnemis.get(2));
                    System.out.println("4 - " + pileCarteEnnemis.get(3));
                    System.out.println("5 - " + pileCarteEnnemis.get(4));
                    System.out.println("6 - " + pileCarteEnnemis.get(5));
                    String[] pe = new String[6];
                    for (int i = 0; i < 6; i++) {
                        pe[i] = pileCarteEnnemis.get(0);
                        pileCarteEnnemis.remove(0);
                    }
                    for (int i = 0; i < 6; i++) {
                        System.out.println("Position : " + (i + 1));
                        int choix2 = sc.nextInt();
                        pileCarteEnnemis.add(i, pe[choix2 - 1]);
                    }
                    System.out.println("1 - " + pileCarteEnnemis.get(0));
                    System.out.println("2 - " + pileCarteEnnemis.get(1));
                    System.out.println("3 - " + pileCarteEnnemis.get(2));
                    System.out.println("4 - " + pileCarteEnnemis.get(3));
                    System.out.println("5 - " + pileCarteEnnemis.get(4));
                    System.out.println("6 - " + pileCarteEnnemis.get(5));
                    tb.reset();
                    break;
                case 4:
                    System.out.println("Quel dieu voulez vous faire reculer?");
                    for (int i = 0; i < tabEnnemis.length; i++) {
                        System.out.println((i + 1) + " - " + tabEnnemis[i]);
                        int choix2 = sc.nextInt();
                        tabEnnemis[choix2 - 1].reculer(1);
                    }
                    tb.reset();
                    break;
                case 5:
                    tb.reset();
                    break;
            }
        }
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

    public String getCheminImage() {
        return cheminImage;
    }

    public void setCheminImage(String cheminImage) {
        this.cheminImage = cheminImage;
    }

    public int getPartieRestanteAjouer() {
        return partieRestanteAjouer;
    }

    public void setPartieRestanteAjouer(int partieRestanteAjouer) {
        this.partieRestanteAjouer = partieRestanteAjouer;
    }
}
