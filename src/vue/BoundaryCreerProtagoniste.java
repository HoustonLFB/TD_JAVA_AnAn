package vue;

import controleur.ControleurCreerProtagoniste;
import protagonistes.*;

public class BoundaryCreerProtagoniste {

    ControleurCreerProtagoniste controleur;

    public BoundaryCreerProtagoniste(ControleurCreerProtagoniste controleur) {
        this.controleur = controleur;
    }

    public void creerProtagoniste() {
        int numTypeProtagoniste = 0;
        TypeEtreVivant typeEtreVivant = null;
        while (numTypeProtagoniste < 1 || numTypeProtagoniste > 3) {
            System.out.println("Quel type de personne souhaitez-vous créer ?");
            System.out.println("1 - Héros");
            System.out.println("2 - Homme");
            System.out.println("3 - Dragon");
            numTypeProtagoniste = Clavier.entrerClavierInt();

            if (numTypeProtagoniste == 1) {
                typeEtreVivant = TypeEtreVivant.HEROS;
            } else if (numTypeProtagoniste == 2) {
                typeEtreVivant = TypeEtreVivant.HOMME;
            } else if (numTypeProtagoniste == 3) {
                typeEtreVivant = TypeEtreVivant.DRAGON;
            } else {
                System.out.println("Vous devez entrer un nombre entre 1 et 3.");
            }
        }
        System.out.println("Commment souhaitez-vous l'appeler ?");
        String nom = Clavier.entrerClavierString();

        controleur.creerEtreVivant(typeEtreVivant, nom);
    }
}
