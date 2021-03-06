package fr.parisnanterre.miage.animal;

public class AnimalFactory {
	private static AnimalFactory uniqueInstance;  //Singleton
	
	/*
	 * Creation d'un constructeur sp�cial singleton
	 */
	public static AnimalFactory getInstance(){					
		if(uniqueInstance == null){
			uniqueInstance = new AnimalFactory();
			System.out.println("Creation de l'unique instance");
		}
		return uniqueInstance;
	}
	
	private AnimalFactory(){}
	
	public Animal createAnimal(String type){
		Animal animal = null;
		if(type.equals("chat")){
			animal = new Chat();
		}else if(type.equals("chien")){
			animal = new Chien();
		}else if(type.equals("canard")){
			animal = new Canard();
		}else{
			System.out.println("L'animal est vide");
		}
		return animal;
		
	}

}
