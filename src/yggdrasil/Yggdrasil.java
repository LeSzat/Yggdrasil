/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.io.IOException;
import javax.swing.JFrame;
import yggdrasil.vue.Accueil;

/**
 *Lance le jeu
 */
public class Yggdrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Partie p = new Partie();
        JFrame page = new JFrame();
        page.setTitle("Yggdrasil");
        page.setExtendedState(page.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Accueil accueil = new Accueil(page,p);
        
    }
}
