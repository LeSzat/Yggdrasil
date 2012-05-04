/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monde;

import dieu.Dieu;
import ennemis.*;
import geantdegivre.*;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JFrame;
import pion.Vikings;
import vue.ChoixDieuSigel;
import vue.EcranPrincipal;
import yggdrasil.Partie;

/**
 * Intialise le monde Forteresse de glace
 */
public class ForteresseDeGlace extends Monde {

    /**
     * pile des Géant de glace
     */
    private LinkedList<GeantDeGivre> pileGeantDeGivre;
    /**
     * pile des Géant de glace défaussé
     */
    private LinkedList<GeantDeGivre> geantDeffausse;
    /**
     * Tableau representant les morceau de la rune Sigel un booleen est vrai si
     * le géant a qui il appartient a été battu
     */
    private boolean[] runeSigel;
    /**
     * Tableau representant les morceau de la rune Mann un booleen est vrai si
     * le géant a qui il appartient a été battu
     */
    private boolean[] runeMann;
    /**
     * Tableau representant les morceau de la rune Daeg un booleen est vrai si
     * le géant a qui il appartient a été battu
     */
    private boolean[] runeDaeg;
    /**
     * Tableau representant les morceau de la rune Tiwaz un booleen est vrai si
     * le géant a qui il appartient a été battu
     */
    private boolean[] runeTiwaz;

    /**
     * Initialise le monde Forteresse de glace
     *
     * @param p La partie en cours
     */
    public ForteresseDeGlace(Partie p) {
        pileGeantDeGivre = new LinkedList<>();
        geantDeffausse = new LinkedList<>();
        runeSigel = new boolean[4];
        runeMann = new boolean[4];
        runeDaeg = new boolean[4];
        runeTiwaz = new boolean[4];
        for (boolean b : runeDaeg) {
            b = false;
        }
        for (boolean b : runeMann) {
            b = false;
        }
        for (boolean b : runeSigel) {
            b = false;
        }
        for (boolean b : runeTiwaz) {
            b = false;
        }

        Ennemis[] en = p.getTabEnnemis();
        pileGeantDeGivre.add(new Fafner(p.getMdt(), runeTiwaz[2]));
        pileGeantDeGivre.add(new Angerboda((Hel) en[0], runeSigel[0]));
        pileGeantDeGivre.add(new Bergelmir(runeMann[3]));
        pileGeantDeGivre.add(new Geirroed(p.getFdn(), runeDaeg[2]));
        pileGeantDeGivre.add(new Gialp(p.getRdf(), runeDaeg[1]));
        pileGeantDeGivre.add(new Greip((Surt) en[1], runeDaeg[0]));
        pileGeantDeGivre.add(new Gymir(p.getTb(), runeTiwaz[1]));
        pileGeantDeGivre.add(new Hrungnir(p.getDde(), runeSigel[1]));
        pileGeantDeGivre.add(new Hrym(p.getDm(), runeSigel[3]));
        pileGeantDeGivre.add(new Hymir(runeMann[2]));
        pileGeantDeGivre.add(new Skyrmir((Fenrir) en[5], runeDaeg[3]));
        pileGeantDeGivre.add(new Suttung((Loki) en[3], runeTiwaz[0]));
        pileGeantDeGivre.add(new Thiazy(p.getDe(), runeTiwaz[3]));
        pileGeantDeGivre.add(new Thokk((Nidhogg) en[4], runeMann[1]));
        pileGeantDeGivre.add(new Thrym((Jormungand) en[2], runeMann[0]));
        pileGeantDeGivre.add(new Utgardloki(runeSigel[2]));

        Collections.shuffle(pileGeantDeGivre);
    }

    /**
     * Piocher la premiere carte de la pile geant de givre active le dieu le
     * mettre dans la pile des géants défaussé
     */
    public void piocherCarte() {
        GeantDeGivre gdg = pileGeantDeGivre.get(0);
        pileGeantDeGivre.remove(gdg);
        geantDeffausse.add(gdg);
        gdg.activer();
    }

    public LinkedList<GeantDeGivre> getGeantDeffausse() {
        return geantDeffausse;
    }

    public LinkedList<GeantDeGivre> getPileGeantDeGivre() {
        return pileGeantDeGivre;
    }

    /**
     * Action de la rune Sigel
     *
     * @param page JFrame principale
     * @param partie Partie en cours
     */
    public void jouerSigel(JFrame page, Partie partie) {
        int nbVikingaDistribuer = partie.getDm().getlViking().size();
        for (int i = 0; i < nbVikingaDistribuer && i < 15; i++) {
            ChoixDieuSigel cds = new ChoixDieuSigel(page, true, partie.getlDieu());
            cds.setLocationRelativeTo(page);
            cds.setVisible(true);
            Dieu d = cds.getChoix();
            d.getlVikings().add(new Vikings());
            partie.getDm().getlViking().remove(0);
            page.getContentPane().removeAll();
            page.getContentPane().add(new EcranPrincipal(page, partie));
            page.revalidate();
        }
    }

    /**
     * Action de la rune Daeg
     *
     * @param page JFrame principale
     * @param partie Partie en cours
     */
    public void jouerDaeg(JFrame page, Partie aThis) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Action de la rune Tiwaz
     *
     * @param page JFrame principale
     * @param partie Partie en cours
     */
    public void jouerTiwaz(JFrame page, Partie aThis) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Action de la rune Mann
     *
     * @param page JFrame principale
     * @param partie Partie en cours
     */
    public void jouerMann(JFrame page, Partie aThis) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean[] getRuneDaeg() {
        return runeDaeg;
    }

    public boolean[] getRuneMann() {
        return runeMann;
    }

    public boolean[] getRuneSigel() {
        return runeSigel;
    }

    public boolean[] getRuneTiwaz() {
        return runeTiwaz;
    }
}
