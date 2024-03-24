package protagonistes;

import affrontement.Bataille;
import armes.Arme;

public class Homme extends EtreVivant{

    private Arme maPossession;

    public Homme(String nom) {
        super(nom, 100);
    }

    public String parler(String texte) {
        return(getNom() + " : " + texte);
    }

    public String mourir() {
        if (maPossession != null){
            maPossession.setProprietaire(null);
            maPossession = null;
        }
        return("C'est ainsi que le courageux " + getNom() + " mourut.\n" + super.bataille.eliminer(this));

    }

    public String rejointBataille(Bataille bataille){
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }

    public String lacher(){
        String texte = "";
        if (maPossession != null){
            texte = (getNom() + " a lâché son " + maPossession.getNature() + ".\n");
            maPossession.setProprietaire(null);
            maPossession = null;
        } else {
            texte = "Personne ne peut lacher cette arme car personne ne la possède.\n";
        }
        return texte;
    }

    public String prendre(Arme arme){
        String texte = "";
        if (maPossession == null && arme.getProprietaire() == null){
            maPossession = arme;
            arme.setProprietaire(this);
            return(parler("Je prends " + arme.getNature() + ".\n"));
    } else if (maPossession != null){
            lacher();
            maPossession = arme;
            arme.setProprietaire(this);
        return "";
    } else {
            texte = (parler(arme.getProprietaire().getNom() + " peux-tu me laisser ton " + arme.getNature() + " ?\n " )+
        arme.getProprietaire().parler("Pas de soucis, cela me permettra de repondre mon soufle. \n") +
        arme.getProprietaire().lacher() + prendre(arme));
        maPossession = arme;

        return texte;
    }
    }

    public String combattre(Dragon dragon){
        String texte = "";
        if (maPossession == null){
            texte = getNom() + " s'attaque sans aucune arme à " + dragon.getNom() + ".\n" + mourir();
        } else {
            texte = maPossession.attaque(dragon);
        }
        return texte;
    }

}
