package fr.parisnanterre.miage.poa.universite.implem;

public class Professeur extends EnseignantPermanent {

    public Professeur(String nom, String prenom, String numeroSecuriteSocial, String dateEmbauche, double salaire, String domaineRecherche) {
        super(nom, prenom, numeroSecuriteSocial, dateEmbauche, salaire, domaineRecherche);
    }

    @Override
    public String toString() {
        return "Professeur{} " + super.toString();
    }
}
