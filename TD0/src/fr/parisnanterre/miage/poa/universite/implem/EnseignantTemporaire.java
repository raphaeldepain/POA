package fr.parisnanterre.miage.poa.universite.implem;

import javax.print.DocFlavor;

public abstract class EnseignantTemporaire extends Enseignant {

    private String dateFin;

    public EnseignantTemporaire(String nom, String prenom, String numeroSecuriteSocial, String dateEmbauche, double salaire, String dateFin) {
        super(nom, prenom, numeroSecuriteSocial, dateEmbauche, salaire);
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "EnseignantTemporaire{" +
                "dateFin='" + dateFin + '\'' +
                "} " + super.toString();
    }
}
