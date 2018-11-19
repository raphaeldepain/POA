package voiture;

import java.util.Scanner;

public class Principale {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Voiture voiture;
		
		System.out.println("Etes vous en UE ou aux US ?");
		String area = sc.nextLine();
		
		if(area.equals("us")){
			voiture = new VoitureUS();
		}
		else{
			voiture = new VoitureUE();
		}
		
		Moteur moteur1 = voiture.createMoteur("V12", 250);
		
		
		Pneu pneu1 = voiture.createPneu(4, "PIRELLI");
		
		
	
		
		
	}

}
