package voiture;

public class MoteurUS extends Moteur {

	public MoteurUS(String nom, int cv) {
		super(nom, cv);
		this.afficher();
		
	}
	
	public void afficher(){
		System.out.println("Le moteur americain est mis"+super.nom+" "+super.cv);
	}
	
	

}
