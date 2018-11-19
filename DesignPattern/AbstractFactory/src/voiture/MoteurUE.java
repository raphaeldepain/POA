package voiture;

public class MoteurUE extends Moteur {

	public MoteurUE(String nom, int cv) {
		super(nom, cv);
		this.afficher();
	}
	
	
	public void afficher(){
		System.out.println("Le moteur europeen est mis "+super.nom+" "+super.cv);
	}

}
