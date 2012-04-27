/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.Ennemis;

/**
 *
 * @author mathias
 */
public abstract class Ennemis {

    private int position;
    private String nom;

    public Ennemis() {
        this.position = 1;
    }

    public int getPosition() {
        return position;
    }

    public int getForce() {
        if (position < 3) {
            return 5;
        } else if (position < 5) {
            return 6;
        } else if (position < 8) {
            return 7;
        } else {
            return 8;
        }
    }

    public void reculer(int i) {
        position -= i;
    }

    public void avancer(int i) {
        position += i;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
