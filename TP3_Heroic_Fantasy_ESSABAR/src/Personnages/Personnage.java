/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import tp3_heroic_fantasy_essabar.EtreVivant;
import Armes.Arme;
import java.util.ArrayList;
import Armes.Baton;
import Armes.Epee;

/**
 *
 * @author helia
 */
public abstract class Personnage implements EtreVivant {

    String nom;
    int niveauDeVie;
    Arme armeActuelle = null;
    int nbPerso = 0;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        nbPerso++;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    public ArrayList<Arme> nbArmes = new ArrayList<>();

    public boolean ajouterArme(Arme nouvelle) {
        if (nbArmes.size() < 5) {
            nbArmes.add(nouvelle);
            return true;
        } else {
            System.out.println("Impossible d'ajouter plus de 5 armes");
            return false;
        }
    }

    public void Arme_en_Main(Arme armeActuelle) {
        this.armeActuelle = armeActuelle;
    }

    public Arme getArmeActuelle() {
        return armeActuelle;
    }

    public void equiperArme(String nomArme) {
        boolean trouve = false;
        for (Arme a : nbArmes) {
            if (a.getNom().contains(nomArme)) {
                armeActuelle = a;
                System.out.println("Arme trouvee et affectee");
                trouve = true;
                break;
            }
        }

    }

    public void attaquer(Personnage ciblee) {
        int points = 0;
        int age = armeActuelle.getAge();
        int finesse = armeActuelle.getFinesse();
        if (this instanceof Magicien && armeActuelle instanceof Baton) {
            points = armeActuelle.getNiveauAttaque();
            points *= age;
        } else if (this instanceof Guerrier && armeActuelle instanceof Epee) {
            points = armeActuelle.getFinesse();
            points *= finesse;
        }
        if ((this instanceof Magicien && ((Magicien) this).isConfirme())
                || (this instanceof Guerrier && ((Guerrier) this).isCheval())) {
            points /= 2;
            ciblee.estAttaque(points);
            this.seFatiguer();
        }

    }

    @Override
    public String toString() {
        String infoArme;
        if (armeActuelle != null) {
            infoArme = armeActuelle.toString();
        } else {
            infoArme = "aucune";
        }
        return "Personnage : " + nom + " | Niveau de vie : " + niveauDeVie + " Arme en main " + infoArme;
    }

    @Override
    public void finalize() throws Throwable {
        nbPerso--;
        super.finalize();
    }

    @Override
    public void seFatiguer() {
        niveauDeVie -= 10;
    }

    @Override
    public boolean estVivant() {
        if (niveauDeVie > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void estAttaque(int points) {
        niveauDeVie -= points;
    }

}
