package protagonistes;

public class EtreVivant {

    protected String nom;
    protected int vie;
    private String bataille;

    public EtreVivant(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    public String getNom() {
        return nom;
    }
}
