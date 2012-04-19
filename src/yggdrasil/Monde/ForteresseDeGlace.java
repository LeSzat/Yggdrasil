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

    public void Combattre(Dieu deus, GeantDeGivre gdg, De de, DomaineDesMorts ddm, DemeureDesElfes dde)
    {
        int forcedieu = 0;
         if (!deus.getlVikings().isEmpty()) {
            System.out.println("Combien de vikings voulez vous sacrifier 0 et " + deus.getlVikings().size());

           forcedieu += sc.nextInt();
            for (int i = 0; i < forcedieu; i++) {
                deus.getlVikings().remove(0);
            }
            ddm.ajouterVikings(forcedieu);
        } else {
            System.out.println("Vous n'avez pas de vikings à sacrifier");
        }
        
        forcedieu+=de.getValeur();
        System.out.println("vous avez une force de " + forcedieu + " votre ennemi a une forece de 3");
         if (!deus.getlElfes().isEmpty()) {
            int nbElfes;
            System.out.println("Combien d'elfes voulez vous sacrifier entre 0 et " + deus.getlElfes().size());
            nbElfes = sc.nextInt();
            forcedieu+=nbElfes;
            for (int i = 0; i < nbElfes; i++) {
                deus.getlElfes().remove(0);
            }
            dde.remettreElfes(deus, nbElfes);
        }
         if (forcedieu >= 3) {
            System.out.println("Vous avez gagné!!");
            gdg.desactiver();
        } else {
            System.out.println("Vous avez perdu!");
        } 
    }

    public ArrayList<GeantDeGivre> getGeantDeffausse() {
        return geantDeffausse;
    }

    public ArrayList<GeantDeGivre> getPileGeantDeGivre() {
        return pileGeantDeGivre;
    }
    
}
