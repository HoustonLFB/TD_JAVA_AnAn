package protagonistes;

import affrontement.Bataille;

public class Homme extends EtreVivant{

    public Homme(String nom) {
        super(nom, 100);
    }

    public String parler(String texte) {
        return(getNom() + ":" + texte + "\n");
    }

    public String mourir() {
        return("C'est ainsi que le courageux " + getNom() + " mourut.\n" + super.bataille.eliminer(this));

    }

    public String rejointBataille(Bataille bataille){
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }

    public String subirAttaque(int degats){
        vie -= degats;
        String texte = super.getNom() + " subit une violente attaque ";
        if(vie <= 0){
            texte += "trop violente pour survivre.\n";
            return (texte +mourir());
        } else {
            texte += "mais il parvient à se relever.\n";
            return texte;
        }

    }
}
