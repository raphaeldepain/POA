package voiture;

public class PneuUS extends Pneu {

	public PneuUS(String marque, int nombre) {
		super(marque, nombre);
		this.afficher();
	}
	
	public void afficher(){
		System.out.println("Les pneus americains sont mis "+super.marque+" "+super.nombre);
	}

}
