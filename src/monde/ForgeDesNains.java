/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import artefact.Artefact;
import dieu.Dieu;
import java.util.HashMap;

/**
 *Modélise le Monde Forge des Nains
 */
public class ForgeDesNains extends Monde {

    /**
     * HashMap contenant les artefacts disponibles dans la forge 
     */
    HashMap<String, Artefact> lArtefact;

    /**
     * Initialise le Monde Forge des nains(crée la liste des Artefacts)
     */
    public ForgeDesNains() {
        this.lArtefact = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            lArtefact.put("Fenrir" + (i + 1), new Artefact("Gleipnir", "Fenrir", i + 1));
            lArtefact.put("Hel" + (i + 1), new Artefact("Draupnir", "Hel", i + 1));
            lArtefact.put("Jormungand" + (i + 1), new Artefact("Mjöllnir", "Jormungand", i + 1));
            lArtefact.put("Loki" + (i + 1), new Artefact("Hofund", "Loki", i + 1));
            lArtefact.put("Nidhogg" + (i + 1), new Artefact("Gungnir", "Nidhogg", i + 1));
            lArtefact.put("Surt" + (i + 1), new Artefact("Mimming", "Surt", i + 1));
        }
    }

    /**
     * Prendre un artefact
     * @param deus Le dieu qui prend l'artefact
     * @param a L'artefact choisi
     */
    public void prendre(Dieu deus, Artefact a) {
        this.lArtefact.remove(a.getEnnemi() + a.getNiveau());
        deus.getlArtefact().put(a.getEnnemi() + a.getNiveau(), a);
    }

    /**
     * Remettre un artefact
     * @param deus Le dieu qui a utilisé l'artefact
     * @param a L'artefact utilisé
     */
    public void remettre(Dieu deus, Artefact a) {
        this.lArtefact.put(a.getEnnemi() + a.getNiveau(), a);
        deus.getlArtefact().remove(a.getEnnemi() + a.getNiveau());
    }

    public HashMap<String, Artefact> getlArtefact() {
        return lArtefact;
    }
}
