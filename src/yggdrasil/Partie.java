/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.Monde.ForgeDesNains;
import yggdrasil.Monde.Ile;
import yggdrasil.Monde.Midgard;
import yggdrasil.Monde.RoyaumeDuFeu;
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
    private Scanner sc;

    public Partie() {
        de = new De();
        this.lDieu = new ArrayList<>();
        creationEnnemis();
        creationPileEnnemis();
        creationSacs();
        this.mg = new Midgard();
        this.fdn = new ForgeDesNains();
        sc = new Scanner(System.in);
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
    }

    private void creationSacs() {
        tabSac = new Sac[4];
        tabSac[0] = new Sac("Blanc", 6, 12);
        tabSac[1] = new Sac("Bleu", 9, 9);
        tabSac[2] = new Sac("Vert", 12, 6);
        tabSac[3] = new Sac("Noir", 15, 3);
    }

    public void jouerAsgard(Ennemis e) {
        dieuActuel.jouerEnAsgard(e, de);
    }

    public void jouerEnMidgard() {
        Ile[] tabIle = mg.getTabIle();
        System.out.println("Vane est sur l'ile " + tabIle[mg.getVane().getPosition()].getCouleur() + " voulez vous le bouger? o/n");
        String choix = sc.nextLine();
        if (choix.compareTo("o") == 0) {
            System.out.println("1 - avancer");
            System.out.println("2 - reculer");
            int choix1 = sc.nextInt();
            if (choix1 == 1) {
                mg.bougerVane(1);
            } else {
                mg.bougerVane(-1);
            }
            System.out.println("Vane est maintenant sur l'ile " + tabIle[mg.getVane().getPosition()].getCouleur());
        }

        if (mg.getVane().getPosition() == 0) {
            System.out.println("Vane est sur l'ile arc en ciel, vous ne pouvez pas tirer de pion!");
        } else {
            System.out.println(dieuActuel.getClass() + " avait " + dieuActuel.getlVikings().size() + "#" + tabSac[mg.getVane().getPosition() + 1].getlPion().size());
            for (int j = 0; j < 3 && j < tabSac[mg.getVane().getPosition()].getlPion().size(); j++) {
                Random r = new Random();
                int t1 = r.nextInt(tabSac[mg.getVane().getPosition()].getlPion().size()) - 1;
                if ((tabSac[mg.getVane().getPosition()].getlPion().get(t1)).toString().compareTo("Vikings") == 0) {
                    dieuActuel.getlVikings().add(new Vikings());
                    tabSac[mg.getVane().getPosition() + 1].getlPion().remove(t1);
                }
                System.out.println("Vous venez de tirer un " + tabSac[mg.getVane().getPosition()].getlPion().get(t1));
            }
            System.out.println(dieuActuel.getClass() + " a maintenant " + dieuActuel.getlVikings().size() + "#" + tabSac[mg.getVane().getPosition() + 1].getlPion().size());

        }
    }

    public void jouerEnForgeDesNains() {
        dieuActuel.jouerEnForgeDesNains(fdn);
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
}
