package fr.parisnanterre.miage.poa.universite.implem;

public class Etudiant extends Personnel {

    private String bourse;

    public Etudiant(String nom, String prenom, String numeroSecuriteSocial, String bourse) {
        super(nom, prenom, numeroSecuriteSocial);
        this.bourse = bourse;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "bourse='" + bourse + '\'' +
                "} " + super.toString();
    }
}
