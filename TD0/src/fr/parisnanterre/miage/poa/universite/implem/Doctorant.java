package fr.parisnanterre.miage.poa.universite.implem;

public class Doctorant extends Etudiant {

    public Doctorant(String nom, String prenom, String numeroSecuriteSocial, String bourse) {
        super(nom, prenom, numeroSecuriteSocial, bourse);
    }

    @Override
    public String toString() {
        return "Doctorant{} " + super.toString();
    }
}

