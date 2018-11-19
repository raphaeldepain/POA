
public class Client {
	
	public static void main(String[] args){
		
		Train train = new Train("TGV");
		train.fermerPorte();
		train.ouvrirPorte();
//		train.demarrerTrain();
		train.fermerPorte();
		train.demarrerTrain();
//		train.ouvrirPorte();
//		train.fermerPorte();
		train.arreterTrain();
		train.ouvrirPorte();
		
	}
	

}
