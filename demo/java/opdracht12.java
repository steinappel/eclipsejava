package demo.java;

public class opdracht12 {

	public static void main(String[] args) {
		
		String[] kleur = {"Harten ", "Schoppen ", "Klaveren ", "Ruiten "};
		for (int i = 0; i < 4;i++) {
			for(int j = 1; j < 14; j++) {
				if (j==1) {
					System.out.println(kleur[i] + "Aas");
				}
				else if(j == 11) {
					System.out.println(kleur[i] + "Boer");
					
				}
				else if(j == 12) {
					System.out.println(kleur[i] + "Vrouw");
					
				}
				else if(j == 13) {
					System.out.println(kleur[i] + "Koning");
					
				}
				
				
				
				else {
					System.out.println(kleur[i] + j);
				}
				
				
				
				
			}
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
