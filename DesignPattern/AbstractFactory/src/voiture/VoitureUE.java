package voiture;

public class VoitureUE implements Voiture {
	
	public Moteur createMoteur(String nom, int cv){
		return new MoteurUE(nom, cv);
		
	}
	
	public Pneu createPneu(int nombre, String marque){
		return new PneuUE(marque, nombre);
	}

}
