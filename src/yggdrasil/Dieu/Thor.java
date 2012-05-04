/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

/**
 *
 * @author mathias
 */
/**
 * Modélise le dieu Thor
 */
public class Thor extends Dieu {

    /**
     * Son pouvoir spécial est d'avoir +1 lors des combats
     */
    private final int FORCEINITIALE = 1;

    public Thor() {
        super.setNom("Thor");
        super.setCheminImage("/images/Thor.jpg");
    }

    /**
     *
     * @return ça force
     */
    @Override
    public int getFORCEINITIALE() {
        if (Dieu.pouvoirDieu) {
            return FORCEINITIALE;
        } else {
            return super.getFORCEINITIALE();
        }
    }
}
