package armes;

import protagonistes.Dragon;
import protagonistes.Homme;

public abstract class Arme {

    protected Homme proprietaire;


    protected String nature;

    protected int degats;

    public Homme getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Homme proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getNature() {
        return nature;
    }

    public Arme(String nature, int degats) {
        this.nature = nature;
        this.degats = degats;
    }

    public boolean estPris() {
        return proprietaire != null;
    }

    public void lacher() {
        proprietaire = null;
    }

    public String attaque(Dragon dragon) {
        return(proprietaire.getNom() + " attaque " + dragon.getNom() + " avec son " + nature + ".\n" + dragon.subirAttaque(degats));
    }

}

