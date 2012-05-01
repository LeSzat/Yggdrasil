/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.GeantDeGivre.GeantDeGivre;
import yggdrasil.Monde.*;
import yggdrasil.vue.*;

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
    private Asgard as;

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
        as=new Asgard();
    }

    public void creerDemeureDesElfes() {
        dde = new DemeureDesElfes(lDieu.size());
    }

    public void ajouterDieu(Dieu d) {
        this.lDieu.add(d);
    }

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
            dieuActuel.jouerEnAsgard(tabEnnemis[choix], de, dde, dm, fdn,as, page);
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
        for (Dieu d : lDieu) {
            if (d.getNom().equals(dieu)) {
                dieuActuel.jouerMondeDesTenebres(d, page);
            }
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
    }

    public void appliquerEnnemi(JFrame page, String e) {
        if (e.compareTo("Hel") == 0) {
            Hel hel = (Hel) tabEnnemis[0];
            hel.action(tabSac, dm, page,dieuActuel);
        } else if (e.compareTo("Surt") == 0) {
            Surt surt = (Surt) tabEnnemis[1];
            surt.action(tabSac, rdf, page,dieuActuel);
        } else if (e.compareTo("Jormungand") == 0) {
            Jormungand jormungand = (Jormungand) tabEnnemis[2];
            jormungand.action(mg, page,dieuActuel);
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
                fenrir.essayerDeCalmer(page,dieuActuel);
                dieuActuel.setPartieRestanteAjouer(dieuActuel.getPartieRestanteAjouer() - 1);
                if (dieuActuel.getPartieRestanteAjouer() == 0) {
                    int j = lDieu.indexOf(dieuActuel);
                    dieuActuel.reset();
                    if ((j + 1) == lDieu.size()) {
                        dieuActuel = (lDieu.get(0));
                    } else {
                        dieuActuel = (lDieu.get(j + 1));
                    }
                    if ("Odin".equals(dieuActuel.getNom())) {
                        String e2 = pileCarteEnnemis.get(0);
                        String e1 = pileCarteEnnemis.get(1);
                        OdinTire dt = new OdinTire(page, true, e2, e1);
                        dt.setLocationRelativeTo(page);
                        dt.setVisible(true);
                        int choix = dt.getChoix();
                        String ec = pileCarteEnnemis.get(choix);
                        pileCarteEnnemis.remove(ec);
                        appliquerEnnemi(page, ec);

                    } else {
                        String e1 = pileCarteEnnemis.get(0);
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

    public void jouerEnTerreBenite(JFrame page) {
        dieuActuel.jouerEnTerreBenite(tb, mg, dm, pileCarteEnnemis, tabEnnemis, fdg, page);
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

    public ArrayList<String> getPileCarteEnnemis() {
        return pileCarteEnnemis;
    }

    public Sac[] getTabSac() {
        return tabSac;
    }

    public Asgard getAs() {
        return as;
    }
    
}
