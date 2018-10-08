package fr.parisnanterre.miage.poa.universite.implem;

import java.util.Date;

public class Bibliothequaire extends Biatoss {

    public Bibliothequaire(String nom, String prenom, String numeroSecuriteSocial, Date dateEntree, Date dateFin, double salaire) {
        super(nom, prenom, numeroSecuriteSocial, dateEntree, dateFin, salaire);
    }

    public Bibliothequaire(String nom, String prenom, String numeroSecuriteSocial, Date dateEntree, double salaire) {
        super(nom, prenom, numeroSecuriteSocial, dateEntree, salaire);
    }

    @Override
    public String toString() {
        return "Bibliothequaire{} " + super.toString();
    }
}
