package protagonistes;

public class Heros extends EtreVivant {

    public Heros(String nom) {
        super(nom, 150);
    }

    public String parler(String texte) {
        return("Le héros " + getNom() + ":" + texte + "\n");
    }

}
