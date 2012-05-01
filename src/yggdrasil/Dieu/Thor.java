/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Dieu;

/**
 *
 * @author mathias
 */
public class Thor extends Dieu{
    private final int FORCEINITIALE =1;
    public Thor()
    {
        super.setNom("Thor");
        super.setCheminImage("/yggdrasil/vue/Thor.jpg");
    }

    @Override
    public int getFORCEINITIALE() {
        return FORCEINITIALE;
    }
    
}
