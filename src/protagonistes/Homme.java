package protagonistes;

import affrontement.Bataille;
import armes.Arme;
import armes.Epee;

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
            if (vie > 10 && arme instanceof Epee){
                texte += prendreEpee((Epee) arme);
                maPossession = arme;
                arme.setProprietaire(this);
                return texte;
            } else if (vie <= 10 && arme instanceof Epee) {
                texte += prendreEpee((Epee) arme);
                return texte;
            } else {
            maPossession = arme;
            arme.setProprietaire(this);
            return(texte + parler("Je prends " + arme.getNature() + ".\n"));
            }
        } else if (maPossession != null){
            if(arme instanceof Epee){
                prendreEpee((Epee) arme);
            }
            if (vie <= 0){
                return "";
            }
            lacher();
            maPossession = arme;
            arme.setProprietaire(this);
        return "";
        } else {
            if (vie > 10) {
                texte += (parler(arme.getProprietaire().getNom() + " peux-tu me laisser ton " + arme.getNature() + " ?\n" )+
                        arme.getProprietaire().parler("Pas de soucis, cela me permettra de repondre mon soufle.")+ "\n" +
                        arme.getProprietaire().lacher());
                if(arme instanceof Epee){
                    texte += prendreEpee((Epee) arme);
                }
            }

        arme.setProprietaire(this);
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

    public String prendreEpee(Epee epee){
        String texte = "";
        vie -= 10;

        if (vie <= 0){
            texte += (nom + " a voulu prendre l'épée mais son état de fatigue ne lui permettait pas cet ultime effort, il en est mort.\n");
            texte += mourir();
        } else {
            texte += parler("Je prends l’épée même si pour cela je dois perdre des forces. \n");
        }
        return texte;
    }

}
