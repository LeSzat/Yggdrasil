/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import java.util.ArrayList;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Elfes;

/**
 *
 * @author mathias
 */
public class DemeureDesElfes extends Monde {

    private ArrayList<Elfes> lElfes;

    public DemeureDesElfes(int nbJoueurs) {
        this.lElfes = new ArrayList<>();
        for (int i = 0; i < nbJoueurs; i++) {
            this.lElfes.add(new Elfes());
        }
    }

    public void remettreElfes(Dieu deus) {
        this.lElfes.add(new Elfes());
        deus.getlElfes().remove(0);
    }

    public void remettrerElfes(Dieu deus, int i) {
        for (i = 0; i < 8; i++) {
            this.lElfes.add(new Elfes());
            deus.getlElfes().remove(0);
        }
    }

    public void prendreElfes(Dieu deus) {
        if (lElfes.size() > 0) {
            this.lElfes.remove(0);
            deus.getlElfes().add(new Elfes());
        }
    }

    public ArrayList<Elfes> getlElfes() {
        return lElfes;
    }
}
