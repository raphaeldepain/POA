package fr.parisnanterre.miage.poa.universite.implem;

public class Vacataire extends EnseignantTemporaire {

    public Vacataire(String nom, String prenom, String numeroSecuriteSocial, String dateEmbauche, double salaire, String dateFin) {
        super(nom, prenom, numeroSecuriteSocial, dateEmbauche, salaire, dateFin);
    }

    @Override
    public String toString() {
        return "Vacataire{} " + super.toString();
    }
}
