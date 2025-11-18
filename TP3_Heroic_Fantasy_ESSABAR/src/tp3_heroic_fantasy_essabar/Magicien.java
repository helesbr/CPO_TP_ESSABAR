/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_essabar;

/**
 *
 * @author helia
 */
public class Magicien extends Personnage {
   private boolean confirmé=true;

    public Magicien(String nom, int niveauDeVie, boolean confirmé) {
        super(nom, niveauDeVie);
        this.confirmé = confirmé;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    @Override
    public String toString() {
        return super.toString() + " | Confirmé : " + confirmé;
    
    }
    
    
}
