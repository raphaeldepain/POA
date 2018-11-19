package fr.parisnanterre.miage.animal;

 class Chien implements Animal{

	Chien(){}
	
	@Override
	public void effectuerBruit() {
		System.out.println("Wouf !");
		
	}

}
