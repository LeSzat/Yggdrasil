/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import yggdrasil.Dieu.*;
import yggdrasil.Ennemis.Ennemis;
import yggdrasil.vue.Accueil;
import yggdrasil.vue.choixJoueur;

/**
 *
 * @author mathias
 */
public class Yggdrasil {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static JFrame page;

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Partie p = new Partie();
        page = new JFrame();
        page.setTitle("Yggdrasil");
        GraphicsEnvironment env =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        page.setExtendedState(page.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Accueil jp = new Accueil(page,p);
        
    }
}
