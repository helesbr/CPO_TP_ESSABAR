/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_essabar;

/**
 *
 * @author helia
 */
public class Guerrier extends Personnage {
    private boolean cheval=true;

    public Guerrier(String nom, int niveauDeVie, boolean confirmé) {
        super(nom, niveauDeVie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    @Override
    public String toString() {
        return super.toString() + " | À cheval : " + cheval;
}
}
