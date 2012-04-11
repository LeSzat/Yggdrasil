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
            lArtefact.put("Fenrir"+(i+1),new Artefact("Gleipnir","Fenrir",i+1));
            lArtefact.put("Hel"+(i+1),new Artefact("Draupnir","Hel",i+1));
            lArtefact.put("Jormungand"+(i+1),new Artefact("Mjöllnir","Jormungand",i+1));
            lArtefact.put("Loki"+(i+1),new Artefact("Hofund","Loki",i+1));
            lArtefact.put("Nidhogg"+(i+1),new Artefact("Gungnir","Nidhogg",i+1));
            lArtefact.put("Surt"+(i+1),new Artefact("Mimming","Surt",i+1));
        }
    }
    
    public void prendre(Dieu deus, Artefact a)
    {
        this.lArtefact.remove(a.getEnnemi()+a.getNiveau());
        deus.getlArtefact().put(a.getEnnemi()+a.getNiveau(), a);
    }
    
    public void remettre(Dieu deus,Artefact a)
    {
        this.lArtefact.put(a.getEnnemi()+a.getNiveau(),a);
        deus.getlArtefact().remove(a.getEnnemi()+a.getNiveau());
    }

    public HashMap<String, Artefact> getlArtefact() {
        return lArtefact;
    }
    
}
