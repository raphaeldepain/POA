
public class Train {
	
	private String nom;
	private StateTrain state;
	
	public Train(String nom){
		this.nom = nom;
		this.state = new StateTrainArret(this);
	}
		
	public void ouvrirPorte(){
		
		state.ouvrirPorte();
	}
	
	public void fermerPorte(){
		
		state.fermerPorte();
	}
	
	public void demarrerTrain(){
		
		state.demarrerTrain();
	}
	
	public void arreterTrain(){
		
		state.arreterTrain();
	}
	
	public void setState(StateTrain state){
		this.state = state;
	}
	

}
