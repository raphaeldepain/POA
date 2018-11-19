package voiture;

public interface Voiture {
	
	public Moteur createMoteur(String nom, int cv);
	public Pneu createPneu(int nombre, String marque);

}
