package demo.java;

public class Demo {

	public static void main(String[] args) {
	System.out.println("Hello World"); //syso enter
	
	// primitive types
	byte getal1;		//8 bits
	short getal3;	//16 bits
	int getal;		//32 bits
	long getal2;	//64 bits
	
	char getal5; 	//asci table karakter
	
	float kommagetal= 50.4f; 	//32 bits
	double kommagetal2= 50.5;		//64 bits
	
	boolean keuze= true;
	
	//declareren
	int a;
	//initializeren
	int b= 24;
	//instantieren
	
	Auto mijnAuto;
	
	mijnAuto= new Auto();
	mijnAuto.kleur = "Rood";
	mijnAuto.snelheid = 25;
	
	mijnAuto.rijden(34);
	
	Auto zijnAuto= new Auto();
	zijnAuto.kleur = "Groen";
	
	
	Mens mijnMens;
	mijnMens = new Mens("Marie");
	mijnMens.rondrennen();
	int uitkomst = mijnMens.geefgetalonderdetien() + mijnMens.geefgetalonderdetien();
	System.out.println(uitkomst);
	System.out.println("===============");
	// de aanroep van een methode, kan vervangen worden door datgene wat hij returnt.
			
	mijnMens.koopautovoormij().rijden(24);
	System.out.println("===============");
	
	Auto auto = new Auto();
	auto.rijden(25);
		// TODO Auto-generated method stub
	
	}

}
class Mens{
	String naam;
	
	Mens(){
		System.out.println("LET OP er wordt een mens gemaakt");
	}
	Mens(String voornaam){
		naam = voornaam;
	}
	
	void rondrennen() {
		System.out.println("Ja hij rent echt rond " +naam);
	}
	int geefgetalonderdetien() {
		System.out.println("verzint getal onder de tien "+naam);
		return 6;
	}
	Auto koopautovoormij(){
		System.out.println("Ik koop een auto voor " +naam);
		return new Auto();
	}
}

class Auto{
	String kleur = "blauw";
	int snelheid;
	
	void rijden( int go){			//methode start altijd met returntype
		System.out.println("meegegeven is"+go);
		System.out.println("De auto is aan het rijden in de kleur" + kleur+ "met de snelheid" + snelheid);
	}
	
	
}

//methode start altijd met returntype

//field property attribuut


//variable
//primitive 		basale waarden 	literal vullen	totaal 8, niet zelf bijmaken
//object of reference type 		groepen waarden

//String 	Wrappers

//strongly typed, van welk type is de variabele moet vaststaan JAVA
//compiler		 	gecompileerde talen 			.class

//gecompileerde talen zijn streng moeilijk				-java
//Niet gecompileerde talen niet streng maar makkelijk	-javascript

