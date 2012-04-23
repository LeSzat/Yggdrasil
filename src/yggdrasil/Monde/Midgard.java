/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import yggdrasil.Valkyrie;

/**
 *
 * @author mathias
 */
public class Midgard extends Monde{
    private Valkyrie valkyrie;
    private Ile[] tabIle;
    
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
