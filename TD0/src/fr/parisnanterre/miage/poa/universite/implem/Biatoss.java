package fr.parisnanterre.miage.poa.universite.implem;

import java.util.Date;

public class Biatoss extends Personnel {

    private Date dateEntree;
    private Date dateFin;
    private double salaire;

    public Biatoss(String nom, String prenom, String numeroSecuriteSocial, Date dateEntree, Date dateFin, double salaire) {
        super(nom, prenom, numeroSecuriteSocial);
        this.dateEntree = dateEntree;
        this.dateFin = dateFin;
        this.salaire = salaire;
    }

    public Biatoss(String nom, String prenom, String numeroSecuriteSocial, Date dateEntree, double salaire) {
        super(nom, prenom, numeroSecuriteSocial);
        this.dateEntree = dateEntree;
        this.salaire = salaire;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
