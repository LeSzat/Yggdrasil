/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.Scanner;
import yggdrasil.Dieu.*;
import yggdrasil.Ennemis.Ennemis;

/**
 *
 * @author mathias
 */
public class Yggdrasil {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Partie p = new Partie();
        boolean quitter = false;
        boolean arreter = false;
        while (!quitter) {
            System.out.println("Quels dieux ajouter?");
            System.out.println("1 - Odin");
            System.out.println("2 - Thor");
            System.out.println("3 - Frey");
            System.out.println("4 - Heimdall");
            System.out.println("5 - Tyr");
            System.out.println("6 - Freya");
            System.out.println("0 - Quitter");
            int choix = sc.nextInt();
            if (choix == 1) {
                p.ajouterDieu(new Odin());
            } else if (choix == 2) {
                p.ajouterDieu(new Thor());
            } else if (choix == 3) {
                p.ajouterDieu(new Frey());
            } else if (choix == 4) {
                p.ajouterDieu(new Heimdall());
            } else if (choix == 5) {
                p.ajouterDieu(new Tyr());
            } else if (choix == 6) {
                p.ajouterDieu(new Freya());
            } else {
                quitter = true;
            }
        }
        p.setDieuActuel(p.getlDieu().get(0));
        while (!arreter) {
            System.out.println("Quel monde jouer?");
            System.out.println("1 - Asgard");
            System.out.println("2 - Domaine des morts");
            int choix = sc.nextInt();
            if (choix == 1) {
                System.out.println("Quels dieux ajouter?");
                System.out.println("1 - Hell");
                System.out.println("2 - Surt");
                System.out.println("3 - Jorgumand");
                System.out.println("4 - Loki");
                System.out.println("5 - Nidhogg");
                System.out.println("6 - fenrir");
                int choix1 = sc.nextInt();
                Ennemis[] e = p.getTabEnnemis();
                p.jouerAsgard(e[choix1-1]);
            }
            else if(choix==2)
            {
                
            }
            else
                arreter = true;
        }

    }
}
