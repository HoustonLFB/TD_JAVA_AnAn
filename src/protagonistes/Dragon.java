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
