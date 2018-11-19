
public class AdapterUser implements IUser {

	Utente utente = new Utente();
	@Override
	public void show() {
		utente.visualizzare();		
	}
	
}
