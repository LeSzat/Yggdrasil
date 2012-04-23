/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.Monde.*;
import yggdrasil.Pion.Vikings;
import yggdrasil.vue.ChoixSac;

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
        this.mdt= new MondeDesTenebres();
        this.dm= new DomaineDesMorts();
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

    public void jouerAsgard(Ennemis e) {
        dieuActuel.jouerEnAsgard(e, de, dde, dm, fdn);
    }

    public void jouerEnMidgard() {
        Ile[] tabIle = mg.getTabIle();
        System.out.println("Vane est sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur() + " voulez vous le bouger? o/n");
        String choix = sc.nextLine();
        if (choix.compareTo("o") == 0) {
            System.out.println("1 - avancer");
            System.out.println("2 - reculer");
            int choix1 = sc.nextInt();
            if (choix1 == 1) {
                mg.bougerValkyrie(1);
            } else {
                mg.bougerValkyrie(-1);
            }
            System.out.println("Vane est maintenant sur l'ile " + tabIle[mg.getValkyrie().getPosition()].getCouleur());
        }

        if (mg.getValkyrie().getPosition() == 0) {
            System.out.println("Vane est sur l'ile arc en ciel, vous ne pouvez pas tirer de pion!");
        } else {
            System.out.println(dieuActuel.getClass() + " avait " + dieuActuel.getlVikings().size() + "#" + tabSac[mg.getValkyrie().getPosition() + 1].getlPion().size());
            for (int j = 0; j < 3 && j < tabSac[mg.getValkyrie().getPosition()].getlPion().size(); j++) {
                Random r = new Random();
                int t1 = r.nextInt(tabSac[mg.getValkyrie().getPosition()].getlPion().size()) - 1;
                if (t1 < 0) {
                    t1 = 0;
                }
                System.out.println(t1);
                if ((tabSac[mg.getValkyrie().getPosition()].getlPion().get(t1)).toString().compareTo("Vikings") == 0) {
                    dieuActuel.getlVikings().add(new Vikings());
                    tabSac[mg.getValkyrie().getPosition() + 1].getlPion().remove(t1);
                }
                System.out.println("Vous venez de tirer un " + tabSac[mg.getValkyrie().getPosition()].getlPion().get(t1));
            }
            System.out.println(dieuActuel.getClass() + " a maintenant " + dieuActuel.getlVikings().size() + "#" + tabSac[mg.getValkyrie().getPosition() + 1].getlPion().size());

        }
    }

    public void jouerEnForgeDesNains() {
        dieuActuel.jouerEnForgeDesNains(fdn);
    }

    public void jouerEnDemeureDesElfes(JFrame page) {
        dieuActuel.jouerEnDemeureDesElfes(dde.getlElfes(),page);
    }

    public void jouerMondeDesTenebres() {
        int i = 1;
        System.out.println("Quel dieu voulez vous aider?");
        Iterator it = lDieu.iterator();
        while (it.hasNext()) {
            Dieu d = (Dieu) it.next();
            System.out.println(i + " - " + d.getNom());
            i++;
        }
        System.out.println("Choix : ");
        int choix = sc.nextInt();
        dieuActuel.jouerMondeDesTenebres(lDieu.get(choix - 1));

    }

    public void jouerEnDomaineDesMort(JFrame page) {
        ChoixSac cs = new ChoixSac(page,true);
          cs.setLocationRelativeTo(page);
          cs.setVisible(true);
          int choix=cs.getChoix();
          if(choix>-1)
          {
            dieuActuel.jouerEnDomaineDesMort(page, tabSac[choix], dm);
          }
          
    }

    public void jouerEnRoyaumeDuFeu(JFrame page) {
         ChoixSac cs = new ChoixSac(page,true);
          cs.setLocationRelativeTo(page);
          cs.setVisible(true);
          int choix=cs.getChoix();
          if(choix>-1)
          {
            dieuActuel.jouerEnRoyaumeDuFeu(page, tabSac[choix], rdf);
          }
    }

    public void jouerEnForteresseDeGlace() {
    }

    public void jouerEnTerreBenite() {
        dieuActuel.jouerEnTerreBenite(tb, mg, dm, pileCarteEnnemis, tabEnnemis, fdg);
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
