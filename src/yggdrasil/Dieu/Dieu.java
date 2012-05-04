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
import yggdrasil.GeantDeGivre.GeantDeGivre;
import yggdrasil.Monde.*;
import yggdrasil.Pion.Vikings;
import yggdrasil.Sac;
import yggdrasil.vue.ChoixArtefact;
import yggdrasil.vue.ChoixGeantDeGivre;
import yggdrasil.vue.ChoixOrdreCarteEnnemi;
import yggdrasil.vue.choixEnnemi;

/**
 * Modélise un dieu, c'est dans cette classe que toutes les actions sont faites
 */
public abstract class Dieu {

    /**
     * Nombre de monde que peut fair un dieu
     */
    private final int MAXPARTIE = 3;
    /**
     * Force initiale pour les combats
     */
    private final int FORCEINITIALE = 0;
    /**
     * Liste contenant les vikings du dieux
     */
    private LinkedList<Vikings> lVikings;
    /**
     * Liste contenant les elfes du dieu
     */
    private LinkedList<Elfes> lElfes;
    /**
     * Hashmap contenat les artefact du dieu
     */
    private HashMap<String, Artefact> lArtefact;
    /**
     * Nom du dieu
     */
    private String nom;
    /**
     * Chemin de l'image du dieu
     */
    private String cheminImage;
    /**
     * Nombre de parties restantes du dieu
     */
    private int partieRestanteAjouer;
    /**
     * vrai si le joueur à déjà joué en Midgard
     */
    private boolean aJouerEnMidgard;
    /**
     * vrai si le joueur à déjà joué en Asgard
     */
    private boolean aJouerEnAsgard;
    /**
     * vrai si le joueur à déjà joué en Demeure des elfes
     */
    private boolean aJoueurEnDeumeureDesElfes;
    /**
     * vrai si le joueur à déjà joué en Monde des ténébres
     */
    private boolean aJouerEnMondeDesTenebres;
    /**
     * vrai si le joueur à déjà joué en forge des nains
     */
    private boolean aJouerEnForgeDesNains;
    /**
     * vrai si le joueur à déjà joué en Forteresse de glace
     */
    private boolean aJouerEnForteresseDeGlace;
    /**
     * vrai si le joueur à déjà joué en Royaume du feu
     */
    private boolean aJouerEnRoyaumeDuFeu;
    /**
     * vrai si le joueur à déjà joué en Domaine des morts
     */
    private boolean aJouerEnDomaineDesMorts;
    /**
     * vrai si le joueur à déjà joué en Terre bénite
     */
    private boolean aJouerEnTerreBenite;
    /**
     * vrai si le dieu peut utiliser ses pouvoirs, un géant de givre peut les
     * bloquer
     */
    public static boolean pouvoirDieu;

    /**
     * Initialise un dieu
     */
    protected Dieu() {
        lVikings = new LinkedList();
        lElfes = new LinkedList();
        lArtefact = new HashMap<>();
        partieRestanteAjouer = MAXPARTIE;
        pouvoirDieu = true;
        aJouerEnMidgard = false;
        aJouerEnAsgard = false;
        aJoueurEnDeumeureDesElfes = false;
        aJouerEnMondeDesTenebres = false;
        aJouerEnForgeDesNains = false;
        aJouerEnForteresseDeGlace = false;
        aJouerEnRoyaumeDuFeu = false;
        aJouerEnDomaineDesMorts = false;
        aJouerEnTerreBenite = false;
    }

    /**
     * Remise à zéro des mondes visités
     */
    public void reset() {
        partieRestanteAjouer = MAXPARTIE;
        aJouerEnMidgard = false;
        aJouerEnAsgard = false;
        aJoueurEnDeumeureDesElfes = false;
        aJouerEnMondeDesTenebres = false;
        aJouerEnForgeDesNains = false;
        aJouerEnForteresseDeGlace = false;
        aJouerEnRoyaumeDuFeu = false;
        aJouerEnDomaineDesMorts = false;
        aJouerEnTerreBenite = false;
    }

    /**
     * Modélise l'action de jouer en Asgard
     *
     * @param en Ennemi à combattre
     * @param de Le dé
     * @param dde La monde Demeure des elfes
     * @param ddm Le monde Domaine des mort
     * @param fdn Le monde Forges des nains
     * @param as Le monde Asgard
     * @param page La JFrame principale
     */
    public void jouerEnAsgard(Ennemis en, De de, DemeureDesElfes dde, DomaineDesMorts ddm, ForgeDesNains fdn, Asgard as, JFrame page) {
        as.commencerCombat(this, en);
        partieRestanteAjouer--;
        if (this.getNom().compareTo("Freyja") == 0) {
            Freyja f = (Freyja) this;
            f.setaJouerEnAsgard(f.getaJouerEnAsgard() + 1);
        }
        aJouerEnAsgard = true;

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
            Artefact a;
            int rep;
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
        if (de.isActif()) {
            int det = de.getValeur();
            as.ajoutValDe(det);
            JOptionPane.showMessageDialog(page, "La valeur du dé est de " + det, "Asgard", JOptionPane.INFORMATION_MESSAGE);


        } else {
            JOptionPane.showMessageDialog(page, "Vous ne pouvez pas jeter le dé, il faut battre Thiazy pour pouvour le réutiliser", "Asgard", JOptionPane.INFORMATION_MESSAGE);
        }
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

    /**
     * Modélise l'action de jouer en Forge des nains
     *
     * @param fdn Monde forge des nains
     * @param page Jframe principale
     */
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
            if (this.getNom().compareTo("Freyja") == 0) {
                Freyja f = (Freyja) this;
                f.setaJouerEnForgeDesNains(f.getaJouerEnForgeDesNains() + 1);
            }
            aJouerEnForgeDesNains = true;

            if (liste.get(choix).getNiveau() == 1) {
                fdn.prendre(this, liste.get(choix));
            } else {
                fdn.prendre(this, liste.get(choix));
                fdn.remettre(this, lArtefact.get(liste.get(choix).getEnnemi() + (liste.get(choix).getNiveau() - 1)));
            }
        }
    }

    /**
     * Modélise l'action de jouer en Demeures des elfes
     *
     * @param lelfes Liste des elfes dans le Forge des nains
     * @param page JFrame principale
     */
    public void jouerEnDemeureDesElfes(LinkedList lelfes, JFrame page) {
        if (!lelfes.isEmpty()) {
            int reponse = JOptionPane.showConfirmDialog(page,
                    "Il reste " + Integer.toString(lelfes.size()) + " elfe(s). Voulez-vous en prendre 1?",
                    "Demeure des elfes",
                    JOptionPane.YES_NO_OPTION);
            if (reponse == JOptionPane.YES_OPTION) {
                if (this.getNom().compareTo("Freyja") == 0) {
                    Freyja f = (Freyja) this;
                    f.setaJoueurEnDeumeureDesElfes(f.getaJoueurEnDeumeureDesElfes() + 1);
                }
                aJoueurEnDeumeureDesElfes = true;

                partieRestanteAjouer--;
                lelfes.remove(0);
                lElfes.add(new Elfes());
            }
        } else {
            JOptionPane.showMessageDialog(page, "IL n'y a plus d'elfes, vous ne pouvez pas jouer la demaure des elfes", "Dommage", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * Modélise l'action de jouer dans le Monde des Ténébres
     *
     * @param deus Le dieu à aider
     * @param page JFrame principale
     */
    public void jouerMondeDesTenebres(Dieu deus, JFrame page) {
        boolean fin = false;
        partieRestanteAjouer--;
        if (this.getNom().compareTo("Freyja") == 0) {
            Freyja f = (Freyja) this;
            f.setaJouerEnMondeDesTenebres(f.getaJouerEnMondeDesTenebres() + 1);
        }
        aJouerEnMondeDesTenebres = true;

        while (!fin) {
            String[] choix = {"donner", "prendre", "arrêter"};
            JOptionPane jop = new JOptionPane();
            int rang = JOptionPane.showOptionDialog(page,
                    "Que voulez-vous faire?",
                    "Monde des ténébres",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choix,
                    choix[0]);
            if (rang == 0) {
                String[] choix1 = {"Elfes", "Vikings"};
                JOptionPane jop1 = new JOptionPane();
                int rang1 = JOptionPane.showOptionDialog(page,
                        "Que voulez-vous prendre?",
                        "Monde des ténébres",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        choix1,
                        choix1[0]);
                if (rang1 == 0) {
                    if (!lElfes.isEmpty()) {

                        int taille = lElfes.size();
                        String[] choixNbElfes = new String[taille + 1];
                        for (int i = 0; i <= taille; i++) {
                            choixNbElfes[i] = Integer.toString(i);
                        }
                        JOptionPane jop2 = new JOptionPane();
                        String nbElfes = (String) JOptionPane.showInputDialog(page,
                                "Combien d'elfes voulez-vous donner.",
                                "Monde des ténébres",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                choixNbElfes,
                                choixNbElfes[0]);
                        int nbElfe = Integer.parseInt(nbElfes);

                        for (int i = 0; i < nbElfe; i++) {
                            lElfes.remove(0);
                            deus.getlElfes().add(new Elfes());
                        }
                    } else {
                        JOptionPane.showMessageDialog(page, "Vous n'avez plus d'elfes à donner", "Domaines des ténébres", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (rang1 == 1) {
                    if (!lVikings.isEmpty()) {

                        int taille = lVikings.size();
                        String[] choixNbElfes = new String[taille + 1];
                        for (int i = 0; i <= taille; i++) {
                            choixNbElfes[i] = Integer.toString(i);
                        }
                        JOptionPane jop2 = new JOptionPane();
                        String nbElfes = (String) JOptionPane.showInputDialog(page,
                                "Combien de vikings voulez-vous donner.",
                                "Monde des ténébres",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                choixNbElfes,
                                choixNbElfes[0]);
                        int nbElfe = Integer.parseInt(nbElfes);

                        for (int i = 0; i < nbElfe; i++) {
                            lVikings.remove(0);
                            deus.getlVikings().add(new Vikings());
                        }
                    } else {
                        JOptionPane.showMessageDialog(page, "Vous n'avez plus de vikings à donner", "Domaines des ténébres", JOptionPane.INFORMATION_MESSAGE);
                    }
                }


            }
            if (rang == 1) {
                String[] choix1 = {"Elfes", "Vikings"};
                JOptionPane jop1 = new JOptionPane();
                int rang1 = JOptionPane.showOptionDialog(page,
                        "Que voulez-vous prendre?",
                        "Monde des ténébres",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        choix1,
                        choix1[0]);
                if (rang1 == 0) {
                    if (!deus.getlElfes().isEmpty()) {

                        int taille = deus.getlElfes().size();
                        String[] choixNbElfes = new String[taille + 1];
                        for (int i = 0; i <= taille; i++) {
                            choixNbElfes[i] = Integer.toString(i);
                        }
                        JOptionPane jop2 = new JOptionPane();
                        String nbElfes = (String) JOptionPane.showInputDialog(page,
                                "Combien d'elfes voulez-vous prendre.",
                                "Monde des ténébres",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                choixNbElfes,
                                choixNbElfes[0]);
                        int nbElfe = Integer.parseInt(nbElfes);

                        for (int i = 0; i < nbElfe; i++) {
                            deus.getlElfes().remove(0);
                            lElfes.add(new Elfes());
                        }
                    } else {
                        JOptionPane.showMessageDialog(page, "Il n'a plus d'elfes à donner", "Domaines des ténébres", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (rang1 == 1) {
                    if (!deus.getlVikings().isEmpty()) {

                        int taille = deus.getlVikings().size();
                        String[] choixNbElfes = new String[taille + 1];
                        for (int i = 0; i <= taille; i++) {
                            choixNbElfes[i] = Integer.toString(i);
                        }
                        JOptionPane jop2 = new JOptionPane();
                        String nbElfes = (String) JOptionPane.showInputDialog(page,
                                "Combien de vikings voulez-vous prendre.",
                                "Monde des ténébres",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                choixNbElfes,
                                choixNbElfes[0]);
                        int nbElfe;
                        try {
                            nbElfe = Integer.parseInt(nbElfes);
                        } catch (Exception e) {
                            nbElfe = 0;
                        }

                        for (int i = 0; i < nbElfe; i++) {
                            deus.getlVikings().remove(0);
                            lVikings.add(new Vikings());
                        }
                    } else {
                        JOptionPane.showMessageDialog(page, "Il n'a plus de vikings à donner", "Domaines des ténébres", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else if (rang == 2) {
                fin = true;
            }
        }
    }

    /**
     * Modélise l'action de jouer en Royaume du feu
     *
     * @param page JFrame principale
     * @param sac Sac duquel on enlève les géants de feu
     * @param rdf Le Monde Royaume du feu
     */
    public void jouerEnRoyaumeDuFeu(JFrame page, Sac sac, RoyaumeDuFeu rdf) {
        partieRestanteAjouer--;
        if (this.getNom().compareTo("Freyja") == 0) {
            Freyja f = (Freyja) this;
            f.setaJouerEnRoyaumeDuFeu(f.getaJouerEnRoyaumeDuFeu() + 1);
        }
        aJouerEnRoyaumeDuFeu = true;

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

    /**
     * Modélise l'action de jouer en Forteresse de glace
     *
     * @param deus Dieu, pas this car certain dieu ont besoin de leurs pouvoirs
     * @param gdg Le géant de givre à combattre
     * @param de Le dé
     * @param ddm Le monde Domaine des morts
     * @param dde Le monde Demeure des elfes
     * @param page JFrame principale
     */
    public void jouerEnForteresseDeGlace(Dieu deus, GeantDeGivre gdg, De de, DomaineDesMorts ddm, DemeureDesElfes dde, JFrame page) {

        int forcedieu = deus.getFORCEINITIALE();
        partieRestanteAjouer--;
        if (this.getNom().compareTo("Freyja") == 0) {
            Freyja f = (Freyja) this;
            f.setaJouerEnForteresseDeGlace(f.getaJouerEnForteresseDeGlace() + 1);
        }
        aJouerEnForteresseDeGlace = true;

        if (!lVikings.isEmpty()) {

            int taille = lVikings.size();
            String[] choixNbVikings = new String[taille + 1];
            for (int i = 0; i <= taille; i++) {
                choixNbVikings[i] = Integer.toString(i);
            }
            JOptionPane jop = new JOptionPane();
            String nbVikaSa = (String) JOptionPane.showInputDialog(page,
                    "Combien de vikings voulez vous sacrifier",
                    "Forteresse de glace",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choixNbVikings,
                    choixNbVikings[0]);
            int nbVikaSac = Integer.parseInt(nbVikaSa);
            forcedieu += nbVikaSac;
            for (int i = 0; i < nbVikaSac; i++) {
                lVikings.remove(0);
            }
            ddm.ajouterVikings(nbVikaSac);
        } else {
            JOptionPane.showMessageDialog(page, "Vous n'avez pas de Viking à sacrifier", "Asgard",
                    JOptionPane.INFORMATION_MESSAGE);
        }


        if (de.isActif()) {
            int det = de.getValeur();
            forcedieu += det;
            JOptionPane.showMessageDialog(page, "La valeur du dé est de " + det, "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(page, "Vous ne pouvez pas utiliser le dé. Thiazy l'a bloqué", "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
        }

        JOptionPane.showMessageDialog(page, "vous avez une force de " + forcedieu + " votre ennemi a une force de " + gdg.getForce(), "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);

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
                    "Forteresse de glace",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choixNbElfes,
                    choixNbElfes[0]);
            try {
                nbElfes = Integer.parseInt(nbVikaSa);
            } catch (Exception e) {
                nbElfes = 0;
            }
            forcedieu += nbElfes;
            dde.remettreElfes(this, nbElfes);
        }
        if (forcedieu >= gdg.getForce()) {
            JOptionPane.showMessageDialog(page, "Vous avez gagné!", "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
            gdg.desactiver();
        } else {
            JOptionPane.showMessageDialog(page, "Vous avez perdu!", "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Modélise l'action de jouer en Midgard
     *
     * @param page JFrame principale
     * @param mg Le monde Midgard
     * @param tabSac le sac dans lequel prendre les vikings
     */
    public void jouerEnMidgard(JFrame page, Midgard mg, Sac[] tabSac) {
        Ile[] tabIle = mg.getTabIle();
        partieRestanteAjouer--;
        if (this.getNom().compareTo("Freyja") == 0) {
            Freyja f = (Freyja) this;
            f.setaJouerEnMidgard(f.getaJouerEnMidgard() + 1);
        }
        aJouerEnMidgard = true;

        int rep = JOptionPane.showConfirmDialog(page, "La Valkyrie est sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " voulez vous le bouger?", "Midgard",
                JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (mg.getValkyrie().getPosition() == 0) {
                mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() + 1);
                JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
            } else if (mg.getValkyrie().getPosition() == 4) {
                mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() - 1);
                JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
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

    /**
     * Modélise l'action de jouer dans le Domaine des morts
     *
     * @param page JFrame principale
     * @param sac Sac dans lequel prendre les vikings
     * @param dm Monde domaine des morts
     */
    public void jouerEnDomaineDesMort(JFrame page, Sac sac, DomaineDesMorts dm) {
        partieRestanteAjouer--;
        if (this.getNom().compareTo("Freyja") == 0) {
            Freyja f = (Freyja) this;
            f.setaJouerEnDomaineDesMorts(f.getaJouerEnDomaineDesMorts() + 1);
        }
        aJouerEnDomaineDesMorts = true;

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

    /**
     * Modélise l'action de jouer en Terre bénite
     *
     * @param tb Le Mondes Terre bénite
     * @param mg Le Monde Midgard
     * @param ddm Le Monde Domaine des morts
     * @param pileCarteEnnemis Liste des cartes ennemies
     * @param tabEnnemis Tableau contenant les ennemis
     * @param fdg Le Monde Forteresse de glace
     * @param page JFrame principale
     */
    public void jouerEnTerreBenite(TerreBenite tb, Midgard mg, DomaineDesMorts ddm, LinkedList pileCarteEnnemis, Ennemis[] tabEnnemis, ForteresseDeGlace fdg, JFrame page) {

        String[] choix = {"avancer Vane", "utiliser Vane"};
        JOptionPane jop = new JOptionPane();
        int rang = JOptionPane.showOptionDialog(page,
                "Que voulez-vous faire?",
                "Terre bénite",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choix,
                choix[0]);
        if (rang == 0) {
            partieRestanteAjouer--;
            if (this.getNom().compareTo("Freyja") == 0) {
                Freyja f = (Freyja) this;
                f.setaJouerEnTerreBenite(f.getaJouerEnTerreBenite() + 1);
            }
            aJouerEnTerreBenite = true;

            tb.avancerVane();
        } else if (rang == 1) {
            int position = tb.getVanePostion();
            switch (position) {
                case 1:
                    partieRestanteAjouer--;
                    if (this.getNom().compareTo("Freyja") == 0) {
                        Freyja f = (Freyja) this;
                        f.setaJouerEnTerreBenite(f.getaJouerEnTerreBenite() + 1);
                    }
                    aJouerEnTerreBenite = true;

                    Ile[] tabIle = mg.getTabIle();
                    int rep = JOptionPane.showConfirmDialog(page, "La Valkyrie est sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " voulez vous le bouger?", "Midgard",
                            JOptionPane.YES_NO_OPTION);
                    if (rep == JOptionPane.YES_OPTION) {
                        if (mg.getValkyrie().getPosition() == 0) {
                            mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() + 1);
                            JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                        } else if (mg.getValkyrie().getPosition() == 4) {
                            mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() - 1);
                            JOptionPane.showMessageDialog(page, "La Valkyrie est mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            String[] ileChoix = {tabIle[mg.getValkyrie().getPosition() - 1].getCouleur(), tabIle[mg.getValkyrie().getPosition() + 1].getCouleur()};
                            JOptionPane jop1 = new JOptionPane();
                            int rang1 = JOptionPane.showOptionDialog(page,
                                    "Sur quelle île voulez-vous aller?",
                                    "Midgard",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    ileChoix,
                                    ileChoix[ileChoix.length - 1]);
                            if (rang1 == 0) {
                                mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() - 1);
                                JOptionPane.showMessageDialog(page, "La Valkyrie mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                            } else if (rang1 == 1) {
                                mg.getValkyrie().setPosition(mg.getValkyrie().getPosition() + 1);
                                JOptionPane.showMessageDialog(page, "La Valkyrie mainteant sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase(), "Midgard", JOptionPane.INFORMATION_MESSAGE);
                            }

                        }
                    }
                    if (mg.getValkyrie().getPosition() == 0) {
                        JOptionPane.showMessageDialog(page, "La Valkyrie est  sur l'île " + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " vous ne pouvez pas sauver de vikings sur cette île", "Midgard", JOptionPane.INFORMATION_MESSAGE);
                    } else if (tabIle[mg.getValkyrie().getPosition()].isSubmergee()) {
                        if (mg.getValkyrie().getPosition() == 0) {
                            JOptionPane.showMessageDialog(page, "L'île" + tabIle[mg.getValkyrie().getPosition()].getCouleur().toString().toLowerCase() + " est submérgée, vous ne pouvez pas aller chercher des âmes", "Midgard", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    tb.reset();
                    break;
                case 2:
                    partieRestanteAjouer--;
                    if (this.getNom().compareTo("Freyja") == 0) {
                        Freyja f = (Freyja) this;
                        f.setaJouerEnTerreBenite(f.getaJouerEnTerreBenite() + 1);
                    }
                    aJouerEnTerreBenite = true;

                    if (!ddm.getlViking().isEmpty()) {
                        ddm.retirerViking();
                        lVikings.add(new Vikings());
                    }
                    if (!ddm.getlViking().isEmpty()) {
                        ddm.retirerViking();
                        lVikings.add(new Vikings());
                    }
                    tb.reset();
                    break;
                case 3:
                    partieRestanteAjouer--;
                    if (this.getNom().compareTo("Freyja") == 0) {
                        Freyja f = (Freyja) this;
                        f.setaJouerEnTerreBenite(f.getaJouerEnTerreBenite() + 1);
                    }
                    aJouerEnTerreBenite = true;

                    ChoixOrdreCarteEnnemi coce = new ChoixOrdreCarteEnnemi(page, true, pileCarteEnnemis);
                    coce.setLocationRelativeTo(page);
                    coce.setVisible(true);
                    tb.reset();
                    break;
                case 4:
                    partieRestanteAjouer--;
                    if (this.getNom().compareTo("Freyja") == 0) {
                        Freyja f = (Freyja) this;
                        f.setaJouerEnTerreBenite(f.getaJouerEnTerreBenite() + 1);
                    }
                    aJouerEnTerreBenite = true;

                    choixEnnemi ce = new choixEnnemi(page, true);
                    ce.setLocationRelativeTo(page);
                    ce.changerTitre("Quel dieu voulez vous faire reculer");
                    ce.setVisible(true);

                    int choix1 = ce.getChoix();
                    switch (choix1) {
                        case 0:
                            tabEnnemis[0].reculer(1);
                            break;
                        case 1:
                            tabEnnemis[1].reculer(1);
                            break;
                        case 2:
                            tabEnnemis[2].reculer(1);
                            break;
                        case 3:
                            tabEnnemis[3].reculer(1);
                            break;
                        case 4:
                            tabEnnemis[4].reculer(1);
                            break;
                        case 5:
                            tabEnnemis[5].reculer(1);
                            break;
                    }
                    tb.reset();
                    break;
                case 5:
                    partieRestanteAjouer--;
                    if (this.getNom().compareTo("Freyja") == 0) {
                        Freyja f = (Freyja) this;
                        f.setaJouerEnTerreBenite(f.getaJouerEnTerreBenite() + 1);
                    }
                    aJouerEnTerreBenite = true;

                    ChoixGeantDeGivre cgdg = new ChoixGeantDeGivre(page, true, fdg.getPileGeantDeGivre());
                    cgdg.setLocationRelativeTo(page);
                    cgdg.setVisible(true);
                    GeantDeGivre gdg = cgdg.getGdg();
                    gdg.desactiver();
                    fdg.getPileGeantDeGivre().remove(gdg);
                    Collections.shuffle(fdg.getPileGeantDeGivre());
                    fdg.getGeantDeffausse().add(gdg);
                    tb.reset();
                    break;
            }
        }
    }

    public HashMap<String, Artefact> getlArtefact() {
        return lArtefact;
    }

    public LinkedList getlElfes() {
        return lElfes;
    }

    public LinkedList getlVikings() {
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

    public int getMAXPARTIE() {
        return MAXPARTIE;
    }

    public int getFORCEINITIALE() {
        return FORCEINITIALE;
    }

    public boolean isaJouerEnAsgard() {
        return aJouerEnAsgard;
    }

    public boolean isaJouerEnDomaineDesMorts() {
        return aJouerEnDomaineDesMorts;
    }

    public boolean isaJouerEnForgeDesNains() {
        return aJouerEnForgeDesNains;
    }

    public boolean isaJouerEnForteresseDeGlace() {
        return aJouerEnForteresseDeGlace;
    }

    public boolean isaJouerEnMidgard() {
        return aJouerEnMidgard;
    }

    public boolean isaJouerEnMondeDesTenebres() {
        return aJouerEnMondeDesTenebres;
    }

    public boolean isaJouerEnRoyaumeDuFeu() {
        return aJouerEnRoyaumeDuFeu;
    }

    public boolean isaJouerEnTerreBenite() {
        return aJouerEnTerreBenite;
    }

    public boolean isaJoueurEnDeumeureDesElfes() {
        return aJoueurEnDeumeureDesElfes;
    }

    public void setaJouerEnAsgard(boolean aJouerEnAsgard) {
        this.aJouerEnAsgard = aJouerEnAsgard;
    }

    public void setaJouerEnDomaineDesMorts(boolean aJouerEnDomaineDesMorts) {
        this.aJouerEnDomaineDesMorts = aJouerEnDomaineDesMorts;
    }

    public void setaJouerEnForgeDesNains(boolean aJouerEnForgeDesNains) {
        this.aJouerEnForgeDesNains = aJouerEnForgeDesNains;
    }

    public void setaJouerEnForteresseDeGlace(boolean aJouerEnForteresseDeGlace) {
        this.aJouerEnForteresseDeGlace = aJouerEnForteresseDeGlace;
    }

    public void setaJouerEnMidgard(boolean aJouerEnMidgard) {
        this.aJouerEnMidgard = aJouerEnMidgard;
    }

    public void setaJouerEnMondeDesTenebres(boolean aJouerEnMondeDesTenebres) {
        this.aJouerEnMondeDesTenebres = aJouerEnMondeDesTenebres;
    }

    public void setaJouerEnRoyaumeDuFeu(boolean aJouerEnRoyaumeDuFeu) {
        this.aJouerEnRoyaumeDuFeu = aJouerEnRoyaumeDuFeu;
    }

    public void setaJouerEnTerreBenite(boolean aJouerEnTerreBenite) {
        this.aJouerEnTerreBenite = aJouerEnTerreBenite;
    }

    public void setaJoueurEnDeumeureDesElfes(boolean aJoueurEnDeumeureDesElfes) {
        this.aJoueurEnDeumeureDesElfes = aJoueurEnDeumeureDesElfes;
    }

    public void setlArtefact(HashMap<String, Artefact> lArtefact) {
        this.lArtefact = lArtefact;
    }
}
