/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import yggdrasil.De;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.GeantDeGivre.*;
import yggdrasil.Partie;

/**
 *
 * @author mathias
 */
public class ForteresseDeGlace extends Monde {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<GeantDeGivre> pileGeantDeGivre;
    private ArrayList<GeantDeGivre> geantDeffausse;
   

    public ForteresseDeGlace(Partie p) {
        pileGeantDeGivre = new ArrayList<>();
        geantDeffausse = new ArrayList<>();
        Ennemis[] en =p.getTabEnnemis();
        pileGeantDeGivre.add(new Fafner(p.getMdt()));
        pileGeantDeGivre.add(new Angerboda((Hel)en[0]));
        pileGeantDeGivre.add(new Bergelmir());
        pileGeantDeGivre.add(new Geirroed(p.getFdn()));
        pileGeantDeGivre.add(new Gialp(p.getRdf()));
        pileGeantDeGivre.add(new Greip((Surt)en[1]));
        pileGeantDeGivre.add(new Gymir(p.getTb()));
        pileGeantDeGivre.add(new Hrungnir(p.getDde()));
        pileGeantDeGivre.add(new Hrym(p.getDm()));
        pileGeantDeGivre.add(new Hymir());
        pileGeantDeGivre.add(new Skyrmir((Fenrir)en[5]));
        pileGeantDeGivre.add(new Suttung((Loki)en[3]));
        pileGeantDeGivre.add(new Thiazy(p.getDe()));
        pileGeantDeGivre.add(new Thokk((Nidhogg)en[4]));
        pileGeantDeGivre.add(new Thrym((Jormungand) en[2]));
        pileGeantDeGivre.add(new Utgardloki());

        Collections.shuffle(pileGeantDeGivre);
    }
    public void piocherCarte()
    {
        GeantDeGivre gdg= pileGeantDeGivre.get(0);
        pileGeantDeGivre.remove(gdg);
        geantDeffausse.add(gdg);
        gdg.activer();
    }

    public ArrayList<GeantDeGivre> getGeantDeffausse() {
        return geantDeffausse;
    }

    public ArrayList<GeantDeGivre> getPileGeantDeGivre() {
        return pileGeantDeGivre;
    }
    
}
