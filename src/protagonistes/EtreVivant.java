package protagonistes;

import affrontement.Bataille;

public class EtreVivant {

    protected String nom;
    protected int vie;
    protected Bataille bataille;

    public EtreVivant(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    public String getNom() {
        return nom;
    }

    public String rejointBataille(Bataille bataille) {
        this.bataille = bataille;
        return "";
    }
}


