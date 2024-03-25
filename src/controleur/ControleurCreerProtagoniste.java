package controleur;

import protagonistes.*;

public class ControleurCreerProtagoniste {
    StockEtreVivant stockEtreVivant;

    public ControleurCreerProtagoniste(StockEtreVivant stockEtreVivant) {
        this.stockEtreVivant = stockEtreVivant;
    }

    public void creerEtreVivant(TypeEtreVivant type, String nom) {
        switch (type) {
            case HOMME:
                Homme homme = new Homme(nom);
                stockEtreVivant.ajouterHomme(homme);
                break;
            case HEROS:
                Heros heros = new Heros(nom);
                stockEtreVivant.ajouterHeros(heros);
                break;
            case DRAGON:
                Dragon dragon = new Dragon(nom);
                stockEtreVivant.ajouterDragon(dragon);
                break;
        }
    }
}
