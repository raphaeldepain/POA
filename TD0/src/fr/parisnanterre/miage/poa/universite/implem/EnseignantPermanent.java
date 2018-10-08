package fr.parisnanterre.miage.poa.universite.implem;

public abstract class EnseignantPermanent extends Enseignant {
    private String domaineRecherche;

    public EnseignantPermanent(String nom, String prenom, String numeroSecuriteSocial, String dateEmbauche, double salaire, String domaineRecherche) {
        super(nom, prenom, numeroSecuriteSocial, dateEmbauche, salaire);
        this.domaineRecherche = domaineRecherche;
    }

    @Override
    public String toString() {
        return "EnseignantPermanent{" +
                "domaineRecherche='" + domaineRecherche + '\'' +
                "} " + super.toString();
    }
}
