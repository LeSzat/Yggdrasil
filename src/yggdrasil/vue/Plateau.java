package yggdrasil.vue;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author mathias
 */
public class Plateau {

    public void afficherAcceuil() throws IOException {
        JFrame page = new JFrame("Yggdrsil SIsi");

        final JPanel jp = new JPanel();
        GraphicsEnvironment env =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        page.setExtendedState(page.getExtendedState() | page.MAXIMIZED_BOTH);
        
        JLabel image = new JLabel( new ImageIcon( "plateau.jpg"));
        jp.setLayout(new BorderLayout());
        
        jp.add(image);


           
        
        page.setContentPane(jp);
        page.setVisible(true);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
