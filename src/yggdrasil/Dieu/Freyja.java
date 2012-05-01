/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

/**
 *
 * @author mathias
 */
public class Freyja extends Dieu {

    private int aJouerEnMidgard;
    private int aJouerEnAsgard;
    private int aJoueurEnDeumeureDesElfes;
    private int aJouerEnMondeDesTenebres;
    private int aJouerEnForgeDesNains;
    private int aJouerEnForteresseDeGlace;
    private int aJouerEnRoyaumeDuFeu;
    private int aJouerEnDomaineDesMorts;
    private int aJouerEnTerreBenite;

    public Freyja() {
        super.setNom("Freyja");
        super.setCheminImage("/yggdrasil/vue/Freyja.jpg");
        aJouerEnMidgard = 0;
        aJouerEnAsgard = 0;
        aJoueurEnDeumeureDesElfes = 0;
        aJouerEnMondeDesTenebres = 0;
        aJouerEnForgeDesNains = 0;
        aJouerEnForteresseDeGlace = 0;
        aJouerEnRoyaumeDuFeu = 0;
        aJouerEnDomaineDesMorts = 0;
        aJouerEnTerreBenite = 0;
    }

    public int getaJouerEnAsgard() {
        return aJouerEnAsgard;
    }

    public void setaJouerEnAsgard(int aJouerEnAsgard) {
        this.aJouerEnAsgard = aJouerEnAsgard;
    }

    public int getaJouerEnDomaineDesMorts() {
        return aJouerEnDomaineDesMorts;
    }

    public void setaJouerEnDomaineDesMorts(int aJouerEnDomaineDesMorts) {
        this.aJouerEnDomaineDesMorts = aJouerEnDomaineDesMorts;
    }

    public int getaJouerEnForgeDesNains() {
        return aJouerEnForgeDesNains;
    }

    public void setaJouerEnForgeDesNains(int aJouerEnForgeDesNains) {
        this.aJouerEnForgeDesNains = aJouerEnForgeDesNains;
    }

    public int getaJouerEnForteresseDeGlace() {
        return aJouerEnForteresseDeGlace;
    }

    public void setaJouerEnForteresseDeGlace(int aJouerEnForteresseDeGlace) {
        this.aJouerEnForteresseDeGlace = aJouerEnForteresseDeGlace;
    }

    public int getaJouerEnMidgard() {
        return aJouerEnMidgard;
    }

    public void setaJouerEnMidgard(int aJouerEnMidgard) {
        this.aJouerEnMidgard = aJouerEnMidgard;
    }

    public int getaJouerEnMondeDesTenebres() {
        return aJouerEnMondeDesTenebres;
    }

    public void setaJouerEnMondeDesTenebres(int aJouerEnMondeDesTenebres) {
        this.aJouerEnMondeDesTenebres = aJouerEnMondeDesTenebres;
    }

    public int getaJouerEnRoyaumeDuFeu() {
        return aJouerEnRoyaumeDuFeu;
    }

    public void setaJouerEnRoyaumeDuFeu(int aJouerEnRoyaumeDuFeu) {
        this.aJouerEnRoyaumeDuFeu = aJouerEnRoyaumeDuFeu;
    }

    public int getaJouerEnTerreBenite() {
        return aJouerEnTerreBenite;
    }

    public void setaJouerEnTerreBenite(int aJouerEnTerreBenite) {
        this.aJouerEnTerreBenite = aJouerEnTerreBenite;
    }

    public int getaJoueurEnDeumeureDesElfes() {
        return aJoueurEnDeumeureDesElfes;
    }

    public void setaJoueurEnDeumeureDesElfes(int aJoueurEnDeumeureDesElfes) {
        this.aJoueurEnDeumeureDesElfes = aJoueurEnDeumeureDesElfes;
    }
    
}
