/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

/**
 * Modélise le dieu Frey
 */
public class Frey extends Dieu {

    /**
     * Son pouvoir est qu'il peut jouer fois
     */
    private final int MAXPARTIE = 4;

    /**
     * Initialise Frey
     */
    public Frey() {
        super.setNom("Frey");
        super.setCheminImage("/images/Frey.jpg");
        super.setPartieRestanteAjouer(MAXPARTIE);

    }

    /**
     * Overide de la fonction reset de Dieu
     */
    @Override
    public void reset() {
        super.reset();
        if (Dieu.pouvoirDieu) {
            super.setPartieRestanteAjouer(MAXPARTIE);
        }

    }

    /**
     * Overide de la fonction getMAXPARTIE de Dieu
     */
    @Override
    public int getMAXPARTIE() {
        if (Dieu.pouvoirDieu) {
            return MAXPARTIE;
        } else {
            return super.getMAXPARTIE();
        }
    }
}
