/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.Artefact;
import yggdrasil.De;
import yggdrasil.Ennemis.Ennemis;
import yggdrasil.GeantDeGivre.GeantDeGivre;
import yggdrasil.Monde.Asgard;
import yggdrasil.Monde.DemeureDesElfes;
import yggdrasil.Monde.DomaineDesMorts;
import yggdrasil.Monde.ForgeDesNains;

/**
 *
 * @author mathias
 */
public class Tyr extends Dieu {

    public Tyr() {
        super.setNom("Tyr");
        super.setCheminImage("/yggdrasil/vue/Tyr.jpg");
    }

    @Override
    public void jouerEnAsgard(Ennemis en, De de, DemeureDesElfes dde, DomaineDesMorts ddm, ForgeDesNains fdn,Asgard as, JFrame page) {
        as.commencerCombat(this, en);
        super.setaJouerEnAsgard(true);
        super.setPartieRestanteAjouer(super.getPartieRestanteAjouer() - 1);
        if (!super.getlVikings().isEmpty()) {

            int taille = super.getlVikings().size();
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
                super.getlVikings().remove(0);
            }
            ddm.ajouterVikings(nbVikaSac);
        } else {
            JOptionPane.showMessageDialog(page, "Vous n'avez pas de Viking à sacrifier", "Asgard",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        if (!super.getlArtefact().containsKey(en.getNom() + 1) && !super.getlArtefact().containsKey(en.getNom() + 2) && !super.getlArtefact().containsKey(en.getNom() + 3)) {
            JOptionPane.showMessageDialog(page, "Vous n'avez pas d'artefact pour cet ennemi", "Asgard",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            Iterator it = super.getlArtefact().values().iterator();
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
        
        if(de.isActif()){
        int det;
        int det1 = de.getValeur();
        int det2 = de.getValeur();

        String[] choix1 = {String.valueOf(det1), String.valueOf(det2)};
        JOptionPane jop1 = new JOptionPane();
        int rang1 = JOptionPane.showOptionDialog(page,
                "Quelle valeur du dé choisissez vous?",
                "Avantage Tyr",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choix1,
                choix1[0]);
        if (rang1 == 0) {
            det = det1;
        } else {
            det = det2;
        }
        as.ajoutValDe(det);

        JOptionPane.showMessageDialog(page, "La valeur du dé est de " + det, "Asgard", JOptionPane.INFORMATION_MESSAGE);
    }
        else
        {
             JOptionPane.showMessageDialog(page, "Le dé n'est pas utilisable, Thiazy le bloc", "Asgard", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(page, "vous avez une force de " + as.getForceDieu() + " votre ennemi a une force de " + as.getForceEnnemi(), "Asgard", JOptionPane.INFORMATION_MESSAGE);

        if (!super.getlElfes().isEmpty()) {
            int nbElfes;
            int taille = super.getlElfes().size();
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
    @Override
    public void jouerEnForteresseDeGlace(Dieu deus, GeantDeGivre gdg, De de, DomaineDesMorts ddm, DemeureDesElfes dde, JFrame page) {

        int forcedieu = deus.getFORCEINITIALE();
        super.setPartieRestanteAjouer(super.getPartieRestanteAjouer() - 1);
        super.setaJouerEnForteresseDeGlace(true);
        if (!super.getlVikings().isEmpty()) {

            int taille = super.getlVikings().size();
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
                super.getlVikings().remove(0);
            }
            ddm.ajouterVikings(nbVikaSac);
        } else {
            JOptionPane.showMessageDialog(page, "Vous n'avez pas de Viking à sacrifier", "Asgard",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if(de.isActif())
        {
        int det;
        int det1 = de.getValeur();
        int det2 = de.getValeur();

        String[] choix1 = {String.valueOf(det1), String.valueOf(det2)};
        JOptionPane jop1 = new JOptionPane();
        int rang1 = JOptionPane.showOptionDialog(page,
                "Quelle valeur du dé choisissez vous?",
                "Avantage Tyr",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choix1,
                choix1[0]);
        if (rang1 == 0) {
            det = det1;
        } else {
            det = det2;
        }
        forcedieu += det;
        JOptionPane.showMessageDialog(page, "La valeur du dé est de " + det, "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(page, "Le dé n'est pas utilisable, Thiazy le bloque", "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(page, "vous avez une force de " + forcedieu + " votre ennemi a une force de " + gdg.getForce(), "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);

        if (!super.getlElfes().isEmpty()) {
            int nbElfes;
            int taille = super.getlElfes().size();
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
            nbElfes = Integer.parseInt(nbVikaSa);
            forcedieu += nbElfes;
            dde.remettreElfes(this, nbElfes);
        }
        if (forcedieu >= gdg.getForce()) {
            JOptionPane.showMessageDialog(page, "Vous avez gagné!", "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
            gdg.setActif(false);
        } else {
            JOptionPane.showMessageDialog(page, "Vous avez perdu!", "Forteresse de glace", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
