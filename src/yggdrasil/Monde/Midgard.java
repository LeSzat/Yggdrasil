/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import yggdrasil.Vane;

/**
 *
 * @author mathias
 */
public class Midgard extends Monde{
    private Vane vane;
    private Ile[] tabIle;
    
    public Midgard()
    {
        tabIle = new Ile[5];
        tabIle[0]=new Ile("Arc en ciel");
        tabIle[1]=new Ile("Blanc");
        tabIle[2]=new Ile("Bleu");
        tabIle[3]=new Ile("Vert");
        tabIle[4]=new Ile("Noir");
        this.vane= new Vane();
    }
    public void bougerVane(int mov)
    {
        vane.setPosition(mov);
    }

    public Vane getVane() {
        return vane;
    }

    public Ile[] getTabIle() {
        return tabIle;
    }
    
}
