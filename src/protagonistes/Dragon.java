package protagonistes;

import affrontement.Bataille;

public class Dragon extends EtreVivant{

    private int bouleTiree;

    public Dragon(String nom) {

        super(nom, 200);
        bouleTiree = 0;
    }

    public String mourir() {
        return("C'est ainsi que le dragon " + getNom() + " mourut.\n" + super.bataille.eliminer(this));
    }

    public String rejointBataille(Bataille bataille){
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }



    public String cracheBouleFeu(Homme homme){
        if (bouleTiree < 10) {
            bouleTiree++;
            return(nom + " crache une boule de feu sur " + homme.getNom() + ".\n" + homme.subirAttaque(100));
        } else {
            return (nom + " a voulu attaquer " + homme.getNom() + " mais il n'avait plus de feu en lui.\n" + homme.getNom() + " a eu beaucoup de chance.\n");
        }
    }
}
