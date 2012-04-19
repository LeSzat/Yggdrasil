/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

import java.util.Iterator;
import yggdrasil.De;
import yggdrasil.Monde.RoyaumeDuFeu;
import yggdrasil.Pion.GeantDeFeu;
import yggdrasil.Pion.Pion;
import yggdrasil.Sac;

/**
 *
 * @author mathias
 */
public class Surt extends Ennemis{
    private De de;
    public Surt(De de)
    {
        super.setNom("Surt");
        this.de=de;
    }
     public void action(Sac[] tabSacs, RoyaumeDuFeu rdf) {
        this.avancer(1);
        int k = 0;
        Sac s = tabSacs[de.getCouleur()];        
        int nbGeantDeFeu = rdf.getlGeantDeFeu().size();
        while (k < this.getForce() && k < nbGeantDeFeu) {
            Iterator it = s.getlPion().iterator();
            Pion p;
            int nb = 0;
            while (it.hasNext()) {
                p = (Pion) it.next();
                if (p.toString().compareTo("Geant de feu") == 0) {
                    rdf.getlGeantDeFeu().remove((GeantDeFeu)p);
                    s.getlPion().add(new GeantDeFeu());
                }
                
            }
            
        }
     }
}
