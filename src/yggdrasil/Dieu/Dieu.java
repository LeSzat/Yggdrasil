/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

import java.util.ArrayList;
import yggdrasil.Artefact;
import yggdrasil.Elfes;
import yggdrasil.Monde.Asgard;
import yggdrasil.Pion.Vikings;

/**
 *
 * @author mathias
 */
public abstract class Dieu {

    private ArrayList<Vikings> lVikings;
    private ArrayList<Elfes> lElfes;
    private ArrayList<Artefact> lArtefact;

    protected Dieu() {
        lVikings = new ArrayList<>();
        lElfes = new ArrayList<>();
        lArtefact = new ArrayList<>();
    }

    public void jouerEnAsgard() {
        Asgard as = new A
    }

    public void jouerEnMidgard() {
    }

    public void jouerEnForgeDesNains() {
    }

    public void jouerEnDemeureDesElefes() {
    }

    public void jouerMondeDesTenebres() {
    }

    public void jouerEnDomaineDesMorts() {
    }

    public void jouerEnRoyaumeDuFeu() {
    }

    public void jouerEnForteresseDeGlace() {
    }

    public void jouerEnTerreBenite() {
    }

    public ArrayList<Artefact> getlArtefact() {
        return lArtefact;
    }

    public ArrayList<Elfes> getlElfes() {
        return lElfes;
    }
}
