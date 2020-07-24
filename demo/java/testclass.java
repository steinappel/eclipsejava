package demo.java;

public class testclass {
	public static void main(String[] args) {
		
		Supermarkt supermarkt = new Supermarkt();		
		supermarkt.hetProduct = new Product("Kaas", 500);
		Klant klant = new Klant();
		klant.naam= "Piet";
		klant.dinero = 900;
		
		System.out.println(klant.dinero);
		
		supermarkt.verkopen(klant);
		supermarkt.verkopen(klant);
		
		System.out.println(klant.dinero);
		
		Klant klant2=new Klant();
		klant.naam= "Johan";
		klant.dinero = 1700;
		
		System.out.println(klant2.dinero);
		System.out.println(klant2.dinero);
		
		supermarkt.verkopen(klant2);
		supermarkt.verkopen(klant2);
		
		System.out.println(klant2.dinero);
		
		
	}	
}


class Klant{
	String naam;
	int dinero;
}

class Supermarkt{
	Product hetProduct;
	void verkopen(Klant klant) {
		System.out.println("Welkom "+klant.naam+" in onze geweldige supermarkt");
		System.out.println("Wij verkopen "+ hetProduct.naamf );
		if(klant.dinero >= hetProduct.prijsf) {
			klant.dinero -= hetProduct.prijsf;	
			System.out.println("bedankt");
		}
		else {
			System.out.println("pakdedief");
		}
		
	}
}

class Product{
	String naamf;
	int prijsf;
	Product(String naam, int prijs){
		naamf = naam;
		prijsf = prijs;
		
	}
}