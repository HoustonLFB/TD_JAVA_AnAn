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

    public String subirAttaque(int degats){
        vie -= degats;
        String texte = this.getNom() + " subit une violente attaque ";
        if(vie <= 0){
            texte += "trop violente pour survivre.\n";
            return (texte + mourir());
        } else {
            texte += "mais il parvient à se relever.\n";
            return texte;
        }

    }

    public String mourir() {
        return "";
    }
}


