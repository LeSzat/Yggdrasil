/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.GeantDeGivre.GeantDeGivre;
import yggdrasil.Monde.*;
import yggdrasil.vue.*;

/**
 * Classe principale elle gère toutes les interactions entre l'affichage et le
 * programme. Elle contient tous les éléments utiles au jeu
 */
public class Partie {

    /**
     * Tableau des ennemis
     */
    private Ennemis[] tabEnnemis;
    /**
     * liste contenant les carte ennemies
     */
    private LinkedList pileCarteEnnemis;
    /**
     * Tableau qui contient les 4 sacs du jeu
     */
    private Sac[] tabSac;
    /**
     * Liste des dieux
     */
    private LinkedList<Dieu> lDieu;
    /**
     * Dieu qui est en train de jouer
     */
    private Dieu dieuActuel;
    /**
     * Le dé
     */
    private De de;
    /**
     * Monde Midgard
     */
    private Midgard mg;
    /**
     * Monde forges des nains
     */
    private ForgeDesNains fdn;
    /**
     * Monde demeure des Elfes
     */
    private DemeureDesElfes dde;
    /**
     * Monde domaine des mort
     */
    private DomaineDesMorts dm;
    /**
     * Monde royaume du feu
     */
    private RoyaumeDuFeu rdf;
    /**
     * Monde terre bénite
     */
    private TerreBenite tb;
    /**
     * Monde forteresse de glace
     */
    private ForteresseDeGlace fdg;
    /**
     * Monde des ténébres
     */
    private MondeDesTenebres mdt;
    /**
     * Monde Asgard
     */
    private Asgard as;

    /**
     * Initialise tous les éléments utiles à la partie
     */
    public Partie() {
        de = new De();
        this.lDieu = new LinkedList();
        creationEnnemis();
        creationPileEnnemis();
        creationSacs();
        this.mg = new Midgard();
        this.fdn = new ForgeDesNains();
        this.rdf = new RoyaumeDuFeu();
        this.tb = new TerreBenite();
        this.mdt = new MondeDesTenebres();
        this.dm = new DomaineDesMorts();
        as = new Asgard();
        dde = new DemeureDesElfes();
        this.fdg = new ForteresseDeGlace(this);
    }

    /**
     * Ajoute un dieu à la partie(utilisé lors du choix des joueurs par
     * l'utilisateur)
     *
     * @param d le dieu à ajouter
     */
    public void ajouterDieu(Dieu d) {
        this.lDieu.add(d);
        dde.getlElfes().add(new Elfes());
    }

    /**
     * Création du tableau des ennemis
     */
    private void creationEnnemis() {
        tabEnnemis = new Ennemis[6];
        Ennemis fenrir = new Fenrir(de);
        Ennemis hel = new Hel(de);
        Ennemis jormungand = new Jormungand(de);
        Ennemis loki = new Loki();
        Ennemis nidhogg = new Nidhogg();
        Ennemis surt = new Surt(de);

        tabEnnemis[5] = fenrir;
        tabEnnemis[0] = hel;
        tabEnnemis[2] = jormungand;
        tabEnnemis[3] = loki;
        tabEnnemis[4] = nidhogg;
        tabEnnemis[1] = surt;
    }

    /**
     * Création de la pile des carte ennemis(8 cartes de chaque ennemis
     */
    private void creationPileEnnemis() {
        pileCarteEnnemis = new LinkedList();
        for (int i = 0; i < 8; i++) {
            pileCarteEnnemis.add("Fenrir");
            pileCarteEnnemis.add("Hel");
            pileCarteEnnemis.add("Jormungand");
            pileCarteEnnemis.add("Loki");
            pileCarteEnnemis.add("Nidhogg");
            pileCarteEnnemis.add("Surt");
        }
        Collections.shuffle(pileCarteEnnemis);
    }

    /**
     * Création des sacs du jeu
     */
    private void creationSacs() {
        tabSac = new Sac[4];
        tabSac[0] = new Sac("Blanc", 6, 12);
        tabSac[1] = new Sac("Bleu", 9, 9);
        tabSac[2] = new Sac("Vert", 12, 6);
        tabSac[3] = new Sac("Noir", 15, 3);
    }

    /**
     * Utilisée lorsque le joueur veux jouer en Asgard. Cette fonction envoie
     * tous les éléments utiles à la classe Dieu.
     *
     * @param page Jframe principale
     */
    public void jouerAsgard(JFrame page) {
        choixEnnemi ce = new choixEnnemi(page, true);
        ce.setLocationRelativeTo(page);
        ce.setVisible(true);
        int choix = ce.getChoix();
        if (choix > -1) {
            dieuActuel.jouerEnAsgard(tabEnnemis[choix], de, dde, dm, fdn, as, page);
        }
    }

    /**
     * Utilisée lorsque le joueur veux jouer en Midgard. Cette fonction envoie
     * tous les éléments utiles à la classe Dieu.
     *
     * @param page Jframe principale
     */
    public void jouerEnMidgard(JFrame page) {
        dieuActuel.jouerEnMidgard(page, mg, tabSac);
    }

    /**
     * Utilisée lorsque le joueur veux jouer en Forge des nains. Cette fonction
     * envoie tous les éléments utiles à la classe Dieu.
     *
     * @param page Jframe principale
     */
    public void jouerEnForgeDesNains(JFrame page) {
        dieuActuel.jouerEnForgeDesNains(fdn, page);
    }

    /**
     * Utilisée lorsque le joueur veux jouer en Demeures des elfes. Cette
     * fonction envoie tous les éléments utiles à la classe Dieu.
     *
     * @param page Jframe principale
     */
    public void jouerEnDemeureDesElfes(JFrame page) {
        dieuActuel.jouerEnDemeureDesElfes(dde.getlElfes(), page);
    }

    /**
     * Utilisée lorsque le joueur veux jouer en Monde des ténébres. Cette fonction envoie
     * tous les éléments utiles à la classe Dieu.
     *C'est içi que l'utilisateur choisis le dieu qu'il veut aider
     * @param page Jframe principale
     */
    public void jouerMondeDesTenebres(JFrame page) {
        int taille = lDieu.size();
        String[] choixDieu = new String[taille - 1];

        int i = 0;
        Iterator it = lDieu.iterator();
        while (it.hasNext()) {
            Dieu deus = (Dieu) it.next();
            if (!deus.getNom().equals(dieuActuel.getNom())) {
                choixDieu[i] = deus.getNom();
                i++;
            }
        }
        if (choixDieu.length > 0) {
            JOptionPane jop = new JOptionPane();
            String dieu = (String) JOptionPane.showInputDialog(page,
                    "Quel dieu voulez vous aider",
                    "Monde des ténébre",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choixDieu,
                    choixDieu[0]);
            for (Dieu d : lDieu) {
                if (d.getNom().equals(dieu)) {
                    dieuActuel.jouerMondeDesTenebres(d, page);
                }
            }
        } else {
            JOptionPane.showMessageDialog(page, "Vous n'avez de coequipier à aider", "Monde des ténébres", JOptionPane.ERROR_MESSAGE);
        }
    }
/**
 * Utilisée lorsque le joueur veux jouer en Domaine des mort. Cette fonction envoie tous les éléments utiles à la classe Dieu.
 * C'est içi que l'utlisateur choisis le sac dans lequel il veut mettre les vikings
 * @param page Jframe principale
 */
    public void jouerEnDomaineDesMort(JFrame page) {
        ChoixSac cs = new ChoixSac(page, true);
        cs.setLocationRelativeTo(page);
        cs.setVisible(true);
        int choix = cs.getChoix();
        if (choix > -1) {
            dieuActuel.jouerEnDomaineDesMort(page, tabSac[choix], dm);
        }

    }
/**
 * Utilisée lorsque le joueur veux jouer en Royaume du feu. Cette fonction envoie tous les éléments utiles à la classe Dieu.
 * C'est içi que l'utlisateur choisis le sac dans lequel il veut mettre les vikings
 * @param page Jframe principale
 */
    public void jouerEnRoyaumeDuFeu(JFrame page) {
        ChoixSac cs = new ChoixSac(page, true);
        cs.setLocationRelativeTo(page);
        cs.setVisible(true);
        int choix = cs.getChoix();
        if (choix > -1) {
            dieuActuel.jouerEnRoyaumeDuFeu(page, tabSac[choix], rdf);
        }
    }
/**
 * Utilisée lorsque le joueur veux jouer en Forteresse de glace. Cette fonction envoie tous les éléments utiles à la classe Dieu.
 * C'est içi que l'utlisateur choisis le le géant qu'il veut combattre
 * @param page Jframe principale
 */
    public void jouerEnForteresseDeGlace(JFrame page) {
        ArrayList<GeantDeGivre> lGeantTemp = new ArrayList<>();
        for (GeantDeGivre gdgf : fdg.getGeantDeffausse()) {
            if (gdgf.isActif()) {
                lGeantTemp.add(gdgf);
            }
        }
        if (!lGeantTemp.isEmpty()) {
            ChoixGeantDeGivreCombat cgdg = new ChoixGeantDeGivreCombat(page, true, lGeantTemp);
            cgdg.setLocationRelativeTo(page);
            cgdg.setVisible(true);
            GeantDeGivre gdg = cgdg.getGdg();
            dieuActuel.jouerEnForteresseDeGlace(dieuActuel, gdg, de, dm, dde, page);
        } else {
            JOptionPane.showMessageDialog(page, "Pas de géant de givre à combatrre", "Forteresse de glace", JOptionPane.ERROR_MESSAGE);
        }
        verifRunes(page);
    }
/**
 * Vérifie l'état des runes. Si une rune est complète cette action lance l'action de la rune
 * @param page JFrame principale
 */
    public void verifRunes(JFrame page) {
        boolean activerDaeg = true;
        boolean activerMann = true;
        boolean activerSigel = true;
        boolean activerTiwaz = true;
        for (boolean b : fdg.getRuneDaeg()) {
            if (!b) {
                activerDaeg = false;
            }
        }
        for (boolean b : fdg.getRuneMann()) {
            if (!b) {
                activerMann = false;
            }
        }
        for (boolean b : fdg.getRuneSigel()) {
            if (!b) {
                activerSigel = false;
            }
        }
        for (boolean b : fdg.getRuneTiwaz()) {
            if (!b) {
                activerTiwaz = false;
            }
        }
        if (activerSigel) {
            fdg.jouerSigel(page, this);
            for (boolean b : fdg.getRuneSigel()) {
                b = false;
            }
        }
        if (activerDaeg) {
            fdg.jouerDaeg(page, this);
            for (boolean b : fdg.getRuneDaeg()) {
                b = false;
            }

        }
        if (activerTiwaz) {
            fdg.jouerTiwaz(page, this);
            for (boolean b : fdg.getRuneTiwaz()) {
                b = false;
            }
        }
        if (activerMann) {
            fdg.jouerMann(page, this);
            for (boolean b : fdg.getRuneMann()) {
                b = false;
            }
        }
    }
/**
 * Applique l'effet de la carte ennemi tirée
 * @param page JFrame principale
 * @param e Nom de l'ennemi
 */
    public void appliquerEnnemi(JFrame page, String e) {
        if (e.compareTo("Hel") == 0) {
            Hel hel = (Hel) tabEnnemis[0];
            hel.action(tabSac, dm, page, dieuActuel);
        } else if (e.compareTo("Surt") == 0) {
            Surt surt = (Surt) tabEnnemis[1];
            surt.action(tabSac, rdf, page, dieuActuel);
        } else if (e.compareTo("Jormungand") == 0) {
            Jormungand jormungand = (Jormungand) tabEnnemis[2];
            jormungand.action(mg, page, dieuActuel);
        } else if (e.compareTo("Loki") == 0) {
            Loki loki = (Loki) tabEnnemis[3];
            loki.action(fdg);
        } else if (e.compareTo("Nidhogg") == 0) {
            Nidhogg nidhogg = (Nidhogg) tabEnnemis[4];
            nidhogg.action(tabEnnemis, page);
        } else if (e.compareTo("Fenrir") == 0) {
            Fenrir fenrir = (Fenrir) tabEnnemis[5];
            fenrir.action(page);
            while (!fenrir.isCalmer()) {
                fenrir.essayerDeCalmer(page, dieuActuel);
                dieuActuel.setPartieRestanteAjouer(dieuActuel.getPartieRestanteAjouer() - 1);
                if (dieuActuel.getPartieRestanteAjouer() == 0) {
                    int j = lDieu.indexOf(dieuActuel);
                    dieuActuel.reset();
                    if ((j + 1) == lDieu.size()) {
                        dieuActuel = (Dieu) (lDieu.get(0));
                    } else {
                        dieuActuel = (Dieu) (lDieu.get(j + 1));
                    }
                    if ("Odin".equals(dieuActuel.getNom()) && Dieu.pouvoirDieu) {
                        String e2 = (String) pileCarteEnnemis.get(0);
                        String e1 = (String) pileCarteEnnemis.get(1);
                        OdinTire dt = new OdinTire(page, true, e2, e1);
                        dt.setLocationRelativeTo(page);
                        dt.setVisible(true);
                        int choix = dt.getChoix();
                        String ec = (String) pileCarteEnnemis.get(choix);
                        pileCarteEnnemis.remove(ec);
                        appliquerEnnemi(page, ec);

                    } else {
                        String e1 = (String) pileCarteEnnemis.get(0);
                        DieuTire dt = new DieuTire(page, true, e1);
                        dt.setLocationRelativeTo(page);
                        dt.setVisible(true);
                        pileCarteEnnemis.remove(0);
                        appliquerEnnemi(page, e1);
                    }

                    page.getContentPane().removeAll();
                    page.getContentPane().add(new EcranPrincipal(page, this));
                    page.revalidate();
                }
                page.getContentPane().removeAll();
                page.getContentPane().add(new EcranPrincipal(page, this));
                page.revalidate();
            }
        }
    }
/**
     * Utilisée lorsque le joueur veux jouer en Terre bénite. Cette
     * fonction envoie tous les éléments utiles à la classe Dieu.
     *
     * @param page Jframe principale
     */
    public void jouerEnTerreBenite(JFrame page) {
        dieuActuel.jouerEnTerreBenite(tb, mg, dm, pileCarteEnnemis, tabEnnemis, fdg, page);
    }
/**
 * 
 * @return le dieu actuel
 */
    public Dieu getDieuActuel() {
        return dieuActuel;
    }

    /**
     * Met à jour le dieu actuel
     * @param dieuActuel le joueur suivant
     */
    public void setDieuActuel(Dieu dieuActuel) {
        this.dieuActuel = dieuActuel;
    }

    /**
     * @return la liste des dieux
     */
    public LinkedList getlDieu() {
        return lDieu;
    }
/**
 * 
 * @return le tableau contenant les ennemis
 */
    public Ennemis[] getTabEnnemis() {
        return tabEnnemis;
    }
/**
 * 
 * @return le monde Domaine des elfes
 */
    public DemeureDesElfes getDde() {
        return dde;
    }

    /**
     * 
     * @return le monde Domaine des morts 
     */
    public DomaineDesMorts getDm() {
        return dm;
    }
/**
 * 
 * @return le monde Forge des nains
 */
    public ForgeDesNains getFdn() {
        return fdn;
    }

    /**
     * 
     * @return le monde Midgard
     */
    public Midgard getMg() {
        return mg;
    }

    /**
     * 
     * @return le monde Royaume du feu
     */
    public RoyaumeDuFeu getRdf() {
        return rdf;
    }

    /**
     * 
     * @return le monde Terre bénite
     */
    public TerreBenite getTb() {
        return tb;
    }
/**
 * 
 * @return le dé
 */
    public De getDe() {
        return de;
    }
/**
 * 
 * @return le monde Forteresse de glace
 */
    public ForteresseDeGlace getFdg() {
        return fdg;
    }

    /**
     * 
     * @return le monde Monde des ténébres
     */
    public MondeDesTenebres getMdt() {
        return mdt;
    }

    /**
     * 
     * @return la pile de carte ennemi
     */
    public LinkedList getPileCarteEnnemis() {
        return pileCarteEnnemis;
    }

    /**
     * 
     * @return le tableau contenant les sacs
     */
    public Sac[] getTabSac() {
        return tabSac;
    }

    /**
     * 
     * @return le monde Asgard
     */
    public Asgard getAs() {
        return as;
    }
}
