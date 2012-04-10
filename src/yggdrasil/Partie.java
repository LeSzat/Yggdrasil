/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.ArrayList;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Dieu.Odin;
import yggdrasil.Ennemis.*;

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

    public Partie() {
        de = new De();
        this.lDieu = new ArrayList<>();
        creationEnnemis();
        creationPileEnnemis();
        creationSacs();
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
        tabSac[0] = new Sac("blanc", 6, 12);
        tabSac[1] = new Sac("bleu", 9, 9);
        tabSac[2] = new Sac("vert", 12, 6);
        tabSac[3] = new Sac("blanc", 15, 3);
    }

     public void jouerAsgard(Ennemis e) {
        dieuActuel.jouerEnAsgard(e, de);
    }
     public void jouerDomaineDesMorts()
     {
         
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
