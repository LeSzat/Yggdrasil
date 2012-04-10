/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import java.util.HashMap;
import yggdrasil.Artefact;
import yggdrasil.Dieu.Dieu;

/**
 *
 * @author mathias
 */
public class ForgeDesNains extends Monde{
    HashMap<String,Artefact> lArtefact;
    
    public ForgeDesNains()
    {
        this.lArtefact = new HashMap<>();
        for(int i=0;i<2;i++)
        {
            lArtefact.put("Fenrir",new Artefact("Gleipnir","Fenrir",i+1));
            lArtefact.put("Hel",new Artefact("Draupnir","Hel",i+1));
            lArtefact.put("Jorgumand",new Artefact("Mjöllnir","Jorgumand",i+1));
            lArtefact.put("Loki",new Artefact("Hofund","Loki",i+1));
            lArtefact.put("Nidhogg",new Artefact("Gungnir","Nidhogg",i+1));
            lArtefact.put("Surt",new Artefact("Mimming","Surt",i+1));
        }
    }
    
    public void prendre(Dieu deus, Artefact a)
    {
        this.lArtefact.remove(a.getNom());
        deus.getlArtefact().add(a);
    }
    
    public void remettre(Dieu deus,Artefact a)
    {
        this.lArtefact.put(a.getNom(),a);
        deus.getlArtefact().remove(a);
    }
}
