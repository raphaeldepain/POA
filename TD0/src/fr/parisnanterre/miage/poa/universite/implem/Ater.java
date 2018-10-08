package fr.parisnanterre.miage.poa.universite.implem;

public class Ater extends EnseignantTemporaire {

    public Ater(String nom, String prenom, String numeroSecuriteSocial, String dateEmbauche, double salaire, String dateFin) {
        super(nom, prenom, numeroSecuriteSocial, dateEmbauche, salaire, dateFin);
    }

    @Override
    public String toString() {
        return "Ater{} " + super.toString();
    }
}
