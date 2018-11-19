
public class StateTrainArret implements StateTrain {
	
	Train train;
	private boolean isOpenGate = false;
	
	public StateTrainArret(Train train){
		this.train = train;
	}

	@Override
	public void ouvrirPorte() {
		System.out.println("Portes ouvertes !");
		isOpenGate = true;
		
	}

	@Override
	public void fermerPorte() {
		System.out.println("Portes ferm�es !");
		isOpenGate = false;
		
	}

	@Override
	public void demarrerTrain() {
		if(isOpenGate)
			throw new IllegalStateException("Il faut fermer les portes");
		else{
		System.out.println("Train en marche");
			train.setState(new StateTrainMarche(train));
		}
		
	}

	@Override
	public void arreterTrain() {
		throw new IllegalStateException("Le train est d�ja � l'arret");
		
	}

}
