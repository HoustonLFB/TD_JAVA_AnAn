package protagonistes;

import armes.Epee;

public class Heros extends Homme {

    public Heros(String nom) {
        super(nom);
        this.vie = 150;
    }

    public String parler(String texte) {
        return("Le héros " + getNom() + " : " + texte + "\n");
    }

    public String prendreEpee(Epee epee){
        String texte = "";

        texte += parler("Je prendre " + epee.getNom() + ".");
        return texte;
    }

}
