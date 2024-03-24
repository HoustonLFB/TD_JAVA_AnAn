package protagonistes;

import affrontement.Bataille;

public class Dragon extends EtreVivant{

    public Dragon(String nom) {

        super(nom, 200);
    }

    public String mourir() {
        return("C'est ainsi que le dragon " + getNom() + " mourut.\n" + super.bataille.eliminer(this));
    }

    public String rejointBataille(Bataille bataille){
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }
}
