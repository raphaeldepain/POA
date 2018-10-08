package fr.parisnanterre.miage.poa.universite.implem;

public abstract class Personnel {
    private String nom;
    private String prenom;
    private String numeroSecuriteSocial;


    public Personnel(String nom, String prenom, String numeroSecuriteSocial) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSecuriteSocial = numeroSecuriteSocial;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroSecuriteSocial='" + numeroSecuriteSocial + '\'' +
                '}';
    }
}
