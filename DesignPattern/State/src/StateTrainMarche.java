
public class StateTrainMarche implements StateTrain {

	Train train;
	
	public StateTrainMarche(Train train){
		this.train = train;
	}
	
	@Override
	public void ouvrirPorte() {
		throw new IllegalStateException("Le train est en marche !");

	}

	@Override
	public void fermerPorte() {
		throw new IllegalStateException("Les portes sont d�j� ferm�es !");

	}

	@Override
	public void demarrerTrain() {
		throw new IllegalStateException("Le train est d�j� en marche !");

	}

	@Override
	public void arreterTrain() {
		System.out.println("Train � l'arret");
		train.setState(new StateTrainArret(train));

	}

}
