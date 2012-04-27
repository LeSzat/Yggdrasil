/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.Monde.*;
import yggdrasil.vue.ChoixSac;
import yggdrasil.vue.choixEnnemi;

/**
 *
 * @author mathias
 */
public class Partie {

    private Ennemis[] tabEnnemis;
    private ArrayList<String> pileCarteEnnemis;
    private Sac[] tabSac;
    private ArrayList<Dieu> lDieu;
    private Dieu dieuActuel;
    private De de;
    private Midgard mg;
    private ForgeDesNains fdn;
    private DemeureDesElfes dde;
    private DomaineDesMorts dm;
    private RoyaumeDuFeu rdf;
    private TerreBenite tb;
    private ForteresseDeGlace fdg;
    private MondeDesTenebres mdt;
    private Scanner sc;

    public Partie() {
        de = new De();
        this.lDieu = new ArrayList<>();
        creationEnnemis();
        creationPileEnnemis();
        creationSacs();
        this.mg = new Midgard();
        this.fdn = new ForgeDesNains();
        this.rdf = new RoyaumeDuFeu();
        this.tb = new TerreBenite();
        this.fdg = new ForteresseDeGlace(this);
        this.mdt = new MondeDesTenebres();
        this.dm = new DomaineDesMorts();
        sc = new Scanner(System.in);
    }

    public void creerDemeureDesElfes() {
        dde = new DemeureDesElfes(lDieu.size());
    }

    public void ajouterDieu(Dieu d) {
        this.lDieu.add(d);
    }

    private void creationEnnemis() {
        tabEnnemis = new Ennemis[6];
        Ennemis fenrir = new Fenrir();
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

    private void creationPileEnnemis() {
        pileCarteEnnemis = new ArrayList<>();
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

    private void creationSacs() {
        tabSac = new Sac[4];
        tabSac[0] = new Sac("Blanc", 6, 12);
        tabSac[1] = new Sac("Bleu", 9, 9);
        tabSac[2] = new Sac("Vert", 12, 6);
        tabSac[3] = new Sac("Noir", 15, 3);
    }

    public void jouerAsgard(JFrame page) {
        choixEnnemi ce = new choixEnnemi(page, true);
        ce.setLocationRelativeTo(page);
        ce.setVisible(true);
        int choix = ce.getChoix();
        if (choix > -1) {
            dieuActuel.jouerEnAsgard(tabEnnemis[choix], de, dde, dm, fdn, page);
        }
    }

    public void jouerEnMidgard(JFrame page) {
        dieuActuel.jouerEnMidgard(page, mg, tabSac);
    }

    public void jouerEnForgeDesNains(JFrame page) {
        dieuActuel.jouerEnForgeDesNains(fdn, page);
    }

    public void jouerEnDemeureDesElfes(JFrame page) {
        dieuActuel.jouerEnDemeureDesElfes(dde.getlElfes(), page);
    }

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
        JOptionPane jop = new JOptionPane();
        String dieu = (String) JOptionPane.showInputDialog(page,
                "Quel dieu voulez vous aider",
                "Monde des ténébre",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choixDieu,
                choixDieu[0]);
        for(Dieu d:lDieu)
        {
            if(d.getNom().equals(dieu))
                dieuActuel.jouerMondeDesTenebres(d,page);
        }
        

    }

    public void jouerEnDomaineDesMort(JFrame page) {
        ChoixSac cs = new ChoixSac(page, true);
        cs.setLocationRelativeTo(page);
        cs.setVisible(true);
        int choix = cs.getChoix();
        if (choix > -1) {
            dieuActuel.jouerEnDomaineDesMort(page, tabSac[choix], dm);
        }

    }

    public void jouerEnRoyaumeDuFeu(JFrame page) {
        ChoixSac cs = new ChoixSac(page, true);
        cs.setLocationRelativeTo(page);
        cs.setVisible(true);
        int choix = cs.getChoix();
        if (choix > -1) {
            dieuActuel.jouerEnRoyaumeDuFeu(page, tabSac[choix], rdf);
        }
    }

    public void jouerEnForteresseDeGlace() {
    }

    public void jouerEnTerreBenite(JFrame page) {
        dieuActuel.jouerEnTerreBenite(tb, mg, dm, pileCarteEnnemis, tabEnnemis, fdg,page);
    }

    public Dieu getDieuActuel() {
        return dieuActuel;
    }

    public void setDieuActuel(Dieu dieuActuel) {
        this.dieuActuel = dieuActuel;
    }

    public ArrayList<Dieu> getlDieu() {
        return lDieu;
    }

    public Ennemis[] getTabEnnemis() {
        return tabEnnemis;
    }

    public DemeureDesElfes getDde() {
        return dde;
    }

    public DomaineDesMorts getDm() {
        return dm;
    }

    public ForgeDesNains getFdn() {
        return fdn;
    }

    public Midgard getMg() {
        return mg;
    }

    public RoyaumeDuFeu getRdf() {
        return rdf;
    }

    public TerreBenite getTb() {
        return tb;
    }

    public De getDe() {
        return de;
    }

    public ForteresseDeGlace getFdg() {
        return fdg;
    }

    public MondeDesTenebres getMdt() {
        return mdt;
    }
}
