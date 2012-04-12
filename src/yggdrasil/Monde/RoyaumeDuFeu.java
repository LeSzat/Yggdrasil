/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Monde;

import java.util.ArrayList;
import yggdrasil.Pion.GeantDeFeu;

/**
 *
 * @author mathias
 */
public class RoyaumeDuFeu {
    private ArrayList<GeantDeFeu> lGeantDeFeu;
    
    public RoyaumeDuFeu()
    {
        this.lGeantDeFeu = new ArrayList<>();
        for(int i=0;i<12;i++)
        {
            lGeantDeFeu.add(new GeantDeFeu());
        }
                
    }
    public void deposer(int i)
    {
        for(int j= 0; j<i ;j++)
        {
            lGeantDeFeu.add(new GeantDeFeu());
        }
    }
    public void prendre()
    {
        
    }

    public ArrayList<GeantDeFeu> getlGeantDeFeu() {
        return lGeantDeFeu;
    }
    
}
