/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.*;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.Monde.*;
import yggdrasil.Pion.Vikings;

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
        Ennemis hel = new Hel();
        Ennemis jormungand = new Jormungand();
        Ennemis loki = new Loki();
        Ennemis nidhogg = new Nidhogg();
        Ennemis surt = new Surt();

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

    public void jouerEnDemeureDesElfes() {
        dieuActuel.jouerEnDemeureDesElfes(dde.getlElfes());
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

    public void jouerEnDomaineDesMort() {
        System.out.println("Quel sac choisisser vous?");
        for (int i = 0; i < tabSac.length; i++) {
            System.out.println(i + 1 + " - " + tabSac[i].getCouleur());
        }
        int choix = sc.nextInt();
        int nbViking = dm.getlViking().size();
        int nbVikRet = 0;
        for (int j = 0; j < nbViking && j < 5; j++) {
            tabSac[choix - 1].getlPion().add(new Vikings());
            dm.retirerViking();
            nbVikRet++;
        }
        System.out.println("Vous ajouter " + nbVikRet + " dans le sac" + tabSac[choix - 1].getCouleur());
    }

    public void jouerEnRoyaumeDuFeu() {
        System.out.println("Quel sac choisisser vous?");
        for (int i = 0; i < tabSac.length; i++) {
            System.out.println(i + 1 + " - " + tabSac[i].getCouleur());
        }
        int choix = sc.nextInt();
        for (int j = 0; j < 5 && tabSac[choix - 1].getlPion().size() > 0; j++) {
            Random r = new Random();
            int t1 = r.nextInt(tabSac[choix - 1].getlPion().size()) - 1;
            if (t1 < 0) {
                t1 = 0;
            }
            if ((tabSac[choix - 1].getlPion().get(t1)).toString().compareTo("Geant de feu") == 0) {
                rdf.deposer(1);
                tabSac[choix - 1].getlPion().remove(t1);
            }
        }
        System.out.println("il y a maintenant " + rdf.getlGeantDeFeu().size() + " Dans le sac choisi");
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
