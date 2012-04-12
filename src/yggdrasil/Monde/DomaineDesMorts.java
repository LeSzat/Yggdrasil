/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import java.util.ArrayList;
import yggdrasil.Pion.Vikings;

/**
 *
 * @author mathias
 */
public class DomaineDesMorts extends Monde {

    private ArrayList<Vikings> lViking;

    public DomaineDesMorts() {
        lViking = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lViking.add(new Vikings());
        }
    }

    public void ajouterVikings(int i) {
        for (int j = 0; j < i; j++) {
            lViking.add(new Vikings());
        }
    }
    public void retirerViking()
    {
        lViking.remove(0);
    }
    public ArrayList<Vikings> getlViking() {
        return lViking;
    }
    
}
