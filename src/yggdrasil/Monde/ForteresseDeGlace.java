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
        pileGeantDeGivre.add(new Fafner(p.getMdt()));
        pileGeantDeGivre.add(new Angerboda());
        pileGeantDeGivre.add(new Bergelmir());
        pileGeantDeGivre.add(new Geirroed(p.getFdn()));
        pileGeantDeGivre.add(new Gialp(p.getRdf()));
        pileGeantDeGivre.add(new Greip());
        pileGeantDeGivre.add(new Gymir(p.getTb()));
        pileGeantDeGivre.add(new Hrungnir());
        pileGeantDeGivre.add(new Hrym(p.getDm()));
        pileGeantDeGivre.add(new Hymir());
        pileGeantDeGivre.add(new Skyrmir());
        pileGeantDeGivre.add(new Suttung());
        pileGeantDeGivre.add(new Thiazy(p.getDe()));
        pileGeantDeGivre.add(new Thokk());
        pileGeantDeGivre.add(new Thrym());
        pileGeantDeGivre.add(new Utgardloki(p.getDde()));

        Collections.shuffle(pileGeantDeGivre);
    }

    public void Combattre()
    {
    }

    public ArrayList<GeantDeGivre> getGeantDeffausse() {
        return geantDeffausse;
    }

    public ArrayList<GeantDeGivre> getPileGeantDeGivre() {
        return pileGeantDeGivre;
    }
    
}
