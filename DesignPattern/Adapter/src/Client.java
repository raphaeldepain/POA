
public class Client {
	
	public static void main(String[] args){
		IUser user1 = new User();
		IUser user2 = new AdapterUser();
		
		user1.show();
		user2.show();
	}

}
