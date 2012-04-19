/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import yggdrasil.GeantDeGivre.GeantDeGivre;
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
        while(this.getForce()>i && !fdg.getPileGeantDeGivre().isEmpty())
        {
            GeantDeGivre gdg = fdg.getPileGeantDeGivre().get(0);
            gdg.activer();
            fdg.getGeantDeffausse().add(gdg);
            fdg.getPileGeantDeGivre().remove(gdg);
            
        }
    }
    
}
