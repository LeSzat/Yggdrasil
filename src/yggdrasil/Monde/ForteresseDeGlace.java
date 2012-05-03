/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import yggdrasil.Dieu.Dieu;
import yggdrasil.Ennemis.*;
import yggdrasil.GeantDeGivre.*;
import yggdrasil.Partie;
import yggdrasil.Pion.Vikings;
import yggdrasil.vue.ChoixDieuSigel;
import yggdrasil.vue.EcranPrincipal;

/**
 *
 * @author mathias
 */
public class ForteresseDeGlace extends Monde {

    private ArrayList<GeantDeGivre> pileGeantDeGivre;
    private ArrayList<GeantDeGivre> geantDeffausse;
    private boolean[] runeSigel;
    private boolean[] runeMann;
    private boolean[] runeDaeg;
    private boolean[] runeTiwaz;

    public ForteresseDeGlace(Partie p) {
        pileGeantDeGivre = new ArrayList<>();
        geantDeffausse = new ArrayList<>();
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

    public void piocherCarte() {
        GeantDeGivre gdg = pileGeantDeGivre.get(0);
        pileGeantDeGivre.remove(gdg);
        geantDeffausse.add(gdg);
        gdg.activer();
    }

    public ArrayList<GeantDeGivre> getGeantDeffausse() {
        return geantDeffausse;
    }

    public ArrayList<GeantDeGivre> getPileGeantDeGivre() {
        return pileGeantDeGivre;
    }

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
      public void jouerDaeg(JFrame page, Partie aThis) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void jouerTiwaz(JFrame page, Partie aThis) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

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
