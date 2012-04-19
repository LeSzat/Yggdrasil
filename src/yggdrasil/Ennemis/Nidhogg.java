/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import java.util.ArrayList;

/**
 *
 * @author mathias
 */
public class Nidhogg extends Ennemis {

    public Nidhogg() {
        super.setNom("Nidhogg");
    }

    public void action(ArrayList<Ennemis> lEnnemis) {
        this.avancer(1);
        int pos = 100;
        int ind = 100;
        for (int i = 0; i < lEnnemis.size(); i++) {
            if (lEnnemis.get(i).getPosition() < pos) {
                pos = lEnnemis.get(i).getPosition();
                ind = i;
            }
        }
        lEnnemis.get(ind).avancer(1);
    }
}
