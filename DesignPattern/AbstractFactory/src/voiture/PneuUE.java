package voiture;

public class PneuUE extends Pneu {
	


	public PneuUE(String marque, int nombre) {
		super(marque, nombre);
		this.afficher();
	}
	
	
	public void afficher(){
		System.out.println("Les pneus europeens sont mis "+super.marque+" "+super.nombre);
	}

}
