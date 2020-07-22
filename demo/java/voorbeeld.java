package demo.java;

public class voorbeeld {

	public static void main(String[] args) {
		int a; //declaratie
		a = 36; //initalizatie
		
		Plant mijnPlant;
		mijnPlant = new Plant(); 			//constructor aanroep
		mijnPlant.soort = "Cactus";
		mijnPlant.Fotosynthese(9);
		mijnPlant.Fotosynthese(3);
		
		System.out.println("hij doet het "+ mijnPlant.bladgroenkorrels);
		// TODO Auto-generated method stub

	}

}

class Roos extends Plant{		//roos is a plant
	int aantalDoorns;
}

class Plant{
	String soort;
	int bladgroenkorrels;
	
	void Fotosynthese(int a){
		bladgroenkorrels += a;
		System.out.println("Ik ben lekker aan het fotosynthetiseren");
		
	}
	
}