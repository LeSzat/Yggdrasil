/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import iles.Ile;
import pion.Valkyrie;

/**
 *Modélise le monde Midgard
 */
public class Midgard extends Monde{
    /**
     * La valkyrie du jeu
     */
    private Valkyrie valkyrie;
    /**
     * Tableau contenant les iles de midgard
     */
    private Ile[] tabIle;
    
    /**
     * Intitialise le Monde Midgard
     */
    public Midgard()
    {
        tabIle = new Ile[5];
        tabIle[0]=new Ile("Arc en ciel");
        tabIle[1]=new Ile("Blanc");
        tabIle[2]=new Ile("Bleu");
        tabIle[3]=new Ile("Vert");
        tabIle[4]=new Ile("Noir");
        tabIle[4].setSubmergee(true);
        this.valkyrie= new Valkyrie();
    }
    /**
     * Avancer ou reculer la valkyrie
     * @param mov 1 pour avancer, -1 pour reculer 
     */
    public void bougerValkyrie(int mov)
    {
        valkyrie.setPosition(mov);
    }

    public Valkyrie getValkyrie() {
        return valkyrie;
    }

    public Ile[] getTabIle() {
        return tabIle;
    }
    
}
