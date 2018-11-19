package voiture;

public class VoitureUS implements Voiture {
	
	public Moteur createMoteur(String nom, int cv){
		return new MoteurUS(nom, cv);
		
	}
	
	public Pneu createPneu(int nombre, String marque){
		return new PneuUS(marque, nombre);
	}

}
