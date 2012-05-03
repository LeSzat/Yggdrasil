/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

/**
 *
 * @author mathias
 */
public class Frey extends Dieu {

    private final int MAXPARTIE = 4;

    public Frey() {
        super.setNom("Frey");
        super.setCheminImage("/yggdrasil/vue/Frey.jpg");
        super.setPartieRestanteAjouer(MAXPARTIE);

    }

    @Override
    public void reset() {
        if (Dieu.pouvoirDieu) {
            super.setPartieRestanteAjouer(MAXPARTIE);
        } else {
            super.reset();
        }
    }

    @Override
    public int getMAXPARTIE() {
        if (Dieu.pouvoirDieu) {
            return MAXPARTIE;
        } else {
            return super.getMAXPARTIE();
        }
    }
}
