/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import yggdrasil.Monde.ForteresseDeGlace;

/**
 *
 * @author mathias
 */
public class Loki extends Ennemis{
    public Loki()
    {
        super.setNom("Loki");
    }
    public void action(ForteresseDeGlace fdg)
    {
        this.avancer(1);
        int i=0;
        while(this.getPuissance()>i && !fdg.getPileGeantDeGivre().isEmpty())
        {
            fdg.piocherCarte();    
            i++;
        }
    }
    
}
