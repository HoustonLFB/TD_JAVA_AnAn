package armes;

import protagonistes.Dragon;

public class Arc extends Arme{



    private int nombreFleches;

    public Arc(int nombreFleches) {
        super("Arc", 30);
        this.nombreFleches = nombreFleches;
    }

    public int getNombreFleches() {
        return nombreFleches;
    }

    public String attaque(Dragon dragon) {
        String texte = proprietaire.getNom() + " attaque " + dragon.getNom() + " avec son " + nature + ".\n";

        if(nombreFleches == 0){
            return(texte += "Malheureusement il ne possédait plus de flèches.\n");
        } else {
            nombreFleches--;
            return(texte + dragon.subirAttaque(degats));
        }

    }
}
