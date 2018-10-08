package fr.parisnanterre.miage.poa.universite.implem;

public abstract class Enseignant extends Personnel {
    private String dateEmbauche;
    private double salaire;

    public Enseignant(String nom, String prenom, String numeroSecuriteSocial, String dateEmbauche, double salaire) {
        super(nom, prenom, numeroSecuriteSocial);
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "dateEmbauche='" + dateEmbauche + '\'' +
                ", salaire=" + salaire +
                "} " + super.toString();
    }
}
