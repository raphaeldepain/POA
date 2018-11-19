package fr.parisnanterre.miage.client;

import fr.parisnanterre.miage.animal.*;


public class Client {
	
	public void effectuerTest(){
		AnimalFactory af = AnimalFactory.getInstance();
		AnimalFactory af2 = AnimalFactory.getInstance();
		Animal chat = af.createAnimal("chat");
		chat.effectuerBruit();
		Animal chien = af.createAnimal("chien");
		chien.effectuerBruit();
		Animal canard = af.createAnimal("canard");
		canard.effectuerBruit();
		
	}
	


		

}
